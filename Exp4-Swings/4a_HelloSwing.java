//4a. Basic hello program of Swing displaying the message Hello! VI B , Welcome to Swing
//Programming in Blue color plain font with font size of 32 using Jframe and Jlabel

package javaswing;
import javax.swing.*;
import java.awt.*;

public class HelloSwing {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Hello Program");

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI B, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font: Plain style, size 32
        label.setFont(new Font("Serif", Font.PLAIN, 32));

        // Set text color to Blue
        label.setForeground(Color.BLUE);

        // Add label to the frame's content pane
        frame.getContentPane().add(label);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame size
        frame.setSize(700, 200);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);

        // Make frame visible
        frame.setVisible(true);
    }
}

