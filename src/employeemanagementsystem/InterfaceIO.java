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
    
    // Necessary to make InterfaceIO as a Singleton
    
    private static InterfaceIO instance;
    
    public static InterfaceIO getInstance() {
        return instance == null ? instance = new InterfaceIO() : instance;
    }
    
    // ATTRIBUTES
    
    private EmployeeManagementSystem mManager;
    private AddEmployeeForm mAddForm;
    private MainView mMainView;
    
    
    // METHODS
    
    public void setManager(EmployeeManagementSystem manager) {
        System.out.println(manager);
        mManager = manager;
    }
    
    public void beginFormAddEmployee() {
        
        mAddForm = new AddEmployeeForm();
        mAddForm.setVisible(true);
        mAddForm.setAlwaysOnTop(true);
        mAddForm.setResizable(false);
        mAddForm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        mAddForm.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                closeFormAddEmployee();
            }
        });
        
        mMainView.setEnabled(false);
        mMainView.setFocusable(false);
        
    }
    
    private void closeFormAddEmployee() {
        if (JOptionPane.showConfirmDialog(mAddForm, 
            "Are you sure to close this window?", "Really Closing?", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            mAddForm.dispose();
            mMainView.setEnabled(true);
            mMainView.setFocusable(true);
        }
    }
    
    public void cancelFormAddEmployee() {
        closeFormAddEmployee();
    }
    
    public void addFormAddEmployee() {
        // TODO: get info from form and add employee
        
        
    }
    
    public void reloadView() {
        
        if (JOptionPane.showConfirmDialog(mMainView, 
            "Close current window and open new window?", "Create new?", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            
            mMainView.dispose();
            
            loadView();
        }
        
        
    }
    
    public void loadView() {
        mMainView = new MainView();
        mMainView.setVisible(true);
        mMainView.setResizable(false);
        mMainView.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        mMainView.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(mMainView, 
                    "Exit Employee Management System?", "Close?", 
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    
                    System.exit(0);
                    
                }
            }
        });
    }
    
    
    
}
