package com.varun.classwork;

public class Primitives {
    public static void main(String[] args) {
        
        // Integer
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Min int is: " + minInt);
        System.out.println("Max int is: " + maxInt);
        
        int a = 3, b = 5;
        System.out.println(a/b); // 0
        System.out.println(b/a); // 1

        // Long
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Min long is: " + minLong);
        System.out.println("Max long is: " + maxLong); 
        
        long aa = 3, bb = 5;
        System.out.println(aa/bb); // 0
        System.out.println(bb/aa); // 1
        
        // Float
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Min float " + minFloat);
        System.out.println("Max float " + maxFloat);
        float c = 3f, d = 5f;
        System.out.println(d/c);
        System.out.println(c/d);
        
        float aaa = 9.2f;
        System.out.printf("%20.16f \n", aaa);
        
        // Double
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Min double " + minDouble);
        System.out.println("Max double " + maxDouble);
        
        double cc = 3f, dd = 5f;
        System.out.println(dd/cc);
        System.out.println(cc/dd);
        
        double aaaa = 9.2f;
        System.out.printf("%20.16f \n", aaaa);
        
        // Boolean
        boolean t = true, f = false;
        
        System.out.println(t && f); // false
        System.out.println(f && t); // false
        System.out.println(f || t); // true
        System.out.println(f ^ t); // true
        
        // Characters
        char c1 = 'A', c2 = '\u1235', c3 = '\u8235';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        // Shorts, Bytes
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        
        System.out.println("Min short is " + minShort);
        System.out.println("Max short is " + maxShort);
        
        // Shorts, Bytes
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        
        System.out.println("Min short is " + minByte);
        System.out.println("Max short is " + maxByte);
        
        /*
        Address | Value
        0       | 0123...32| -> AX
        1       | 0123...32| ->
        2       | 0123...32|
        3       | 0123...32|
        4       | 0123...32|
        */
        // point this variable called ax to a 64 bit amount of memory and save the value 9 in there
        // ax is called "reference variable"
        long ax = 9;
    }
}