package com.company;
import javax.swing.*;
import java.awt.*;

public class anotherEnemy extends Tank implements moveAndShoot{
    public anotherEnemy(int x, int y){
        super(x, y);
    }
    Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\OOP\\source\\another_enemy.png").getImage();


    public int v = 4;
    private int counter = 0;
    private int addV=0;
        public void move(){

            counter++;
            if(counter==25){
                addV = v;
                v=0;

            }
            if(counter==100){
                v=addV;
                counter=0;
            }

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
