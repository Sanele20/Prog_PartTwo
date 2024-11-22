/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {
    
    public TaskTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String description = "";
        Task instance = new Task();
        String expResult = "Task successfully captured";
        String result = instance.checkTaskDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskName = "Add Task Feature";
        String taskNumber = "1";
        String developerDetails = "Mike Smith";
        Task instance = new Task();
        String expResult = "AD:1:ITH";
        String result = instance.createTaskID(taskName, taskNumber, developerDetails);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
 

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int currentTotal = 0;
        int hours = 0;
        int expResult = 0;
        int result = Task.returnTotalHours(currentTotal, hours);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchDev method, of class Task.
     */
    @Test
    public void testSearchDev() {
        System.out.println("SearchDev");
        String sSearch = "Samantha Paulson";
        String expResult = "Create Reports";
        String result = Task.SearchDev(sSearch);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of SearchTask method, of class Task.
     */
    @Test
    public void testSearchTask() {
        System.out.println("SearchTask");
        String sSearch = "Create Login";
        String expResult = "Mike Smith, Create Login";
        String result = Task.SearchTask(sSearch);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Delete method, of class Task.
     */
    

    /**
     * Test of showAddedTask method, of class Task.
     */
   
    /**
     * Test of addTask method, of class Task.
     */
    

    /**
     * Test of addData method, of class Task.
     */
    @Test
    public void testAddData() {
        System.out.println("addData");
        String sDev = "";
        String sSta = "";
        String sTNme = "";
        String sTNum = "";
        String sDescr = "";
        String sTID = "";
        int iDur = 0;
        Task instance = new Task();
        instance.addData(sDev, sSta, sTNme, sTNum, sDescr, sTID, iDur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeveloper method, of class Task.
     */
    @Test
    public void testGetDeveloper() {
        System.out.println("getDeveloper");
        Task instance = new Task();
        String[] expResult = null;
        String[] result = instance.getDeveloper();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Task.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Task instance = new Task();
        String[] expResult = null;
        String[] result = instance.getStatus();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskName method, of class Task.
     */
    @Test
    public void testGetTaskName() {
        System.out.println("getTaskName");
        Task instance = new Task();
        String[] expResult = null;
        String[] result = instance.getTaskName();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskNumber method, of class Task.
     */
    @Test
    public void testGetTaskNumber() {
        System.out.println("getTaskNumber");
        Task instance = new Task();
        String[] expResult = null;
        String[] result = instance.getTaskNumber();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Task.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Task instance = new Task();
        String[] expResult = null;
        String[] result = instance.getDescription();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskID method, of class Task.
     */
    @Test
    public void testGetTaskID() {
        System.out.println("getTaskID");
        Task instance = new Task();
        String[] expResult = null;
        String[] result = instance.getTaskID();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Task.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Task instance = new Task();
        int[] expResult = null;
        int[] result = instance.getDuration();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printData method, of class Task.
     */
    @Test
    public void testPrintData() {
        System.out.println("printData");
        Task instance = new Task();
        instance.printData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayData method, of class Task.
     */
    @Test
    public void testDisplayData() {
        System.out.println("displayData");
        Task instance = new Task();
        String expResult = "";
        String result = instance.displayData();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteData method, of class Task.
     */
    @Test
    public void testDeleteData() {
        System.out.println("deleteData");
        String sTNme = "Create Reports";
        Task instance = new Task();
        instance.deleteData(sTNme);
        
    }

    /**
     * Test of Done method, of class Task.
     */
    @Test
    public void testDone() {
        System.out.println("Done");
        String expResult = "Create Login";
        String result = Task.Done();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of devTasks method, of class Task.
     */
    @Test
    public void testDevTasks() {
        System.out.println("devTasks");
        String expResult = "Glenda Oberholzer, 11";
        String result = Task.devTasks();
        assertEquals(expResult, result);
       
    }
    
}
