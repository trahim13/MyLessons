package Swing.les.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by petrovski on 22.03.2017.
 */
public class Swing7 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        JButton jButton = new JButton(new MyAction());
        jButton.setText("submit");

        jPanel.add(jButton);
        jFrame.add(jPanel);

    }

    static class MyAction extends AbstractAction {
        public MyAction() {
            putValue(AbstractAction.SHORT_DESCRIPTION, "My first description in button");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.green);

        }
    }


    static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);
        jFrame.setTitle("My next app in Swing");
        return jFrame;
    }
}
