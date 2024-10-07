package com.federicotoluzzo.game.characters;

import com.federicotoluzzo.assets.*;

import javax.swing.*;

public class Mario extends Character {
    public Mario(int x, int y) {
        super(x, y);
        this.icon = new ImageIcon("mario_jump.png");
        this.width = this.icon.getIconWidth();
        this.height = this.icon.getIconHeight();
    }
}
