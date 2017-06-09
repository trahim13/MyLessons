package JMX.JMX3;

import javax.management.AttributeChangeNotification;
import javax.management.MBeanNotificationInfo;
import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class Hello extends NotificationBroadcasterSupport implements HelloMBean {
    private String name = "root";
    static private int sequence = 0;
    @Override
    public void sayHello() {
        System.out.println("I say world \"Hello\" from jmx.");

        Notification notification = new AttributeChangeNotification(this, sequence++, System.currentTimeMillis(), "the method \"sayHello\"",
                "sequence", "int", sequence - 1, sequence);
        sendNotification(notification);

    }

    @Override
    public int addIntegers(int value1, int value2) {
        Notification notification2 = notification2 = new AttributeChangeNotification(this, sequence++, System.currentTimeMillis(), "method \"addIntegers\"", "sequence",
                "int", sequence-1, sequence);
        sendNotification(notification2);

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
        String description = "This same description in Hello.class";

        MBeanNotificationInfo info = new MBeanNotificationInfo(types, name, description);

        return new MBeanNotificationInfo[]{info};
    }
}
