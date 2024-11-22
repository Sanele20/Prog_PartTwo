/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Sanele B Mthethwa
 */
public class Validation {
    final static int ARRAY_SIZE = 3_000_000;  // Constant declaration
    
        static String[] arrName= new String[ARRAY_SIZE];
        static String[] arrSurname = new String[ARRAY_SIZE];
        static String[] arrUsername = new String[ARRAY_SIZE];
        static String[] arrPassword = new String[ARRAY_SIZE];
        private int index = 0;  // To keep track of where to insert new data
    
    //Username
    public static boolean checkUsername(String username) {
        return username.length() <= 5 && username.contains("_");
    }
    
    
    //Password
     public static boolean checkPasswordComplexity(String sCheck) {
        boolean bPass = false;
        char cPosition;
        int iCount = 0;
        
        for (int i=0;i < sCheck.length();i++) {
            cPosition = sCheck.charAt(i);
              iCount = iCount + 1;
            if (Character.isDigit(cPosition) && Character.isUpperCase(cPosition) &&
                   !Character.isDigit(sCheck.charAt(i)) && !Character.isLetter(sCheck.charAt(i))
                    && !Character.isWhitespace(sCheck.charAt(i)) && iCount >= 8 ) {
                bPass = true;
            }
      } 
        return bPass;
     }  
     
     //Register
       public static String registerUser(String sName,String sSurname,String username, String password){

              String sMessage = "";
            
            if (checkUsername(username) != true){
            sMessage = "Username is not correctly formatted."
                + "Please ensure that your username contains an "
                + "underscore and is no more than 5 charactyers in length.";
              } else

            if (checkPasswordComplexity(password) != true) {
                
              sMessage = "Password is not correctly formatted. "
                + "Please ensure that your password is at least 8 characters long, "
                + "has at least one uppercase, has at least one number, and has at"
                + "least one number, and has at least one special character";
       
              } else {
                sMessage = "User Registered Successfully.";         
            }
        return sMessage;
    }
        
        
        //Login verify
        public static boolean loginUser(String username, String password) {
            
            boolean bLogin = false;
            
            for (int i=0;i<arrUsername.length;i++){ 
                if  ((arrUsername[i].equals(username)) && (arrPassword[i].equals(password))) {
             bLogin = true; 
         }
            }
        return bLogin;
        
       
        }
         public void addDataL(String sNme,String sSur,String sUse, String sPas){
        if (index < arrUsername.length) {
            arrName[index] =sNme;
            arrSurname[index] = sSur;
            arrUsername[index] = sUse;
            arrPassword[index] = sPas;
            
            index++;
        }
    }
        
        //Message
        public static String returnLoginStatus(String username, String password) {
            String sError = "";
            Boolean bValid = loginUser(username, password) ;
            
            if (bValid==true){
              sError =  "Login successful! Welcome !"
                    + " it is great to see you again.";  
        } else {
            sError = "Invalid username or password. Please try again.";
 
            }
        return sError;
}
}