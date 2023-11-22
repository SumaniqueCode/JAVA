import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
/*  w  w  w.j  ava 2 s  .  c o m*/
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Layout_in_swing extends JPanel {
  private static final int GAP = 5;

  public Layout_in_swing() {
    JPanel borderLayoutPanel = new JPanel(new BorderLayout());
    borderLayoutPanel.setBorder(BorderFactory
        .createTitledBorder("BorderLayout Panel"));
    borderLayoutPanel.add(createGridPanel(), BorderLayout.CENTER);

    JPanel flowLayoutPanel = new JPanel(new FlowLayout());
    flowLayoutPanel.setBorder(BorderFactory
        .createTitledBorder("FlowLayout Panel"));
    flowLayoutPanel.add(createGridPanel());

    setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
    setLayout(new GridLayout(1, 0, GAP, 0));
    add(borderLayoutPanel);
    add(flowLayoutPanel);
  }

  private JPanel createGridPanel() {
    int rows = 5;
    int cols = 5;
    JPanel gridPanel = new JPanel(new GridLayout(rows, cols));
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        JLabel label = new JLabel(String.format("[%d, %d]", i, j),
            SwingConstants.CENTER);
        label.setBorder(BorderFactory.createEtchedBorder());
        gridPanel.add(label);
      }
    }
    return gridPanel;
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new Layout_in_swing());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}