package com.company;

public class Strings {

    public String scroll(String s1) {
        s1 = s1.substring(1) + s1.charAt(0);
        return s1;
    }

    public String convertName(String s1){
     int check = s1.lastIndexOf(" ");
     s1 = s1.substring(check + 1) + " " + s1.substring(0,check-1);
     s1.trim();
     return s1;
    }

    public String change(String s1){
        String spart1 = "";
        String spart2 = "";
        String sfinal = "";
        spart1 =  s1.replace("1", "n");
        spart2 = spart1.replace("0", "1");
        sfinal= spart2.replace("n", "0");
        return sfinal ;
    }

    public static void main(String[] args) {
        Strings snew = new Strings();
        System.out.println(snew.scroll("ABCD"));
        System.out.println(snew.convertName("Von Neumann, John"));
        System.out.println(snew.change("001 11000 1010"));
    }


}
