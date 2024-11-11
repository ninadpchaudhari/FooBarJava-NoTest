package edu.siena;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fooBar(i));
        }
    }

    public static String fooBar(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FooBar";
        } else if (number % 3 == 0) {
            return "Foo";
        } else if (number % 5 == 0) {
            return "Bar";
        } else {
            return String.valueOf(number);
        }
    }
}