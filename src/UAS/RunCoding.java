package UAS;

import javax.swing.*;

public class RunCoding {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | UnsupportedLookAndFeelException ignored) {

        }

            JFrame jFrame = new JFrame("Wisnu Agusna (12050112006)");
            jFrame.setContentPane(new AplikasiUAS().getRootPanel());
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setSize(500, 400);
            jFrame.setVisible(true);
        }
    }