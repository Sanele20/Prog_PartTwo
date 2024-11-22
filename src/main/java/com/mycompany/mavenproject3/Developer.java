package com.mycompany.mavenproject3;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */

public class Developer extends javax.swing.JFrame {
    int totalHrs = 0;
    String[] options = {"To Do", "Done", "Doing"};
    
    
    Task task = new Task();

    /**
     * Creates new form NewJFrame
     */
    public Developer() {
        initComponents();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bAdd = new javax.swing.JButton();
        bReport = new javax.swing.JButton();
        bQuit = new javax.swing.JButton();
        bSearchTask = new javax.swing.JButton();
        bSearchDev = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDisplay = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        bHelpD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bAdd.setText("1) ADD TASKS");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bReport.setText("2) SHOW REPORT");
        bReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReportActionPerformed(evt);
            }
        });

        bQuit.setText("3) QUIT");
        bQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitActionPerformed(evt);
            }
        });

        bSearchTask.setText("SEARCH BY TASK NAME");
        bSearchTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchTaskActionPerformed(evt);
            }
        });

        bSearchDev.setText("SEARCH BY DEVELOPER");
        bSearchDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchDevActionPerformed(evt);
            }
        });

        tDisplay.setColumns(20);
        tDisplay.setRows(5);
        jScrollPane1.setViewportView(tDisplay);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setText("TASK MANAGER");

        bHelpD.setText("HELP");
        bHelpD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHelpDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bHelpD)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bSearchDev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSearchTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(bReport, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(bQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bSearchTask)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSearchDev)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bReport, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(bHelpD)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReportActionPerformed
        // TODO add your handling code here:
           
       
      // Get the data as a string from the printData method
        String data = task.displayData();

        // Clear the JTextArea and display the data
        tDisplay.setText("");  // Clear any previous content
        tDisplay.append(data);  // Append the new data
      
       
        
    }//GEN-LAST:event_bReportActionPerformed

    private void bQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuitActionPerformed
        // TODO add your handling code here:
       bQuit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Create an instance of the new frame
        Login login = new Login();
        login.setVisible(true); // Show the new frame
        // Optionally hide the current frame
        Developer.this.setVisible(false);
    }
});
    }//GEN-LAST:event_bQuitActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        // TODO add your handling code here:
         bAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                String input = JOptionPane.showInputDialog("Enter the number of tasks you want to add:");

               
                    int numberOfTasks = Integer.parseInt(input);
                    if (numberOfTasks > 0) {
                        JOptionPane.showMessageDialog(null, "You want to add " + numberOfTasks + " tasks.");
          
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a positive number.");
                    }
              
                
                for (int i = 0; i < numberOfTasks; i++) {
                      String userChoice = (String) JOptionPane.showInputDialog(
                null, 
                "Select your task status:", 
                "Task Status Menu", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                options, 
                options[0]
        );
                    
                    String taskStatus = userChoice;
                    String developerjDetails = JOptionPane.showInputDialog("Enter Developer Details");
                    String taskNumber = Integer.toString(i) + 1;
                    String taskName = JOptionPane.showInputDialog("Enter Task Name");
                    String description = JOptionPane.showInputDialog("Enter Task Description");
                    task.checkTaskDescription(description);
                    String sduration = JOptionPane.showInputDialog("Enter Task Duration");
                    int duration = Integer.parseInt(sduration); // 
                    String taskID = task.createTaskID(taskName, taskNumber, developerjDetails);
                    
                    task.addData(developerjDetails, taskStatus, taskName, taskNumber, description, taskID, duration);
                    totalHrs += duration; 
                    
                }
              task.printData(); 
              JOptionPane.showMessageDialog(null,"Total Hours of all tasks: " + totalHrs);
            }
        });
    }//GEN-LAST:event_bAddActionPerformed

    private void bHelpDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHelpDActionPerformed
        // TODO add your handling code here:
         String helpMessage = """
                              Help Instructions:
                              
                              1. 'SEARCH BY TASK NAME' allows you to search for task details using the name of the task.
                              2. 'SEARCH BY DEVELOPER' allows you to search for all the tasks assigned to a developer.
                              3. 'ADD' allows you to add new tasks.
                              4. 'SHOW REPORT' all the tasks and their details.
                              5. 'QUIT' closes the Developer page and takes you back to the login page.""";
                

        JOptionPane.showMessageDialog(null, helpMessage, "Help", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bHelpDActionPerformed

    private void bSearchTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchTaskActionPerformed
        // TODO add your handling code here:
         String sSearch = JOptionPane.showInputDialog("Enter Task Name to search");
         String sResult;
         sResult = task.SearchTask(sSearch);
        
       JOptionPane.showMessageDialog(null, sResult, "Search Results", JOptionPane.INFORMATION_MESSAGE);  
        
    }//GEN-LAST:event_bSearchTaskActionPerformed

    private void bSearchDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchDevActionPerformed
        // TODO add your handling code here:
         String developerDetails = JOptionPane.showInputDialog("Enter Developer to search for.");
                  String sResult;

         sResult = task.SearchDev(developerDetails);
         JOptionPane.showMessageDialog(null, sResult, "Search Results", JOptionPane.INFORMATION_MESSAGE);  
    }//GEN-LAST:event_bSearchDevActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Developer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Developer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Developer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Developer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Developer().setVisible(true);
            }
        });
    }
    
    private void openSecondWindow() {
        new Login();
        this.dispose(); // Close the main frame if desired
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bHelpD;
    private javax.swing.JButton bQuit;
    private javax.swing.JButton bReport;
    private javax.swing.JButton bSearchDev;
    private javax.swing.JButton bSearchTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tDisplay;
    // End of variables declaration//GEN-END:variables
}
