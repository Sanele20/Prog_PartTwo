/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;



/**
 *
 * @author RC_Student_lab
 */

public class Task {
    
    

   
  
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

    // Method to return full task details
    public String printTaskDetails(String taskStatus, String developerDetails, 
            String taskNumber, String taskName, String description, 
           String taskId, int duration) {
        return "Task Status: " + taskStatus +
                "\nDeveloper Details: " + developerDetails +
                "\nTask Number: " + taskNumber +
                "\nTask Name: " + taskName +  
                "\nDescription: " + description +
                "\nTask ID: " + taskId +
               "\nDuration: " + duration + " hours";
               
    }

    // Method to return total combined hours of all entered tasks
    public static int returnTotalHours(int currentTotal, int hours) {
        
        return currentTotal + hours;
    }

  

}