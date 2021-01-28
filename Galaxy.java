//GWC Java Space
//Create window and frame
//Galaxy class

import java.awt.*;
import javax.swing.*;
import java.awt.Color;

//Grid layout and randomly place planets on panel

public class Galaxy extends JPanel {
   
   public static int WINDOW_HEIGHT = 600;
   public static int WINDOW_WIDTH = 500;
   
   public JFrame window;
   
   Galaxy() {
      JFrame window = createFrame();
      createJPanel();
      window.add(this);
      window.setLayout(new GridLayout(5, 5)); //5 rows by 5 cols
   }
   
   private JFrame createFrame() {
      window = new JFrame("Solar System");
      window.setVisible(true);
      window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      return window;
   }
   
   private JPanel createJPanel() {
      JPanel panel = new JPanel();
      this.setBackground(Color.BLACK);
      return panel;
   }
   
   public static void main (String[] args) {
      Galaxy g = new Galaxy();
   }
}