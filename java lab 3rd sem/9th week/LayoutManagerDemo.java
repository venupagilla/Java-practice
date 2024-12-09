import java.awt.*;
import java.awt.event.*;

public class LayoutManagerDemo extends Frame {
    CardLayout cardLayout = new CardLayout();
    Panel cardPanel = new Panel(cardLayout);

    public LayoutManagerDemo() {
        setTitle("Layout Manager Demo");
        setSize(400, 400);

        Panel flowLayoutPanel = new Panel(new FlowLayout());
        flowLayoutPanel.add(new Button("Flow 1"));
        flowLayoutPanel.add(new Button("Flow 2"));
        flowLayoutPanel.add(new Button("Flow 3"));

        Panel gridLayoutPanel = new Panel(new GridLayout(2, 2));
        gridLayoutPanel.add(new Button("Grid 1"));
        gridLayoutPanel.add(new Button("Grid 2"));
        gridLayoutPanel.add(new Button("Grid 3"));
        gridLayoutPanel.add(new Button("Grid 4"));

        Panel borderLayoutPanel = new Panel(new BorderLayout());
        borderLayoutPanel.add(new Button("North"), BorderLayout.NORTH);
        borderLayoutPanel.add(new Button("South"), BorderLayout.SOUTH);
        borderLayoutPanel.add(new Button("East"), BorderLayout.EAST);
        borderLayoutPanel.add(new Button("West"), BorderLayout.WEST);
        borderLayoutPanel.add(new Button("Center"), BorderLayout.CENTER);

        cardPanel.add(flowLayoutPanel, "Flow");
        cardPanel.add(gridLayoutPanel, "Grid");
        cardPanel.add(borderLayoutPanel, "Border");

        Panel controlPanel = new Panel(new FlowLayout());
        Button nextButton = new Button("Next");
        Button prevButton = new Button("Previous");

        nextButton.addActionListener(e -> cardLayout.next(cardPanel));
        prevButton.addActionListener(e -> cardLayout.previous(cardPanel));

        controlPanel.add(prevButton);
        controlPanel.add(nextButton);

        add(cardPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        LayoutManagerDemo demo = new LayoutManagerDemo();
        demo.setVisible(true);
    }
}
