import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareCalculator extends JFrame implements ActionListener {

    private JLabel numberLabel;
    private JTextField numberField;
    private JButton factorialButton;
    private JButton squareButton;
    private JLabel resultLabel;
    private JTextField resultField;
    private JLabel errorMessage;

    public SquareCalculator() {
        numberLabel = new JLabel("Enter a number:");
        numberField = new JTextField(10);
        factorialButton = new JButton("Factorial");
        squareButton = new JButton("Square");
        resultLabel = new JLabel("Result");
        resultField = new JTextField(10);
        errorMessage = new JLabel(" ");

        setLayout(new FlowLayout());
        add(numberLabel);
        add(numberField);
        add(factorialButton);
        add(squareButton);
        add(resultLabel);
        add(resultField);
        add(errorMessage);

        squareButton.addActionListener(this);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == squareButton) {
            try {
                int number = Integer.parseInt(numberField.getText());
                int result = number * number;
                resultField.setText("Square of " + number + " is " + result);
            } catch (NumberFormatException ex) {
                errorMessage.setText("Please enter a valid number");
            }
        }
    }

    public static void main(String[] args) {
        new SquareCalculator();
    }
}