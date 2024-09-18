package methods;

import java.util.Arrays;

public class Varargs {

    // when we don't know the no of inputs the method will receive
    // we declare and define a method that accepts variable number of arguments

    public static void main(String[] args) {
        System.out.println("Hello!");
        fun(25, 16, 36, 22, 77, 65, 31, 90);

        //mind the ordering
        //varargs always at the end
        multipleArgs(10, 20, "rita", "john", "bob");

        // varargs can accept 0 - n number of args
        fun();
    }

    static void multipleArgs(int a, int b, String... v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    // varargs can accept 0 - n number of args
    static void fun(int... v) {
        if (v.length != 0) {
            //internally it stores it as an array of integers/strings/chars etc...
            System.out.println(Arrays.toString(v));

            int first = v[0];
            int fifth = v[4];
            System.out.println(first);
            System.out.println(fifth);
        }

    }
    //error in line 19 - ambiguous method call
    //static void fun(String... s) {
    //
    //}

}
