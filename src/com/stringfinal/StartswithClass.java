package com.stringfinal;

public class StartswithClass {
    public static void main(String[] args) {
        String s="Nisanth Kanisha";

        //StartswithClass.compareStartswith("Nisanth");
        StartswithClass.confirmEnding("Kanisha");
    }

    private static void confirmEnding(String input) {
        String s="Nisanth Kanisha";

        char[] ch=s.toCharArray();
        int start=s.length()-input.length();
        int issame=0,j=0;
        System.out.println(start);
        for(int i=start;i<s.length();i++)
        {
            if(ch[i]==s.charAt(j))
            {
                issame=1;
            }
            j++;
        }
        if(issame==1)
        {
            System.out.println("equal");
        }



    }

    private static void compareStartswith(String input) {
        String s="Nisath Kanisha";
        char[] ch=input.toCharArray();
        boolean isSame=false;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==s.charAt(i))
            {
                isSame=true;
            }



        }

        if(isSame)
        {
            System.out.println("Equal");
        }
    }
}
