package AirlineReservationSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MainFrame extends JFrame {

    private TextPanel textpanel;
    private Toolbar toolbar;
    private FormPanel formPanel;
    private FlightPanel flightPanel;

    public MainFrame() {
        super("Airline Reservation System");
        setLayout(new BorderLayout());

            /*textpanel = new TextPanel();
            toolbar = new Toolbar();
            formPanel = new FormPanel();


            toolbar.setStringListener(new StringListener() {
                @Override
                public void textDisplay(String str) {
                    textpanel.appendText(str);
                }
            });

            add(textpanel, BorderLayout.CENTER);
            add(formPanel, BorderLayout.NORTH);


            formPanel.twoWay.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                            if (e.getStateChange() == ItemEvent.SELECTED) {
                                formPanel.arriveDateField.setEnabled(true);
                            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                formPanel.arriveDateField.setEnabled(false);
                            }

                        }
                    });

            formPanel.nextBtn.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                formPanel.dispose();
                                userMenu();
                            }
                        });

                    }
                }
                });

            */

        JPanel panel = new JPanel();
        JLabel label = new JLabel(" Book Flight Tickets");
        flightPanel = new FlightPanel();

        //button declaration
        JButton bookButton = new JButton("Book Flight");
        JButton cancelButton = new JButton("Cancel Flight");
        JButton closeButton = new JButton("Exit");

        //frame declaration, initialization
        final JFrame frame = new JFrame();
        frame.setTitle("Airline Reservation System");
        frame.setBounds(100, 100, 500, 200);


        //User clicked
        bookButton.addActionListener(new ActionListener() {
            //close frame, open user menu
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                //flightPanel.flight();
            }

        });

        panel.add(label);
        panel.add(bookButton);
        panel.add(cancelButton);
        panel.add(closeButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(1000, 2000);
        setVisible(true);
    }
}






