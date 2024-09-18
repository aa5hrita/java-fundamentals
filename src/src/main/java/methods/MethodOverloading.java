package methods;

//when two functions have same name and return type
//but different in number of parameters or type of parameters
//the decision to run the appropriate function call is made at the COMPILE TIME

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {

        fun(10);
        fun("Bob");
        fun(30, 40);
        fun(10, 20, 30);
        fun("bob", "rita");

        //fun(); for ambiguous method overloading with varargs
    }

    // if not defined line 19 will throw error
    // for ambiguous method overloading with varargs
    // static void fun() {
    // System.out.println("do nothing");
    // }

    static void fun(String name) {
        System.out.println(name);
    }

    /* cant do this = error
        static int fun() {
            return 10;
        }
    */

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(int x, int y) {
        System.out.println(x + " , " + y);
    }

    static void fun(int... i) {
        System.out.println("varargs" + Arrays.toString(i));
    }

    static void fun(String... s) {
        System.out.println(Arrays.toString(s));
        System.out.println(s[0]);
    }
}
