//https://coderanch.com/t/344345/java/Simple-Graph
//https://coderanch.com/t/323434/java/plot-graph-Java

import java.awt.*;
import javax.swing.*;
  
public class Graph extends JPanel {
    double [][] data = { {30.0, 150.0},
                       {33.0, 145.0},
                       {36.0, 162.0},
                       {39.0, 128.0},
                       {48.0, 114.0},
                       {70.0, 240.0},
                       {81.0, 400.0},
                      {130.0, 450.0},
                      {230.0,  85.0},
                      {255.0,  30.0} };
    int points = data.length;
  
     public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for(int i = 0; i < points - 1; i++) {
            int x0 = (int) (data[i][0] + 0.5);
            int x1 = (int) (data[i + 1][0] + 0.5);
            int y0 = (int) (data[i][1] +0.5);
            int y1 = (int) (data[i + 1][1] + 0.5);
            g2.drawLine(x0, y0, x1, y1);
            if (i == 0){
              g2.drawString(("" + x0 + ", " + y0), x0 - 20, y0 + 10);
            }
            if (i == points - 2){
              g2.drawString(("" + x1 + ", " + y1), x1, y1);
            }
        }
    }
}