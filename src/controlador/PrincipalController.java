/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.PrestamoForm;
import vista.PrincipalForm;
import vista.UsuarioForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author ADMIN
 */
public class PrincipalController implements ActionListener {

    private final PrincipalForm principal;

    public PrincipalController(PrincipalForm principal) {
        this.principal = principal;

        this.principal.getBtnUsuario().addActionListener(this);
        this.principal.getBtnLibro().addActionListener(this);
        this.principal.getBtnPrestamo().addActionListener(this);
        
        this.principal.getBtnPrestamo().setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == principal.getBtnUsuario()) {
            System.out.println("Navegación: Formulario Usuario");
            UsuarioForm usuarioForm = new UsuarioForm();
            principal.showContent(usuarioForm);
        } else if (e.getSource() == principal.getBtnLibro()) {
            System.out.println("Navegación: Formulario Libro");
            JLabel placeholder = new JLabel("Formulario de libro (En desarrollo)");
            principal.showContent(placeholder);
        } /*else if (e.getSource() == principal.getBtnPrestamo()) {
            System.out.println("Navegación: Formulario Prestamo");
            PrestamoForm prestamoForm = new PrestamoForm();
            principal.showContent(prestamoForm);
        }*/
    }
}
