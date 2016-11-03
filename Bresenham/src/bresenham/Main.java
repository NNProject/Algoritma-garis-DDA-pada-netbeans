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
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public Main() {
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Algoritma Bresenham");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        garis grs = new garis();
        
        grs.setx1(30);
        grs.sety1(50);
        grs.setx2(200);
        grs.sety2(500);
        grs.setBackground(Color.PINK);
        
        frame.add(grs);
        frame.setSize(1000,2000);
        frame.setVisible(true);
        
    }

}
