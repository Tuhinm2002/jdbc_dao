package org.example;

public class ClassForNameExample {
    public static void main(String[] args) throws Exception{
        Class.forName("org.example.Pqr");
    }
}

class Pqr{
    static
    {
        System.out.println("Hello from static block");
    }

    {
        System.out.println("Hello from instance block");
    }
}
