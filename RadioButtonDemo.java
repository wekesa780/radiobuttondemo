import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame implements ActionListener {
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private JLabel imageLabel;
    private ImageIcon birdIcon, catIcon, dogIcon, rabbitIcon, pigIcon;

    public RadioButtonDemo() {
        // Create the radio buttons.
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Group the radio buttons so only one can be selected at a time.
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Set up the icons for the labels.
        // Placeholder: you should replace the file paths with actual image paths.
        birdIcon = new ImageIcon("C:\\Users\\user\\Desktop\\RadioButtonDemo\\RadioButtonDemo\\src\\image\\bird.jpg");
        catIcon = new ImageIcon("C:\\Users\\user\\Desktop\\RadioButtonDemo\\RadioButtonDemo\\src\\image\\cat.jpg");
        dogIcon = new ImageIcon("C:\\Users\\user\\Desktop\\RadioButtonDemo\\RadioButtonDemo\\src\\image\\dog.jpg");
        rabbitIcon = new ImageIcon("C:\\Users\\user\\Desktop\\RadioButtonDemo\\RadioButtonDemo\\src\\image\\rabbit.jpg");
        pigIcon = new ImageIcon("C:\\Users\\user\\Desktop\\RadioButtonDemo\\RadioButtonDemo\\src\\image\\pig.jpg");

        // Set up the label that will display the image.
        imageLabel = new JLabel();

        // Add action listeners for the radio buttons.
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Layout the radio buttons vertically in a panel.
        JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        // Add the panel and the image label to the frame.
        add(radioPanel, BorderLayout.WEST);
        add(imageLabel, BorderLayout.CENTER);

        // Set the window to exit when closed.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    // Handle radio button clicks.
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == birdButton) {
            imageLabel.setIcon(birdIcon);
        } else if (e.getSource() == catButton) {
            imageLabel.setIcon(catIcon);
        } else if (e.getSource() == dogButton) {
            imageLabel.setIcon(dogIcon);
        } else if (e.getSource() == rabbitButton) {
            imageLabel.setIcon(rabbitIcon);
        } else if (e.getSource() == pigButton) {
            imageLabel.setIcon(pigIcon);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RadioButtonDemo();
            }
        });
    }
}