//GWC Java Space
//Create window and frame

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Galaxy extends JPanel {
   
   public static int WINDOW_HEIGHT = 600;
   public static int WINDOW_WIDTH = 500;
   
   public JFrame window;
   
   Galaxy() {
      JFrame window = createFrame();
      createJPanel();
      window.add(this);
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