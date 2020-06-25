package practice;

import javafx.scene.layout.Border;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TodoPanel extends JPanel implements KeyListener {

    private JTextField inputTextField;
    private JTextArea todoResultArea;

    public TodoPanel() {
        initPanel();
    }

    private void initPanel() {
        inputTextField = new JTextField();
        todoResultArea = new JTextArea();

        setLayout(new BorderLayout());
        inputTextField.addKeyListener(this);
        todoResultArea.setBorder(new TitledBorder("TodoList"));


        add(inputTextField, new BorderLayout().SOUTH);
        add(todoResultArea, new BorderLayout().CENTER);
    }

    private void addTodo() {
        todoResultArea.append(inputTextField.getText()+"\n");
        inputTextField.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            addTodo();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
