package com.senaictti.application;

import com.formdev.flatlaf.FlatLightLaf;
import com.senaictti.controller.AgendaController;
import com.senaictti.view.TelaLogin;
import java.time.LocalDate;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Program {

    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch(UnsupportedLookAndFeelException ex) {
            System.err.println( "Failed to initialize LaF");
        }
        
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        
      
    }
}
