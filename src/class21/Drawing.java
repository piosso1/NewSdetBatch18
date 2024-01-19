package class21;

import javax.swing.*;
import java.awt.*;

public class Drawing {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setSize(2000,2000);
        myDrawing m = new myDrawing();
        jFrame.add(m);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}

class myDrawing extends Canvas{

    @Override
    public void paint(Graphics g){
        g.setColor(Color.PINK);
        for (int i = 100; i < 600; i=i+50) {
            //Thread.sleep();
            g.fillOval(i,200,500,500);
        }

    }
}