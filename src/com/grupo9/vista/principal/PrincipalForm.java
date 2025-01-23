/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo9.vista.principal;

import com.grupo9.controlador.principal.PrincipalController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author stvpibe
 */
public class PrincipalForm extends JFrame {

    private JPanel menuPanel;
    private JPanel contentPanel;
    private JButton btnUsuario;
    private JButton btnLibro;
    private JButton btnPrestamo;

    public PrincipalForm() {
        setTitle("Sistema de Biblioteca Pública");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(new BorderLayout());
        initComponents();
        new PrincipalController(this);
    }

    private void initComponents() {
        // **Panel del Menú (Lado Izquierdo)**
        menuPanel = new JPanel();                             // Crea el panel para el menú
        menuPanel.setLayout(new GridBagLayout());             // Usa GridBagLayout para centrar los botones
        menuPanel.setPreferredSize(new Dimension(200, 0));    // Ancho fijo del panel de menú
        menuPanel.setBackground(new Color(51, 51, 102));      // Color azul oscuro para el fondo del menú

        // **Botones del Menú**
        btnUsuario = createMenuButton("Usuario");
        btnLibro = createMenuButton("Libro");
        btnPrestamo = createMenuButton("Préstamo");

        // **Panel para contener los botones del menú**
        JPanel buttonContainer = new JPanel();
        buttonContainer.setLayout(new GridLayout(3, 1, 20, 20)); // 3 botones, 20px de espacio entre ellos
        buttonContainer.setOpaque(false);                      // Fondo transparente para heredar el color de `menuPanel`

        buttonContainer.add(btnUsuario);
        buttonContainer.add(btnLibro);
        buttonContainer.add(btnPrestamo);

        // Centra el contenedor de botones dentro del menú
        menuPanel.add(buttonContainer);

        // **Panel de Contenido (Parte Derecha)**
        contentPanel = new JPanel();                          // Crea el panel para contenido dinámico
        contentPanel.setLayout(new BorderLayout());           // Permite agregar componentes dinámicamente
        contentPanel.setBackground(Color.WHITE);              // Fondo blanco para el contenedor

        // **Agregar Paneles al JFrame**
        add(menuPanel, BorderLayout.WEST);                    // Menú a la izquierda
        add(contentPanel, BorderLayout.CENTER);
    }
    
    private JButton createMenuButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(255, 255, 255));        // Fondo blanco
        button.setForeground(new Color(51, 51, 102));          // Texto azul oscuro
        button.setFocusPainted(false);                        // Desactiva el borde de enfoque
        button.setBorderPainted(false);                       // Desactiva el borde del botón
        button.setContentAreaFilled(true);                    // Rellena el área del botón
        button.setPreferredSize(new Dimension(150, 40));      // Dimensiones del botón: ancho y alto
        button.setFont(new Font("Arial", Font.PLAIN, 14));     // Fuente del texto del botón
        return button;
    }

    public void showContent(JComponent component) {
        // Limpia el contenido actual
        contentPanel.removeAll();

        // Añade el nuevo componente (Formulario del módulo)
        contentPanel.add(component, BorderLayout.CENTER);

        // Actualiza la interfaz gráfica
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }

    public JButton getBtnUsuario() {
        return btnUsuario;
    }

    public JButton getBtnLibro() {
        return btnLibro;
    }

    public JButton getBtnPrestamo() {
        return btnPrestamo;
    }
    
    
}
