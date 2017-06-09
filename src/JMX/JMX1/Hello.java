package JMX.JMX1;


public class Hello implements HelloMBean {

    private String name = "";

    @Override
    public void sayHellow() {
        System.out.println("say \"Hello\"");

    }

    @Override
    public int addIntegers(int a1, int a2) {
        return a1 + a2;
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
}
