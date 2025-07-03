package com.stringfinal;

import java.io.UnsupportedEncodingException;

public class StringMethods {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="TamilnaduTamil";
        String s1=" ";
        System.out.println(s.indexOf("nadu"));
        System.out.println(s.indexOf("Tamil",6));
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());

        System.out.println();
        // split method -> return as String array
        String names="Nisanth-Kanisha-Preethika";
        String[] st=names.split("-");
        for(String name:st)
        {
            System.out.println(name);
        }

        System.out.println(s.join(names));



        String name="Nisanth";

        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4));
        System.out.println( name.codePointBefore(3)); // return unicode value
        System.out.println(name.formatted(names));



        // replace method
        System.out.println(name.replace('a','n'));

    }
}
