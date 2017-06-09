package JMX.JMX1;

public interface HelloMBean {
    void sayHellow();

    int addIntegers(int a1, int a2);

    Person returnPerson();

    void setName(String name);

    String getName();

}
