package org.example.components;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton{
    private JButton botao;

    private String textoBotao;
    public Botao(String textoBotao){
        this.textoBotao = textoBotao;
        botao = new JButton(textoBotao);
        botao.setFont(new Font("Arial", Font.BOLD, 13));
        botao.setForeground(new Color(0x3D207D));
        botao.setBackground(new Color(0xffffff));
        botao.setFocusPainted(false);
        botao.setBorder(BorderFactory.createLineBorder(new Color(0x3D207D)));
    }
    public JButton getBotao(JButton botao) {
        return botao;
    }
}
