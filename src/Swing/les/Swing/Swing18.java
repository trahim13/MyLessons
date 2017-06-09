package Swing.les.Swing;



import javax.swing.*;
import java.awt.*;


public class Swing18 {
    private static JFrame jFrame = getJFrame();
    private static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 2;
        constraints.gridwidth = 2;
        jPanel.add(new JTextArea(5, 20), constraints);

        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.gridx = 2;
        constraints1.gridy = 0;
        constraints1.gridheight = 1;
        constraints1.gridwidth = 2;
        jPanel.add(new JButton("one long button"), constraints1);

        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx = 0;
        constraints2.weighty = 0;
        constraints2.gridx = 2;
        constraints2.gridy = 1;
        constraints2.gridheight = 1;
        constraints2.gridwidth = 1;
        jPanel.add(new JButton("two"), constraints2);

        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weighty = 0;
        constraints3.weightx = 0;
        constraints3.gridy = 1;
        constraints3.gridx = 3;
        constraints3.gridwidth = 1;
        constraints3.gridheight = 1;
        jPanel.add(new JButton("two"), constraints3);
        jFrame.revalidate();
    }

    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Swing110");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 250, d.height / 2 - 250, 500, 500);
        jFrame.setVisible(true);
        return jFrame;
    }
}
