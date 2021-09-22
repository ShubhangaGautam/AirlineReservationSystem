package AirlineReservationSystem;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class FlightPanel extends JPanel {

    private JRadioButton flight1;
    private JRadioButton flight2;
    private JRadioButton flight3;
    private JRadioButton flight4;
    private ButtonGroup flightGroup;

    private JTextField price1;
    private JTextField price2;
    private JTextField price3;
    private JTextField price4;

    public  FlightPanel() {
        Dimension dim = getPreferredSize();
        dim.width = 200;
        setPreferredSize(dim);

        flight1 = new JRadioButton("Air India (AI - 701)");
        flight2 = new JRadioButton("SpiceJet (SG - 254)");
        flight3 = new JRadioButton("Indigo (6E - 417");
        flight4 = new JRadioButton("GoAir (G8 - 227)");
        flightGroup = new ButtonGroup();

        price1 = new JTextField("Rs. 6877");
        price2 = new JTextField("Rs. 6666");
        price3 = new JTextField("Rs. 5931");
        price4 = new JTextField("Rs. 6667");

        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        flightGroup.add(flight1);
        flightGroup.add(flight2);
        flightGroup.add(flight3);
        flightGroup.add(flight4);

        /////// First Row ////////////////////////////////////////////////////////
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(flight1, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        add(price1,gridBagConstraints);

        ////// Second Row ////////////////////////////////////////////////////
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(flight2, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        add(price2,gridBagConstraints);

        /////////// Third Row //////////////////////////////////////////////
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(flight3, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        add(price3,gridBagConstraints);

        /////////////// Fourth Row ////////////////////////////////////////
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        add(flight4, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.PAGE_START;
        add(price4,gridBagConstraints);

        TitledBorder innerBorder = BorderFactory.createTitledBorder("Book Flight Tickets");
        javax.swing.border.Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));






    }
}
