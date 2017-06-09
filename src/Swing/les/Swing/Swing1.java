package Swing.les.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by petrovski on 22.03.2017.
 */
public class Swing1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setTitle("my application");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        jFrame.setSize(new Dimension(500, 300));
//        jFrame.setLocation(300, 300);
//        jFrame.setBounds(200, 200, 500, 500);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);
    }

}
