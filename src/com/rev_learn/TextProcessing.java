package com.rev_learn;

public class TextProcessing {
    public static void main(String[] args) {

        String s="Payilagam Chennai Tamil Nadu";
        System.out.println(s.matches("\\w{9} \\w{7}")); // word length
        System.out.println(s.replace('a','e'));
        System.out.println(s.replace("Pa","Pe"));
        System.out.println(s.replaceAll("\\s","\\-"));


        System.out.println("******************************");
        String[] s2=s.split(" ");
        for(String ss:s2)
        {
            System.out.println(ss);
        }


        System.out.println(s2.length);

        // static method
        System.out.println(String.join("-","23","10","2004"));

        // interview specific

       String a= String.valueOf(5); // acts as string
         System.out.println(a);


        System.out.println(s.contains("Tamil"));

    }

}
