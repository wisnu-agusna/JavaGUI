package UAS;

import Tabel.RunSorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikasiUAS {
    private JPanel RootPanel;
    private JTextField textJumlah;
    private JTextField textAngka;
    private JTable tablesorting;
    private JButton okeButton;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public AplikasiUAS() {
        this.initComponents();

        okeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tablesorting.getModel();
                String input = textAngka.getText();
                int jumlah = Integer.parseInt(textJumlah.getText());
                String[] stmp = input.split(",");
                String angka = textJumlah.getText();
                if (textJumlah.getText().length() > 3) {
                    JOptionPane.showMessageDialog(RootPanel,
                            "Data yang di input berlebih",
                            "Warning!!!",
                            JOptionPane.WARNING_MESSAGE);

                    return;
                }
                if (stmp.length > jumlah || stmp.length < jumlah) {
                    JOptionPane.showMessageDialog(RootPanel,
                            "Jumlah Angka Tidak Sesuai Limit yang Di input",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int a = 0;
                for (int i : RunSorting.getA(input, jumlah)) {
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : RunSorting.getD(input, jumlah)) {
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });
    }

    private void initComponents() {
        Object[] tableColom = {
                "Sorting Ascending","Sorting Descending"
        };
        Object[][] initData = {
        };
        tableModel = new DefaultTableModel(initData, tableColom);
        tablesorting.setModel(tableModel);
        tablesorting.setAutoCreateRowSorter(false);
        tablesorting.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    public JPanel getRootPanel() {
        return RootPanel;

    }
}
