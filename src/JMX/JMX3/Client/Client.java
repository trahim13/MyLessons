package JMX.JMX3.Client;

import JMX.JMX3.HelloMBean;

import javax.management.*;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Set;
import java.util.TreeSet;

public class Client {
    public static void main(String[] args) throws IOException, MalformedObjectNameException, InstanceNotFoundException, InterruptedException {
        JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://:3434/jmxrmi");
        JMXConnector jmxConnector = JMXConnectorFactory.connect(url, null);
        MBeanServerConnection mBeanServerConnection = jmxConnector.getMBeanServerConnection();

        ObjectName name = new ObjectName("JMX.JMX3:type=Hello");
        mBeanServerConnection.addNotificationListener(name, new ClientListener(), null, null);
        HelloMBean helloMBean = JMX.newMBeanProxy(mBeanServerConnection, name, HelloMBean.class, true);

        helloMBean.sayHello();
        Thread.sleep(100);

        System.out.println(helloMBean.addIntegers(10, 32));
        helloMBean.setName("Petrov");
        System.out.println(helloMBean.getName());

        System.out.println(helloMBean.returnPerson().getName());

        String[] domain = mBeanServerConnection.getDomains();
        for (String a :
                domain) {
            System.out.println("Domain = " + a);
        }

        System.out.println("Default domain = " + mBeanServerConnection.getDefaultDomain());

        System.out.println("MBeanCount = " + mBeanServerConnection.getMBeanCount());

        System.out.println("Query MBeans");
        Set<ObjectName> names = new TreeSet<ObjectName>(mBeanServerConnection.queryNames(null, null));
        for (ObjectName name1 :
                names) {
            System.out.println("Object name - " + name1);

        }
    }
}
