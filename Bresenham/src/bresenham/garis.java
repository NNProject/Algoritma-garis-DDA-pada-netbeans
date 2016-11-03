/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bresenham;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author CHHANNZ
 * modified by Nila & Nisa
 */
public class garis extends JPanel{
    private int x1,y1,x2,y2;
    
    public int getx1() {
        return x1;
    }
    
    public int getx2() {
        return x2;
    }
    
    public int gety1() {
        return y1;
    }
    
    public int gety2() {
        return y2;
    }
    
    public void setx1(int xa) {
        x1 = xa;
    }
    
    public void sety1(int ya) {
        y1 = ya;
    }
    
    public void setx2(int xb) {
        x2 = xb;
    }
    
    public void sety2(int yb) {
        y2 = yb;
    }
    
    public void paint(Graphics g) {
        int x,y,xend;
        int dx = Math.abs(x2-x1);
        int dy = Math.abs(y2-y1);
        int p = 2*dy-dx;
        int duady = 2*dy;
        int duadydx = 2*(dy-dx);
        
        super.paint(g);
        this.setBackground(Color.PINK);
        g.setColor(Color.BLUE);
        
        if (x1>x2) {
            x = x2;
            y = y2;
            xend = x1;
        } else {
            x = x1;
            y = y1;
            xend = x2;
        }
        
       
        g.drawRect(x, y, 3, 3);
        while(x<xend) {
            x++;
            if(p<0) {
                p+=duady;
            } else {
                if (y1>y2) {
                    y--; } 
                else y++;
                p+=duadydx;
            }
            g.drawRect(x, y, 3, 3);
        }
    }
    
    public garis() {
        
    }
        
}
