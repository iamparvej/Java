package RacingGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniMinecraft extends JPanel implements KeyListener {
    int playerX = 5, playerY = 5;
    int[][] world = new int[10][10]; // 0 = empty, 1 = block

    public MiniMinecraft() {
        JFrame frame = new JFrame("Mini Minecraft 2D");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.addKeyListener(this);
        frame.setVisible(true);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw world blocks
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (world[i][j] == 1) {
                    g.setColor(new Color(34, 139, 34)); // green
                    g.fillRect(j * 50, i * 50, 50, 50);
                } else {
                    g.setColor(Color.LIGHT_GRAY);
                    g.fillRect(j * 50, i * 50, 50, 50);
                }
                g.setColor(Color.BLACK);
                g.drawRect(j * 50, i * 50, 50, 50);
            }
        }

        // Draw player
        g.setColor(Color.BLUE);
        g.fillRect(playerX * 50 + 10, playerY * 50 + 10, 30, 30);
    }

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_LEFT && playerX > 0) playerX--;
        if (code == KeyEvent.VK_RIGHT && playerX < 9) playerX++;
        if (code == KeyEvent.VK_UP && playerY > 0) playerY--;
        if (code == KeyEvent.VK_DOWN && playerY < 9) playerY++;

        // Place block (press P)
        if (code == KeyEvent.VK_P) {
            world[playerY][playerX] = 1;
        }

        // Remove block (press R)
        if (code == KeyEvent.VK_R) {
            world[playerY][playerX] = 0;
        }

        repaint();
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new MiniMinecraft();
    }
}

