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

    private final LoginForm login;

    public LoginController(LoginForm login) {
        this.login = login;
        this.login.getBtnLogin().addActionListener(this);
        this.login.getBtnCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            System.out.println("Llamada de acción: Activación de botones");
            if (ae.getSource() == login.getBtnLogin()) {
                System.out.println("Se activa el formulario PrincipalFrom");
                new PrincipalForm().setVisible(true);
                login.dispose();
            } else if (ae.getSource() == login.getBtnCancelar()) {
                System.out.println("Se cierra el programa");
                login.dispose();
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Error inesperado");
        }
    }

}
