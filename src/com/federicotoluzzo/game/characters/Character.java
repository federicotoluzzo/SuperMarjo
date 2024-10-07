package com.federicotoluzzo.game.characters;

import javax.swing.*;
import java.awt.*;

abstract public class Character {
    public int posX;
    public int posY;
    public int width;
    public int height;

    public ImageIcon icon;

    public Character(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public boolean isColliding(Character character) {
        return (character.posX > this.posX && character.posX < this.posX + this.width) || (character.posY > this.posY && character.posY < this.posY + this.height);
    }

    public void render(Graphics g) {
        g.drawImage(this.icon.getImage(), this.posX, this.posY, null);
    }
}
