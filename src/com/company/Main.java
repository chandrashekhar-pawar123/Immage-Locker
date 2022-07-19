package com.company;
class learn{
    String a;
    int marks;
    String color;

    public void report(){
        System.out.println("Writing something");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code he
        learn me = new learn();
        me.a = "Chandrashekhar";
        me.marks = 87;
        me.color = "Wheaty";

        me.report();

    }
}
