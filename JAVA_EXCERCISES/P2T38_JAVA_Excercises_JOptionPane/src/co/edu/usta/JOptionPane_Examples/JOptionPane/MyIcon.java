package co.edu.usta.JOptionPane_Examples.JOptionPane;

import javax.swing.*;
import java.awt.*;

public class MyIcon implements Icon {
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("resources/icon-pencil-png.png.JPG")).getImage();
        g.drawImage(image, x, y, c);
    }

    @Override
    public int getIconWidth() {
        return 50;
    }

    @Override
    public int getIconHeight() {
        return 50;
    }

}