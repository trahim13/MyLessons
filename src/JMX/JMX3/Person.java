package JMX.JMX3;

import java.io.Serializable;

public class Person implements Serializable{
    private String name = "root";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
