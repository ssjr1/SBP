
package com.grupo9.vista.prestamo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/**
 *
 * @author 
 */
public class RoundedBorder implements Border {
        private int radius;

        public RoundedBorder(int radius) {
            this.radius = radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(new Color(203, 181, 64)); 
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }

        @Override
       public Insets getBorderInsets(Component c) {
            return new Insets(10, 10, 10, 10); 
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }
    }

   