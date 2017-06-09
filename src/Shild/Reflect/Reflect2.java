package Shild.Reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflect2 {
    public static void main(String[] args) {
        A a = new A();

        Class<?> c = a.getClass();

        Method[] methods = c.getDeclaredMethods();

        for (Method m :
                methods) {
            int modifiers = m.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                System.out.println("OPEN METHODS - " + m.getName());

            } else if (Modifier.isProtected(modifiers)) {
                System.out.println("PROTECTED - " + m.getName());

            } else if (Modifier.isPrivate(modifiers)) {
                System.out.println("PRIVATE - " + m.getName());
            }
        }
    }

}

class A {
    public void a() {

    }

    public void a2() {

    }

    protected void a3() {

    }

    private void a4() {

    }
}
