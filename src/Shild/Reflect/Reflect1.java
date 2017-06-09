package Shild.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflect1 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.awt.Dimension");
            System.out.println("Constructors: ");
            Constructor[] constructors = c.getConstructors();
            for (Constructor a :
                    constructors) {
                System.out.println(a);
            }

            System.out.println("Fields:");
            Field[] fields = c.getFields();
            for (Field a :
                    fields) {
                System.out.println(a);
            }

            System.out.println("Methods");
            Method[] methods = c.getMethods();
            for (Method a :
                    methods) {
                System.out.println(a);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
