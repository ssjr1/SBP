/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.LoginController;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Image;

/**
 *
 * @author stvpibe
 */
public class LoginForm extends JFrame {
    private JLabel lblTitulo;
    private JLabel lblUsuario;
    private JLabel lblPassword;
    private JTextField txtUsuario;
    private JTextField txtPassword;
    private JButton btnLogin;
    private JButton btnCancelar;

    public LoginForm() {
        setTitle("Login - Sistema de Biblioteca Pública"); // Título de la ventana
        setSize(400, 250); // Dimensiones del formulario
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setResizable(false); // Impide que se redimensione la ventana
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        new LoginController(this); // Instancia el controlador asociado
    }

    private void initComponents() {
        setLayout(null); // Se utiliza un diseño absoluto para posicionar los componentes manualmente

        // **Etiqueta del título con imagen centrada**
        lblTitulo = new JLabel();
        lblTitulo.setBounds(165, 10, 60, 60); // Dimensiones y posición de la etiqueta
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/login_1000997.png")); // Carga de la imagen
        Image imagenEscalada = icono.getImage().getScaledInstance(lblTitulo.getWidth(), lblTitulo.getHeight(), Image.SCALE_SMOOTH); // Escala la imagen al tamaño del JLabel
        lblTitulo.setIcon(new ImageIcon(imagenEscalada)); // Asigna la imagen escalada al JLabel
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER); // Centra la imagen dentro del JLabel
        lblTitulo.setVerticalAlignment(SwingConstants.CENTER); // Centra verticalmente la imagen en el JLabel

        // **Campos de texto y etiquetas**
        lblUsuario = new JLabel("Usuario:");
        lblPassword = new JLabel("Contraseña:");
        txtUsuario = new JTextField();
        txtPassword = new JTextField();

        // **Botones con iconos**
        btnLogin = new JButton("Login", new ImageIcon(getClass().getResource("/Imagenes/enter_1828395.png")));
        btnCancelar = new JButton("Salir", new ImageIcon(getClass().getResource("/Imagenes/logout_12237320.png")));

        // **Posición de los componentes**
        lblUsuario.setBounds(50, 80, 100, 25); // Etiqueta de usuario
        txtUsuario.setBounds(150, 80, 180, 25); // Campo de texto de usuario
        lblPassword.setBounds(50, 110, 100, 25); // Etiqueta de contraseña
        txtPassword.setBounds(150, 110, 180, 25); // Campo de texto de contraseña
        btnLogin.setBounds(90, 155, 100, 30); // Botón de login
        btnCancelar.setBounds(200, 155, 100, 30); // Botón de cancelar

        // **Agregar los componentes al formulario**
        add(lblTitulo); // Título con la imagen
        add(lblUsuario); // Etiqueta de usuario
        add(txtUsuario); // Campo de texto de usuario
        add(lblPassword); // Etiqueta de contraseña
        add(txtPassword); // Campo de texto de contraseña
        add(btnLogin); // Botón de login
        add(btnCancelar); // Botón de cancelar
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
