package com.company;

public class Strings {

    public static String scroll(String s1) {
        s1 = s1.substring(1) + s1.charAt(0);
        return s1;
    }

    public static String convertName(String s1){
        s1 = s1.trim();
        int check = s1.indexOf(",");
        s1 = s1.substring(check + 2) + " " + s1.substring(0,check);
        return s1;
    }

    public static String negative(String s1){
        s1 =  s1.replace("1", "n");
        s1 = s1.replace("0", "1");
        s1= s1.replace("n", "0");
        return s1 ;
    }

    public static String convertDate(String dateStr){
        String month = "" + dateStr.charAt(0) + dateStr.charAt(1);
        String date = "" + dateStr.charAt(3) + dateStr.charAt(4);
        String year = dateStr.substring(6);
        dateStr = date + "-" + month + "-" + year ;
        return dateStr;

    }

    public static String convertDate2(String dateStr){
        String month = dateStr.substring(0,dateStr.indexOf("/"));
        String date = dateStr.substring(dateStr.indexOf("/")+1, dateStr.lastIndexOf("/"));
        String year = dateStr.substring(dateStr.lastIndexOf("/") + 1);
        if (month.length() < 2){
            month = "0" + month;
        }
        if (date.length() < 2){
            date = "0" + date;
        }
        return date + "-" + month + "-" + year;

    }


    public static void main(String[] args) {
        System.out.println(scroll("Hello World"));

        System.out.println(convertName(" Reubenstein, Lori Renee     "));

        System.out.println(negative("0010111001"));

        System.out.println("04/20/2014 becomes " + convertDate("04/20/2014"));

        System.out.println("04/20/2014 becomes " + convertDate2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + convertDate2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + convertDate2("04/2/2014"));
        System.out.println("4/2/2014 becomes " + convertDate2("4/2/2014"));



    }


}
