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
    private JLabel hasil1;
    private JLabel hasil2;
    private JLabel hasil3;
    private JLabel hasil4;
    private JLabel hasil5;
    private JLabel hasil6;
    private JLabel hasil7;

    public Tugas() {
        okeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nama = textNama.getText();

                String nim = textNim.getText();

                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);

                hasil.setText("Nama = "+nama);
                hasil1.setText("NIM = "+nim);
                hasil2.setText("Tahun Masuk = "+mhs.jenjangPendidikan());
                hasil3.setText("Jenjang = "+mhs.Angkatan());
                hasil4.setText("Fakultas = "+mhs.Fakultas());
                hasil5.setText("Jurusan = "+mhs.jurusan());
                hasil6.setText("Jenis Kelamin = "+mhs.jenisKelamin());
                hasil7.setText("Nomor Urut = "+mhs.nomorMahasiswa());
            }
        });
        selesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNama.setText(null);
                textNim.setText(null);
                hasil.setText(null);
                hasil1.setText(null);
                hasil2.setText(null);
                hasil3.setText(null);
                hasil4.setText(null);
                hasil5.setText(null);
                hasil6.setText(null);
                hasil7.setText(null);

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
