package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class SpaceShip extends Tank implements moveAndShoot{
    KamaPulya kam;
    public SpaceShip(int x, int y){
        super(x, y);

    }
    int counter=0;
    public boolean shooter = false;
    Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\OOP\\source\\player.png").getImage();
    private int v = 0;
    public void move(){

        x+=v;
    }

    public void die() {

    }
    public KamaPulya shoot() {
        return (new KamaPulya(x, y));
    }

    public void keyPressed(KeyEvent e){

        int key = e.getKeyCode();
        if(key==KeyEvent.VK_ENTER){
            shooter = true;
            kam = shoot();
            counter++;
        }
        if(key==KeyEvent.VK_RIGHT){

            if(x<=752){
                v = 5;
            }
            else {
                v = 0;
            }
            move();
        }
        if(key==KeyEvent.VK_LEFT){
            if(x>=0){
                v = -5;
            }
            else{
                v = 0;
            }
            move();
        }



    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT){
            v = 0;
            move();
        }
        if(key==KeyEvent.VK_LEFT){
            v = 0;
            move();
        }
        if(key==KeyEvent.VK_BACK_SPACE){

        }

    }

}
