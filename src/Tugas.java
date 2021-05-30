import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tugas {
    private JTextField textNama;
    private JTextField textNim;
    private JButton okeButton;
    private JPanel rootPanel;
    private JLabel hasil;
    private JButton selesai;

    public Tugas() {
        okeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nama = textNama.getText();

                String nim = textNim.getText();

                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);

                hasil.setText(mhs.toString());




            }
        });
        selesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNama.setText(null);
                textNim.setText(null);
                hasil.setText(null);

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
