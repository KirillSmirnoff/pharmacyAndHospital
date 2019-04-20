package GUI;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public interface Action extends DocumentListener {
    @Override
    void insertUpdate(DocumentEvent e);

    @Override
    void removeUpdate(DocumentEvent e);

    @Override
    void changedUpdate(DocumentEvent e);

   default void action(JButton button,JTextField ... fields) {
       int count=0;
       for (JTextField textField : fields) {
           if (!textField.getText().equals("")) {
               count++;
           }
       }
        if (count==fields.length)
            button.setEnabled(true);
        else
            button.setEnabled(false);

    }
}
