package AirlineReservationSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    JButton book;
    JButton cancel;
    StringListener stringListener;
    public Toolbar(){
        book = new JButton("Book Flight");
        cancel = new JButton("Cancel Flight");

        book.addActionListener(this);
        cancel.addActionListener(this);

        setBorder(BorderFactory.createEtchedBorder());

        setLayout(new FlowLayout(FlowLayout.CENTER));

        add(book);
        add(cancel);

    }
    public void setStringListener(StringListener listener){
        this.stringListener = listener;
    }
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();

        if(clicked == book){
            if(stringListener != null){
                stringListener.textDisplay("Your Ticket has been Booked\n");
            }
        }
        else if(clicked == cancel){
            if(stringListener != null){
                stringListener.textDisplay("Your Ticket has been cancelled\n");
            }
        }
    }
}
