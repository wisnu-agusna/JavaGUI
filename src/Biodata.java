import javax.swing.*;

public class Biodata {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Keterangan Mahasiswa");
                jFrame.setContentPane(new Tugas().getRootPanel());
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setLocationRelativeTo(null);
                jFrame.setSize(500, 400);
                jFrame.setVisible(true);





    }
}
