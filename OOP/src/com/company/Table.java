package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Table<rock> extends JPanel implements ActionListener  {


        public Table(){
                timer.start();
                addKeyListener(new MyPersonalKeyAdapter());
                setFocusable(true);
        }
        Timer timer = new Timer(20, this);
        Image img = new ImageIcon("C:\\Users\\User\\IdeaProjects\\OOP\\source\\space2.jpg").getImage();


        protected Tank block1 = new Tank(200, 150);
        protected Tank block2 = new Tank(300, 150);
        protected Tank block3 = new Tank(400, 150);
        protected Tank block4  = new Tank(500, 150);
        protected Tank block5  = new Tank(600, 150);
        protected enemySpaceShip enemy = new enemySpaceShip(400, 15);
        protected anotherEnemy anotherenemy = new anotherEnemy(700, 15);


        protected SpaceShip player = new SpaceShip(400, 300);






        private class MyPersonalKeyAdapter extends KeyAdapter {

                public void keyPressed(KeyEvent e){
                        player.keyPressed(e);
                }
                public void keyReleased(KeyEvent e){
                        player.keyReleased(e);
                }


        }


        public void paint(Graphics g){
                g = (Graphics2D) g;
                ((Graphics2D) g).drawImage(img, 0, 0, null);
                ((Graphics2D) g).drawImage(block1.img, block1.x, block1.y, null);
                ((Graphics2D) g).drawImage(block2.img, block2.x, block2.y, null);
                ((Graphics2D) g).drawImage(block3.img, block3.x, block3.y, null);
                ((Graphics2D) g).drawImage(block4.img, block4.x, block3.y, null);
                ((Graphics2D) g).drawImage(block5.img, block5.x, block5.y, null);
                ((Graphics2D) g).drawImage(player.img, player.x, player.y, null);
                ((Graphics2D) g).drawImage(enemy.img, enemy.x, enemy.y, null);
                ((Graphics2D) g).drawImage(anotherenemy.img, anotherenemy.x, anotherenemy.y, null);
                if(player.shooter){
                        KamaPulya p[] = new KamaPulya[1000];
                        p[player.counter] = player.kam;
                        p[player.counter].move();
                        ((Graphics2D) g).drawImage(p[player.counter].img, p[player.counter].x+50, p[player.counter].y, null);
                        if(p[player.counter].dieObj(anotherenemy.x, anotherenemy.y)==1){

                                anotherenemy.img=null;
                        }
                        if(p[player.counter].dieObj(anotherenemy.x, anotherenemy.y)==1&&anotherenemy.img==null){

                                enemy.img=null;
                        }


                }








        }

        public void actionPerformed(ActionEvent e){
            enemy.move();
            anotherenemy.move();
            player.move();



            repaint();
        }


}
