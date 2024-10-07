package com.federicotoluzzo.game;

import com.federicotoluzzo.GUI;
import com.federicotoluzzo.game.characters.Mario;

public class Game{
    public static void main(String[] args) {
        GUI g = new GUI();
        g.addCharacter(new Mario(100, 100));
    }
}
