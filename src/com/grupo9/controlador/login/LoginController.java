/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo9.controlador.login;

import com.grupo9.vista.login.LoginForm;
import com.grupo9.vista.principal.PrincipalForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author stvpibe
 */
public class LoginController implements ActionListener {
    private final LoginForm vista;
    
    public LoginController(LoginForm vista) {
        this.vista = vista;
        this.vista.getBtnLogin().addActionListener(this);
        this.vista.getBtnCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            System.out.println("Llamada de acción: Activación de botones");
            if (ae.getSource() == vista.getBtnLogin()) {
                System.out.println("Se activa el formulario PrincipalFrom");
                new PrincipalForm().setVisible(true);
                vista.dispose();
            } else if (ae.getSource() == vista.getBtnCancelar()) {
                System.out.println("Se cierra el programa");
                vista.dispose();
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Error inesperado");
        }
    }
    
    
}
