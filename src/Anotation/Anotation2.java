package Anotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class Anotation2 {
    public static void main(String[] args) throws IllegalAccessException {
        Anotation2 anotation2 = new Anotation2();
        Person person = new Person();
        anotation2.print(person, person.getClass());




    }
    void print(Object o, Class c ) throws IllegalAccessException {
        Field[] fields = c.getDeclaredFields();
        for (Field f :
                fields) {
            Annotation anotations[] = f.getDeclaredAnnotations();
            for (Annotation a :
                    anotations) {
                if (a.annotationType().equals(Show.class)) {
                    System.out.println(f.get(o));
                }
            }
        }

    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface Show {
    boolean show() default true;
}

class Person {
    int age = 18;

    @Show
    String name = "Anotation in field \"name\"";
}



