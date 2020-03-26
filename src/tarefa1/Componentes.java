/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Josemolamazo
 */
public class Componentes {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JTextField text1, text2;
    JLabel eti1, eti2;
    JTextArea textoGrande;

    public Componentes() {
        marco = new JFrame(" TAREFA 1 ");
        panel = new JPanel();
        boton1 = new JButton(" Boton nº1 ");
        boton2 = new JButton(" Boton nº2 ");
        text1 = new JTextField(" Nome ");
        text2 = new JTextField(" Apelido ");
        eti1 = new JLabel();
        eti2 = new JLabel();
        textoGrande = new JTextArea();

        marco.setLocationRelativeTo(marco);
        marco.setSize(700, 700);
        panel.setSize(700, 700);
        panel.setBackground(Color.pink);
        boton1.setBackground(Color.gray);
        boton2.setBackground(Color.gray);
        textoGrande.setSize(75, 50);
        eti1.setText(" Etiqueta 1 ");
        eti2.setText(" Etiqueta 2 ");

        panel.add(boton1);
        panel.add(boton2);
        panel.add(text1);
        panel.add(text2);
        panel.add(eti1);
        panel.add(eti2);
        panel.add(textoGrande);
        marco.add(panel);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

}
