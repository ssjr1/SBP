/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo9.vista.principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author stvpibe
 */
public class PrincipalForm extends JFrame {
    private JPanel barraLateral;
    private JButton btnUsuarios, btnLibros, btnPrestamos;
    
    public PrincipalForm() {
        setTitle("Sistema de Biblioteca Pública");
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }
    
    private void initComponents() {
        setLayout(new BorderLayout());
        barraLateral = new JPanel();
        barraLateral.setLayout(new GridLayout(3, 1, 10, 10));
        barraLateral.setBackground(new Color(240, 240, 240));
        barraLateral.setPreferredSize(new Dimension(200, 0));
        btnUsuarios = new JButton("Usuarios");
        btnLibros = new JButton("Libros");
        btnPrestamos = new JButton("Prestamos");
        barraLateral.add(btnUsuarios);
        barraLateral.add(btnLibros);
        barraLateral.add(btnPrestamos);
        add(barraLateral, BorderLayout.WEST);
    }

    public JButton getBtnUsuarios() {
        return btnUsuarios;
    }

    public JButton getBtnLibros() {
        return btnLibros;
    }

    public JButton getBtnPrestamos() {
        return btnPrestamos;
    }
    
    
}
