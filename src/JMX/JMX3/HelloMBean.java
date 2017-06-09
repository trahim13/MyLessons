package JMX.JMX3;

public interface HelloMBean {
    void sayHello();

    int addIntegers(int value1, int value2);

    Person returnPerson();

    void setName(String name);

    String getName();
}
