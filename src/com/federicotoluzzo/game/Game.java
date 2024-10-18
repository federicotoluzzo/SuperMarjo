package com.federicotoluzzo.game;

import com.federicotoluzzo.GUI;
import com.federicotoluzzo.game.characters.Mario;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Game{
    public static void main(String[] args) {
        JFrame f = new JFrame("Super Marjo");
        GUI g = new GUI();

        f.setContentPane(g);
        g.addCharacter(new Mario(100, 100));
        g.repaint();

        f.setVisible(true);
        f.pack();
    }
}
