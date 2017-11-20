/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author williamqin
 */
public class InterfaceIO {
    
    private static InterfaceIO instance;
    
    public static InterfaceIO getInstance() {
        return instance == null ? instance = new InterfaceIO() : instance;
    }
    
    private EmployeeManagementSystem mManager;
    
    
    public void beginFormAddEmployee() {
        
        AddEmployeeForm add = new AddEmployeeForm();
        add.setVisible(true);
        add.setResizable(false);
        add.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        add.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(add, 
                    "Are you sure to close this window?", "Really Closing?", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    add.dispose();
                }
            }
        });
        
    }
    
    
    
}
