package practice;

import javax.swing.*;

public class TodoFrame extends JFrame {

    public TodoFrame() {
        initFrame();
    }

    private void initFrame() {

        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new TodoPanel());
        setVisible(true);
    }
}
