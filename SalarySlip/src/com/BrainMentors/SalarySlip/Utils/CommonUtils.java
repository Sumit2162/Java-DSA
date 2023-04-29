package com.BrainMentors.SalarySlip.Utils;

public class CommonUtils {

       public String formatname(String name) {
   	    String fullname ="";
   	 String nameArr[]= name.split(" ");
     for(String n : nameArr) {
         char firstChar = n.charAt(0);
         String firstCharUpper = String.valueOf(firstChar).toUpperCase();
         String remainingString = n.substring(1).toLowerCase();
         fullname = fullname + firstCharUpper + remainingString + " ";
     }
     return fullname;
       }
       
}
