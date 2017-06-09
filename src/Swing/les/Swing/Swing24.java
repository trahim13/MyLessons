package Swing.les.Swing;


import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.io.File;

public class Swing24 {
    private static JFrame jFrame = getJFrame();
    private static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("show dialog?");
        jButton.addActionListener(e -> {
            JFileChooser jFileChooser = new JFileChooser();
            //showOpenDialog
            //showSaveDialog
            //showDialog
            jFileChooser.setMultiSelectionEnabled(true);
            jFileChooser.setFileFilter(new FileFilter() {
                @Override
                public boolean accept(File f) {

                    return f.isDirectory() || f.getName().endsWith(".exe");


                }

                @Override
                public String getDescription() {
                    return ".exe";
                }
            });
            jFileChooser.showDialog(jPanel, "Same offer");
           File f =  jFileChooser.getSelectedFile();
            System.out.println(f.getName());

        });
        jPanel.add(jButton);
        jPanel.revalidate();

    }

    private static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Swing24");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 250, d.height / 2 - 250, 500, 500);
        jFrame.setVisible(true);
        return jFrame;

    }
}
