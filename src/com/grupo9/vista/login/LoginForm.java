/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo9.vista.login;

import com.grupo9.controlador.login.LoginController;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author stvpibe
 */
public class LoginForm extends JFrame
{
    private JLabel lblUsuario;
    private JLabel lblPassword;
    private JTextField txtUsuario;
    private JTextField txtPassword;
    private JButton btnLogin;
    private JButton btnCancelar;
    
    public LoginForm()
    {
        setTitle("Login - Sistema de Biblioteca Pública");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        initComponents();
        new LoginController(this);
    }
    
    private void initComponents()
    {
        setLayout(null);
        lblUsuario = new JLabel("Usuario:");
        lblPassword = new JLabel("Contraseña:");
        txtUsuario = new JTextField();
        txtPassword = new JTextField();
        btnLogin = new JButton("Login");
        btnCancelar = new JButton("Cancelar");
        lblUsuario.setBounds(50, 50, 100, 25);
        txtUsuario.setBounds(150, 50, 180, 25);
        lblPassword.setBounds(50, 90, 100, 25);
        txtPassword.setBounds(150, 90, 180, 25);
        btnLogin.setBounds(90, 150, 100, 30);
        btnCancelar.setBounds(200, 150, 100, 30);
        add(lblUsuario);
        add(txtUsuario);
        add(lblPassword);
        add(txtPassword);
        add(btnLogin);
        add(btnCancelar);
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }
    
    
}
