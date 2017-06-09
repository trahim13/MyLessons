package AWTShildPart1;


import java.awt.*;


public class ShowFont{
    public static void main(String[] args) {
        String msg = "";
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String myFont[] = ge.getAvailableFontFamilyNames();

        for (String a : myFont) {
            System.out.println(msg + a);
        }
    }










}
