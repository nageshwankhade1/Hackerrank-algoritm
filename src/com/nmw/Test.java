package com.nmw;

public class Test {


    public static void main(String []args)
    {
        Integer value1 = new Integer("321");
        Integer value2 = new Integer("321");
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = value1;

        System.out.println(value1.equals(value2));

        System.out.println(value1.equals(obj1));

        System.out.println(value1.equals(obj3));

        System.out.println(obj1.equals(obj2));



    }
}
