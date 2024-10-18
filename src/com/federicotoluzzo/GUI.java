package com.federicotoluzzo;

import com.federicotoluzzo.game.characters.Character;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class GUI extends javax.swing.JPanel {
    HashSet<Character> characters = new HashSet<>();
    double refreshRate = 77.97;

    public GUI() {;
        setPreferredSize(new Dimension(800, 600));
        new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        TimeUnit.MICROSECONDS.sleep((long) (1_000_000/refreshRate));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        }});

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_A || key == KeyEvent.VK_RIGHT) {
                    characters.
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        for (Character character : characters) {
            character.render(g);
        }
    }

    public void addCharacter(Character character) {
        characters.add(character);
        repaint();
    }
}
