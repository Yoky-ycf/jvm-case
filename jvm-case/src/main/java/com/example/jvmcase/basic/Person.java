package com.example.jvmcase.basic;

class Person {
    private String name = "yzt";
    private int age;
    private final double salary = 100;
    private static String address;
    private final static String hobby = "Programming";
    private static Object obj = new Object();

    public void d() {
        System.out.println("person say...");
    }


    public static int calc(int op1, int op2) {
        op1 = 3;
        int result = op1 + op2;
        Object obj = new Object();
        //   XXXXX
        obj = null;
        return result;
    }

    public static void main(String[] args) {
        calc(1, 2);
    }
}