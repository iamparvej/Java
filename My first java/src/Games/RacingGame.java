package RacingGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RacingGame extends JPanel implements ActionListener,KeyListener{
    int carX = 250;
     // Car horizontal position
    int carY = 500; // Car vertical position
    int roadLineY = 0;

    Timer timer;

    public RacingGame() {
        setFocusable(true);
        addKeyListener(this);

        timer = new Timer(10, this); // 10ms update
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background - Road
        g.setColor(Color.DARK_GRAY);
        g.fillRect(100, 0, 300, getHeight());

        // Draw road lines (to simulate movement)
        g.setColor(Color.WHITE);
        for (int i = 0; i < 10; i++) {
            g.fillRect(240, (i * 80 + roadLineY) % 800, 20, 40);
        }

        // Draw car
        g.setColor(Color.RED);
        g.fillRect(carX, carY, 50, 80); // car as rectangle
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        roadLineY += 5; // move road lines down to simulate motion
        repaint();
    }

    // Movement controls
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        // Move left
        if (key == KeyEvent.VK_LEFT && carX > 110) {
            carX -= 10;
        }

        // Move right
        if (key == KeyEvent.VK_RIGHT && carX < 340) {
            carX += 10;
        }

        // Move up
        if (key == KeyEvent.VK_UP && carY > 0) {
            carY -= 10;
        }

        // Move down
        if (key == KeyEvent.VK_DOWN && carY < getHeight() - 100) {
            carY += 10;
        }

        repaint();
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("🏎️ Simple Racing Game");
        RacingGame game = new RacingGame();

        frame.add(game);
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

