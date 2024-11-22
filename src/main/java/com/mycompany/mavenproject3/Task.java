/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;


import javax.swing.JOptionPane;



/**
 *
 * @author RC_Student_lab
 */

public class Task {
    
    final static int ARRAY_SIZE = 3_000_000;  // Constant declaration

        
        static String[] arrDeveloper = new String[ARRAY_SIZE];
        static String[] arrTaskName = new String[ARRAY_SIZE];
       static  String[] arrTaskID = new String[ARRAY_SIZE];
       static  int[] arrTaskDuration = new int[ARRAY_SIZE];
       static  String[] arrStatus = new String[ARRAY_SIZE];
       static  String[] arrDescription = new String[ARRAY_SIZE];
       static  String[] arrTaskNumber = new String[ARRAY_SIZE];
       static int index = 0;  // To keep track of where to insert new data

        
        
        
        
         public static String SearchDev(String sSearch) {
           String sTemp = "";  
             
          for (int i = 0; i < arrDeveloper.length;i++) {
            if (arrDeveloper[i].equals(sSearch)){
             sTemp += "Task Name: " + arrTaskName[i] +"\n" +
                       "Status: " + arrStatus[i] +
                       "\n\n"; 
            }
            }    
             
        return sTemp;
    }
         
         
         public static String Done() {
           String sTemp = "";  
           String sSearch = "Done"; 
          for (int i = 0; i < arrDeveloper.length;i++) {
            if (arrStatus[i].equals(sSearch)){
             sTemp += arrDeveloper[i]+", "+arrTaskName[i] ;
            }
            }    
             
             
         return sTemp;
         }
         
         public static String devTasks() {
             
          int imax = arrTaskDuration[0];
          String sDev = arrDeveloper[0];
          String sTemp = "";
          String smax = "";

        // Loop through the array to find the highest value
        for (int i = 1; i < arrTaskDuration.length; i++) {
            if (arrTaskDuration[i] > imax) {
                imax = arrTaskDuration[i];
                sDev = arrDeveloper[i];
            }
        }
        smax =  Integer.toString(imax);
        sTemp =sDev +", "+smax;
         return sTemp;
         }
         
         
         
         
         
         
          public static String SearchTask(String sSearch) {
              
         
              
           String sTemp = "";      
            
         for (int i = 0; i < arrDeveloper.length;i++) {
            if (arrTaskName[i].equals(sSearch)){
              sTemp += "Task Name: " + arrTaskName[i] +"\n" +
                       "Developer: " + arrDeveloper[i] +"\n" +
                       "Status: " + arrStatus[i] +
                       "\n\n";   
            }}  
              
        return sTemp;
    }

     // Method to check if task description is not more than 50 characters
    public String checkTaskDescription(String description) {
        if (description.length() > 50){
           return "Please"
                   + " eneter a task description of less than 50 "
                   + "characters";
        } else 
        return "Task "
                + "successfully captured";
    }

    // Method to create and return a unique task ID
    public String createTaskID(String taskName, 
            String taskNumber, String developerDetails) {
        return (taskName.substring(0,2)).toUpperCase()
                + ":"+taskNumber + ":" +
                (developerDetails.substring(developerDetails.length() - 3)).toUpperCase();
    }
    // Method to return total combined hours of all entered tasks
    public static int returnTotalHours(int currentTotal, int hours) {
        
        return currentTotal + hours;
    }
    
       // Method to add data to the arrays
    public void addData(String sDev,String sSta,String sTNme,String sTNum,String sDescr,String sTID,int iDur){
        if (index < arrTaskName.length) {
            arrDeveloper[index] =sDev;
            arrStatus[index] = sSta;
            arrTaskName[index] = sTNme;
            arrTaskNumber[index] = sTNum;
            arrDescription[index] = sDescr;
            arrTaskID[index] = sTID;
            arrTaskDuration[index] = iDur;
            index++;
        }
    }
    
     // Method to get data from the arrays
    public String[] getDeveloper() {
        return arrDeveloper;
    }
    
    public String[] getStatus() {
        return arrStatus;
    }
    
    public String[] getTaskName() {
        return arrTaskName;
    }
    
    public String[] getTaskNumber() {
        return arrTaskNumber;
    }
    
    public String[] getDescription() {
        return arrDescription;
    }
    
    public String[] getTaskID() {
        return arrTaskID;
    }
    
    public int[] getDuration() {
        return arrTaskDuration;
    }
    
     // Method to print data from all arrays
    public void printData() {
        for (int i = 0; i < index; i++) {
            JOptionPane.showMessageDialog(null,"Task Status: " + arrStatus[i] +
                "\nDeveloper Details: " + arrDeveloper[i] +
                "\nTask Number: " + arrTaskNumber[i] +
                "\nTask Name: " + arrTaskName[i] +  
                "\nDescription: " + arrDescription[i] +
                "\nTask ID: " + arrTaskID[i] +
               "\nDuration: " + arrTaskDuration[i] + " hours.\n\n");
        }
    }
    
    public String displayData() {
    // Clear the text area before displaying new data
      // Clears any existing content in the JTextArea
     String sFinal = "";
    // Assuming arrays and index are defined, display data from them
    for (int i = 0; i < index; i++) {
         sFinal += "Task Status: " + arrStatus[i] +
                "\nDeveloper Details: " + arrDeveloper[i] +
                "\nTask Number: " + arrTaskNumber[i] +
                "\nTask Name: " + arrTaskName[i] +  
                "\nDescription: " + arrDescription[i] +
                "\nTask ID: " + arrTaskID[i] +
               "\nDuration: " + arrTaskDuration[i] + " hours.\n\n";
    }
        return sFinal;
}
    
     // Method to delete data at a given index
    public void deleteData(String sTNme) {
        boolean found = false;
        // Loop through array1 to find the element
        for (int i = 0; i < index; i++) {
            if (arrTaskName[i].equals(sTNme)) {
                // Shift all elements following
                for (int j = i; j < index - 1; j++) {{
                arrStatus[j] = arrStatus[j + 1];
                arrDeveloper[j] = arrDeveloper[j + 1];
                arrTaskNumber[j] = arrTaskNumber[j + 1];
                arrTaskName[j] = arrTaskName[j + 1];
                arrDescription[j] = arrDescription[j + 1];
                arrTaskID[j] = arrTaskID[j + 1];
                arrTaskDuration[j] = arrTaskDuration[j + 1];
          
            }
             index--;  // Decrease the index 
                found = true;
                break;  // End the loop once element deleted
        } 
        }
         
          if (!found) {
            JOptionPane.showMessageDialog(null,"Element not found.");
        }
        }
    }
}

    