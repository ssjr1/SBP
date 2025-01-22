/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo9.vista.usuario;

<<<<<<< HEAD
/**
 *
 * @author ADMIN
 */
public class UsuarioForm {
    
=======
import static java.awt.AWTEventMulticaster.add;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author stvpibe
 */
public class UsuarioForm {
    private JTextField txtId, txtNombre, txtApellido, txtEmail, txtDireccion;
    private JButton btnAgregar, btnEditar, btnEliminar, btnLimpiar;
    private JTable tableUsuarios;
    private DefaultTableModel tableModel;

    public UsuarioForm() {
        setLayout(new BorderLayout());
        initComponents();
    }
    
    private void initComponents() {
        // **Panel Superior (Formulario de Entrada)**
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createTitledBorder("Gestión de Usuarios"));
        formPanel.setBackground(Color.LIGHT_GRAY);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiquetas y Campos de Texto
        JLabel lblId = new JLabel("ID:");
        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblApellido = new JLabel("Apellido:");
        JLabel lblEmail = new JLabel("Email:");
        JLabel lblDireccion = new JLabel("Dirección:");
        
        txtId = new JTextField();
        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtEmail = new JTextField();
        txtDireccion = new JTextField();

        // Fila 1: ID
        gbc.gridx = 0; gbc.gridy = 0;
        formPanel.add(lblId, gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        formPanel.add(txtId, gbc);

        // Fila 2: Nombre
        gbc.gridx = 0; gbc.gridy = 1;
        formPanel.add(lblNombre, gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        formPanel.add(txtNombre, gbc);

        // Fila 3: Apellido
        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(lblApellido, gbc);
        gbc.gridx = 1; gbc.gridy = 2;
        formPanel.add(txtApellido, gbc);

        // Fila 4: Email
        gbc.gridx = 0; gbc.gridy = 3;
        formPanel.add(lblEmail, gbc);
        gbc.gridx = 1; gbc.gridy = 3;
        formPanel.add(txtEmail, gbc);

        // Fila 5: Teléfono
        gbc.gridx = 0; gbc.gridy = 4;
        formPanel.add(lblDireccion, gbc);
        gbc.gridx = 1; gbc.gridy = 4;
        formPanel.add(txtDireccion, gbc);

        // **Panel Inferior (Botones de Acción)**
        JPanel buttonPanel = new JPanel(new FlowLayout());
        
        btnAgregar = new JButton("Agregar");
        btnEditar = new JButton("Editar");
        btnEliminar = new JButton("Eliminar");
        btnLimpiar = new JButton("Limpiar");

        buttonPanel.add(btnAgregar);
        buttonPanel.add(btnEditar);
        buttonPanel.add(btnEliminar);
        buttonPanel.add(btnLimpiar);

        // **Tabla de Usuarios**
        tableModel = new DefaultTableModel(new String[]{"ID", "Nombre", "Apellido", "Email", "Direccion"}, 0);
        tableUsuarios = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tableUsuarios);

        // **Agregar Componentes al Formulario**
        add(formPanel, BorderLayout.NORTH);    // Formulario en la parte superior
        add(scrollPane, BorderLayout.CENTER); // Tabla en el centro
        add(buttonPanel, BorderLayout.SOUTH); // Botones en la parte inferior
    }
>>>>>>> 8c4c95c8b5226046efbcabb3c45025ae31af728e
}
