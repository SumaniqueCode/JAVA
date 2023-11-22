import java.awt.*;
import javax.swing.*;

public class form_using_swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 250);
        frame.setTitle("Student Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.magenta);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1,5,20));
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("FILE");
        JMenu help = new JMenu("HELP");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        
        JLabel nameLabel = new JLabel(" Name ");
        JTextField name = new JTextField("Enter your name.");
        JLabel classLabel = new JLabel(" Class ");
        JTextField level = new JTextField("Enter your class");
        JLabel facultyLabel = new JLabel(" Faculty ");
        String [] facultyList ={"BBA","BCA","BBS"};
        JComboBox faculty = new JComboBox<>(facultyList);
        JCheckBox termBox = new JCheckBox("I agree the terms ");
        JButton submit = new JButton("SUBMIT");
        JLabel copyright = new JLabel(" \u00a9 Copyright 2023");
        

        frame.add(panel, BorderLayout.CENTER);
        frame.add(menuBar, BorderLayout.PAGE_START);
        menuBar.add(file);
        menuBar.add(help);
        file.add(save);
        file.add(exit);
        panel.add(nameLabel);
        panel.add(name);
        panel.add(classLabel);
        panel.add(level);
        panel.add(facultyLabel);
        panel.add(faculty);
        panel.add(termBox);
        panel.add(submit);
        frame.add(copyright, BorderLayout.PAGE_END);
        frame.pack();
        frame.setVisible(true);

    }
}
