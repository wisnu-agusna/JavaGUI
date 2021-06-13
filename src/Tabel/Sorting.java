package Tabel;
import javax.swing.*;

public class Sorting {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | UnsupportedLookAndFeelException ignored) {

        }

        JFrame jFrame = new JFrame("Aplikasi Sorting Angka 'Wisnu Agusna' ");
        jFrame.setContentPane(new Jtabel().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(800, 400);
        jFrame.setVisible(true);
    }

}