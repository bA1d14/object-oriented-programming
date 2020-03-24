package com.company;

import javax.swing.*;
import java.awt.*;

public class enemySpaceShip extends Tank implements moveAndShoot {
    public enemySpaceShip(int x, int y){
        super(x, y);
    }
    Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\OOP\\source\\enemy_1.png.").getImage();
    public int v = 5;

    public void move(){
        x -=v;
        if(x<=100||x>=700){
            v=-v;
        }
    }
    public KamaPulya shoot(){
        return (new KamaPulya(x, y));
    }

    public void die(){

    }


}
