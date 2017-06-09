package JMX.JMX2;

import javax.management.AttributeChangeNotification;
import javax.management.MBeanNotificationInfo;
import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class Hello extends NotificationBroadcasterSupport implements HelloMBean {
    private String name = "";
   static private int sequenceNumber = 0;

    @Override
    public void sayHello() {
        System.out.println("I say for you \"Hello\"");
        Notification notification = new AttributeChangeNotification(this, sequenceNumber++, System.currentTimeMillis(), "I say \"Hello\"",
                "sequenceNumber", "int", sequenceNumber - 1, sequenceNumber);
        sendNotification(notification);

    }

    @Override
    public int addIntegers(int value1, int value2) {
        return value1+value2;
    }

    @Override
    public Person returnPerson() {
        return new Person();
    }

    @Override
    public void setName(String name) {
        this.name = name;


    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public MBeanNotificationInfo[] getNotificationInfo() {
        String[] types = new String[]{AttributeChangeNotification.ATTRIBUTE_CHANGE};
        String name = AttributeChangeNotification.class.getName();
        String description = "An attribute of this MBean has changed.";

        MBeanNotificationInfo info = new MBeanNotificationInfo(types, name, description);
        return new MBeanNotificationInfo[]{info};

    }
}
