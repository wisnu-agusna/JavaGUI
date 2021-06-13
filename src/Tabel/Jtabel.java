package Tabel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jtabel {
    private JTextField textJumlah;
    private JButton urutkanButton;
    private JTable tabelsort;
    private JPanel RootPanel;
    private JTextField textAngka;
    private DefaultTableModel tableModel;
    private boolean added = false;
    private Object DefaultTableModel;

    public Jtabel() {
        this.initComponents();
        urutkanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tabelsort.getModel();
                String input = textAngka.getText();
                int jumlah = Integer.parseInt(textJumlah.getText());
                String[] stmp = input.split(",");
                String angka = textJumlah.getText();
                if (textJumlah.getText().length() > 3) {
                    JOptionPane.showMessageDialog(RootPanel,
                            "Data yang diinput berlebih",
                            "Warning!!!",
                            JOptionPane.WARNING_MESSAGE);

                    return;
                }
                if (stmp.length > jumlah || stmp.length < jumlah) {
                    JOptionPane.showMessageDialog(RootPanel,
                            "Jumlah Angka Tidak Sesuai Limit yang DiInput",
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
                for (int i : RunSorting.getA (input, jumlah)) {
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : RunSorting.getD (input, jumlah)) {
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });
    }

    private void initComponents() {
        Object[] tableColom = {
                "Menurun", "Naik"
        };
        Object[][] initData = {
        };
        tableModel = new DefaultTableModel(initData, tableColom);
        tabelsort.setModel(tableModel);
        tabelsort.setAutoCreateRowSorter(false);
        tabelsort.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    public JPanel getRootPanel() {
        return RootPanel;
    }
}
