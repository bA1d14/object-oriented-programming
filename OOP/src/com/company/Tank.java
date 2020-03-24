package com.company;

import javax.swing.*;
import java.awt.*;

public class Tank {
    Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\OOP\\source\\block.png").getImage();
        int x = 0;
        int y = 0;
        public Tank(int x, int y){
            this.x = x;
            this.y = y;
        }
        int health=1;

}
