//GWC Java Space
//Create window and frame
//Galaxy class

import java.awt.*;
import javax.swing.*;
import java.awt.Color;

//Grid layout and randomly place planets on panel

public class Galaxy extends JPanel {
   
   public static int WINDOW_WIDTH = 900;
   public static int WINDOW_HEIGHT = 800;
   
   public JFrame window;
   
   Galaxy() {
      JFrame window = createFrame();
      createJPanel();
      window.add(this);
      // window.setLayout(new GridLayout(5, 5)); //5 rows by 5 cols
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

   // add planets image to the screen and place them on screen with respect to 
   // the width and height of the frame
   public void paintComponent(Graphics g) {
      super.paintComponent(g);

      // draw orbits
      g.setColor(Color.WHITE);
      g.drawOval(395, 348, 100, 100); // mercury
      g.drawOval(358, 308, 175, 175); // venus
      g.drawOval(321, 270, 250, 250); // earth
      g.drawOval(284, 230, 325, 325); // mars
      g.drawOval(247, 190, 400, 400); // jupiter
      g.drawOval(210, 145, 475, 475); // saturn
      g.drawOval(173, 105, 550, 550); // uranus
      g.drawOval(136, 67, 625, 625); // neptune

      // add sun
      ImageIcon sun = new ImageIcon("images/sun.png");
      sun.paintIcon(this, g, 405, 355);

      // add mercury
      ImageIcon mercury = new ImageIcon("images/mercury.png");
      mercury.paintIcon(this, g, 400, 325);

      // add venus
      ImageIcon venus = new ImageIcon("images/venus.png");
      venus.paintIcon(this, g, 500, 355);

      // add earth
      ImageIcon earth = new ImageIcon("images/earth.png");
      earth.paintIcon(this, g, 295, 400);

      // add mars
      ImageIcon mars = new ImageIcon("images/mars.png");
      mars.paintIcon(this, g, 420, 527);

      // add jupiter
      ImageIcon jupiter = new ImageIcon("images/jupiter.png");
      jupiter.paintIcon(this, g, 450, 150);

      // add saturn
      ImageIcon saturn = new ImageIcon("images/saturn.png");
      saturn.paintIcon(this, g, 200, 210);

      // add uranus
      ImageIcon uranus = new ImageIcon("images/uranus.png");
      uranus.paintIcon(this, g, 300, 90);

      // add neptune
      ImageIcon neptune = new ImageIcon("images/neptune.png");
      neptune.paintIcon(this, g, 550, 630);
   }

   public static void main (String[] args) {
      new Galaxy();
   }
}