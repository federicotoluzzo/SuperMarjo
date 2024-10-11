package com.federicotoluzzo;

import com.federicotoluzzo.game.characters.Character;

import java.awt.*;
import java.util.HashSet;

public class GUI extends javax.swing.JPanel {
    HashSet<Character> characters = new HashSet<>();

    public GUI() {
        setPreferredSize(new Dimension(800, 600));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Character character : characters) {
            character.render(g);
        }
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }
}
