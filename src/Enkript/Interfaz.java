package Enkript;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener {

    Encriptacion enc = new Encriptacion();
    Desencriptacion des = new Desencriptacion();
    JLabel etiqueta1, etiqueta2;
    JTextField caja1, caja2;
    JButton encriptar, desencriptar;
    JTextArea cajon1, cajon2;
    JMenuBar menu;
    JMenu opciones;
    JMenuItem salir;
    String texto1 = "",texto2="";

    public Interfaz() {
        setLayout(null);
        this.getContentPane().setBackground(new Color(129,231,215));
        setTitle("Enkript");
        
        
        etiqueta1 = new JLabel("ENCRIPTAR");
        etiqueta1.setBounds(10, 20, 100, 30);
        add(etiqueta1);

        etiqueta2 = new JLabel("DESENCRIPTAR");
        etiqueta2.setBounds(10, 150, 100, 30);
        add(etiqueta2);

        caja1 = new JTextField();
        caja1.setBounds(10, 50, 120, 30);
        add(caja1);

        caja2 = new JTextField();
        caja2.setBounds(10, 190, 120, 30);
        add(caja2);

        encriptar = new JButton("Aplicar");
        encriptar.setBounds(140, 50, 100, 30);
        add(encriptar);
        encriptar.addActionListener(this);

        desencriptar = new JButton("Aplicar");
        desencriptar.setBounds(140, 190, 100, 30);
        add(desencriptar);
        desencriptar.addActionListener(this);

        cajon1 = new JTextArea();
        cajon1.setBounds(10, 90, 230, 30);
        add(cajon1);

        cajon2 = new JTextArea();
        cajon2.setBounds(10, 230, 230, 30);
        add(cajon2);

        menu = new JMenuBar();
        setJMenuBar(menu);

        opciones = new JMenu("Opciones");
        menu.add(opciones);

        salir = new JMenuItem("Salir");
        salir.addActionListener(this);
        opciones.add(salir);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salir) {
            System.exit(0);
        }
        if (e.getSource() == encriptar) {
            texto1 = caja1.getText();
            texto2=enc.Pandora(texto1);
            cajon1.setText(texto2);
        }
        if (e.getSource() == desencriptar) {
            texto1 = caja2.getText();
            texto2=des.Pandora(texto1);
            cajon2.setText(texto2);
        }
    }

    public void Agregar() {
        Interfaz interfaz=new Interfaz();
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interfaz.setBounds(0,0,260,330);
        interfaz.setResizable(false);
        interfaz.setLocationRelativeTo(null);
        interfaz.setVisible(true);
    }
}
