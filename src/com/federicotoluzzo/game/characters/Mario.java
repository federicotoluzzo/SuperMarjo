package com.federicotoluzzo.game.characters;

import javax.swing.*;

public class Mario extends Character {
    public Mario(int x, int y) {
        super(x, y);

        this.icon = new ImageIcon("mario_icon.png");

        this.width = this.icon.getIconWidth();
        this.height = this.icon.getIconHeight();
    }
}
