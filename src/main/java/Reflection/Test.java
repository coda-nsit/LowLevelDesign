package Reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Reflection{

    private String message = "Hola Baishali and Rishab";

    Reflection() {
        System.out.println("Invoking default constructor through Reflection");
    }
    Reflection(String msg) {
        System.out.println("Invoking parameterized constructor through Reflection  : " + msg);
    }

    private void showMessage() {
        System.out.println("Invoing method through reflection");
        //System.out.println(message);
    }

}

public class Test {

    public static void main(String[] args) throws Exception {

        Class<?> reflectionClass = Class.forName("Reflection.Reflection");

        // calling default constructor
        // Constructor<?> constructor = reflectionClass.getDeclaredConstructor(); // old method of calling object
        var constructor = reflectionClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        // Object obj = constructor.newInstance(); // old method of creating constructor
        var obj = constructor.newInstance();

        // calling parameterized constructor
        var parameterizedConstructor = reflectionClass.getDeclaredConstructor(String.class);
        parameterizedConstructor.setAccessible(true);
        var parametreObj = parameterizedConstructor.newInstance("Hola Baishali");

        // calling method

        Method m = reflectionClass.getDeclaredMethod("showMessage");
        m.setAccessible(true);
        m.invoke(obj);

        // Invoking private field through reflection
        Field f = reflectionClass.getDeclaredField("message");
        f.setAccessible(true);
        //f.set(obj, "Hola Baishali");
        System.out.println(f.get(obj));

    }

}
