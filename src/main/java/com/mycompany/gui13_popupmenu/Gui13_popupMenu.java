/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gui13_popupmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author zafer
 */
public class Gui13_popupMenu {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Popup Menü Örneği");
        JPopupMenu pm = new JPopupMenu("Menü");

        JMenuItem cut = new JMenuItem("Kes");
        JMenuItem copy = new JMenuItem("Kopyala");
        JMenuItem paste = new JMenuItem("Yapıştır");

        pm.add(cut);
        pm.add(copy);
        pm.add(paste);

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pm.show(frame, e.getX(), e.getY());
            }
        });

        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Kes butonuna tıklandı");
            }
        });

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
