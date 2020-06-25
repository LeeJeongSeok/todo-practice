package practice;

import javax.swing.*;
import java.awt.*;

public class TodoPanel extends JPanel {

    private JTextField inputTextField;
    private JTextArea todoResultArea;

    public TodoPanel() {
        initPanel();
    }

    private void initPanel() {
        inputTextField = new JTextField();
        todoResultArea = new JTextArea();

        setLayout(new BorderLayout());

        add(todoResultArea, new BorderLayout().CENTER);
        add(inputTextField, new BorderLayout().SOUTH);
    }
}
