package ufpb.br.dcx.silvio;

import javax.swing.*;
import java.awt.*;

public class SistemaMusicaGUI extends JFrame {
    JLabel linha1,linha2;
    ImageIcon spotifycode = new ImageIcon("spotifycode.png");
    JMenuBar barraDeMenu = new JMenuBar();

    public SistemaMusicaGUI(){
        setTitle("Sistema de Músicas");
        setSize(1480,400);
        setResizable(true);
        setBackground(new Color(132,112,255));
        linha1 = new JLabel("Sistema de músicas", JLabel.CENTER);
        linha1.setForeground(Color.black);
        linha1.setFont("Serif", Font.BOLD,24);
        linha2 = new JLabel(spotifycode, JLabel.RIGHT_ALIGNMENT);
        setLayout(new GridLayout(3,1));
        add (linha1);
        add (linha2);
        add (new JLabel());
    }
}