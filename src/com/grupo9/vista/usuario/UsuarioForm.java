/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo9.vista.usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stvpibe
 */
public class UsuarioForm extends JPanel {

    private JTextField txtId, txtNombre, txtApellido, txtEmail, txtDireccion, txtBuscar;
    private JButton btnAgregar, btnEditar, btnEliminar, btnConsultar, btnLimpiar;
    private JTable tableUsuarios;
    private DefaultTableModel tableModel;

    public UsuarioForm() {
        super(new BorderLayout());
        initComponents();
    }

    private void initComponents() {
        // **Colores y fuentes personalizados**
        Color bgColor = new Color(233, 239, 185);
        Color btnColor = new Color(198, 214, 114);
        Font titleFont = new Font("Arial", Font.BOLD, 24);
        Font labelFont = new Font("Arial", Font.PLAIN, 14);

        // **Título del formulario**
        JLabel lblTitulo = new JLabel("GESTIÓN DE USUARIOS", new ImageIcon(getClass().getResource("/Imagenes/3839448_bank_build_business_loan_management_icon.png")), JLabel.CENTER);
        lblTitulo.setFont(titleFont);
        lblTitulo.setForeground(Color.BLACK);
        lblTitulo.setOpaque(true);
        lblTitulo.setBackground(bgColor);
        lblTitulo.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(lblTitulo, BorderLayout.NORTH);

        // **Panel Principal**
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
        mainPanel.setBackground(Color.LIGHT_GRAY);
        add(mainPanel, BorderLayout.CENTER);

        // **Formulario Superior**
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        formPanel.setBorder(BorderFactory.createTitledBorder("Registro del Usuario - Formulario"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiquetas y campos de texto
        JLabel lblId = new JLabel("ID Usuario:");
        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblApellido = new JLabel("Apellido:");
        JLabel lblEmail = new JLabel("Email:");
        JLabel lblDireccion = new JLabel("Dirección:");

        lblId.setFont(labelFont);
        lblNombre.setFont(labelFont);
        lblApellido.setFont(labelFont);
        lblEmail.setFont(labelFont);
        lblDireccion.setFont(labelFont);

        txtId = new JTextField(15);
        txtNombre = new JTextField(15);
        txtApellido = new JTextField(15);
        txtEmail = new JTextField(15);
        txtDireccion = new JTextField(15);

        // Fila 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(lblId, gbc);
        gbc.gridx = 1;
        formPanel.add(txtId, gbc);

        gbc.gridx = 2;
        formPanel.add(lblDireccion, gbc);
        gbc.gridx = 3;
        formPanel.add(txtDireccion, gbc);

        // Fila 2
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(lblNombre, gbc);
        gbc.gridx = 1;
        formPanel.add(txtNombre, gbc);

        gbc.gridx = 2;
        formPanel.add(lblEmail, gbc);
        gbc.gridx = 3;
        formPanel.add(txtEmail, gbc);

        // Fila 3
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(lblApellido, gbc);
        gbc.gridx = 1;
        formPanel.add(txtApellido, gbc);

        mainPanel.add(formPanel, BorderLayout.NORTH);

        // **Botones**
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        btnAgregar = new JButton("Registrar", new ImageIcon(getClass().getResource("/Imagenes/103409_text_add_book_icon.png")));
        btnEditar = new JButton("Actualizar", new ImageIcon(getClass().getResource("/Imagenes/8666681_edit_icon (1).png")));
        btnEliminar = new JButton("Eliminar", new ImageIcon(getClass().getResource("/Imagenes/8664938_trash_can_delete_remove_icon.png")));
        btnLimpiar = new JButton("Limpiar", new ImageIcon(getClass().getResource("/Imagenes/limpiar.png")));

        btnAgregar.setBackground(btnColor);
        btnEditar.setBackground(btnColor);
        btnEliminar.setBackground(btnColor);
        btnLimpiar.setBackground(btnColor);

        buttonPanel.add(btnAgregar);
        buttonPanel.add(btnEditar);
        buttonPanel.add(btnEliminar);
        buttonPanel.add(btnLimpiar);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // **Buscar**
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        searchPanel.setBackground(Color.WHITE);

        txtBuscar = new JTextField(20);
        btnConsultar = new JButton("Consultar", new ImageIcon(getClass().getResource("/Imagenes/510861_find_magnifying glass_search_zoom_icon.png")));
        btnConsultar.setBackground(btnColor);

        searchPanel.add(txtBuscar);
        searchPanel.add(btnConsultar);

        mainPanel.add(searchPanel, BorderLayout.SOUTH);

        // **Tabla**
        tableModel = new DefaultTableModel(new String[]{"ID Usuario", "Nombre", "Apellido", "Email", "Dirección"}, 0);
        tableUsuarios = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tableUsuarios);
        mainPanel.add(scrollPane, BorderLayout.SOUTH);
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public JButton getBtnConsultar() {
        return btnConsultar;
    }
}
