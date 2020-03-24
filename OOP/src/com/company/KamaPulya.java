package com.company;

import javax.swing.*;
import java.awt.*;

public class KamaPulya  extends Tank implements moveAndShoot{
    public KamaPulya(int x , int y) {
        super(x, y);
    }



    public static int counter = 0;
    private int v = -5;
    Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\OOP\\source\\bullet.png").getImage();

    public void move() {
        y+=v;

    }
    public KamaPulya shoot() {
        return (new KamaPulya(x, y));
    }
    public void die(){

    }
    public int  dieObj(int coorx, int coory) {
        int i=0;
        if((x>=(coorx-30)&&x<=(coorx+70))&&(y<=(coory+100)&&y>=coory)){
            i=1;
        }
        return i;
    }


}
