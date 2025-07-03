package com.stringfinal;

public class CompareObject {
    int price;
    public static void main(String[] args) {
        CompareObject c1=new CompareObject();
        c1.price=900;
        CompareObject c2=new CompareObject();
        c2.price=900;
        System.out.println(c1.compareTo(c2));
        System.out.println(c1.equals(c2)); // false
    }

    private int compareTo(CompareObject c2) {

        if(this.price>c2.price)
        {
            return 1;
        }
        if(this.price<c2.price)
        {
            return -1;
        }
        else{
            return 0;
        }
    }
}
