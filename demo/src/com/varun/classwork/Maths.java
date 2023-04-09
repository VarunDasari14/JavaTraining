package com.varun.classwork;

public class Maths {
    
    
    public void approxPi() {
        System.out.println("Math.PI approx: " + Math.PI);
        double pi = 0;
        for(int i = 1; i < 100_000_000; i++) {
            pi += Math.pow(-1, i+1) / (2*i - 1);
        }
        System.out.println("Calculated PI:  " + pi*4);
    }
    
    public static void main(String[] args) {

        // How do you exponents, square roots, trigonometry in java?
        // We use the math class
        
        // Most common methods you will use are pow and sin,cos,tan
        System.out.println(Math.pow(2,2));
        
        System.out.println(Math.sin(90*Math.PI/180));
        
        
        System.out.println(Math.ceil(2.3));
        System.out.println(Math.floor(2.9));
        
        System.out.println(Math.ceil(-2.3));
        System.out.println(Math.floor(-2.9));
        
        
        new Maths().approxPi();
    }
}
