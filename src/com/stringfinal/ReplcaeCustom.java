package com.stringfinal;

public class ReplcaeCustom {
    public static void main(String[] args) {
        String s=" nisanth dcsdv ";
        System.out.println(s);
        System.out.println(s.strip());
        char[] ch=s.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a')
            {
                ch[i]='n';
            }
        }


        for(char chaa:ch)
        {
            System.out.println(chaa);
        }
    }
}
