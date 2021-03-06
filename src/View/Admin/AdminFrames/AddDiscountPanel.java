package View.Admin.AdminFrames;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDiscountPanel extends JPanel {
    private Controller controller;
    private AddDiscountFrame addDiscountFrame;

    private JLabel lblDiscountCode;
    private JLabel lblDiscountPercentage;
    private JLabel lblDiscountReason;

    private JTextField txtDiscountCode;
    private JTextField txtDiscountPercentage;
    private JTextField txtDiscountReason;

    private JButton btnAddDiscount;
    private JButton btnExit;

    public AddDiscountPanel(Controller controller, AddDiscountFrame addDiscountFrame) {
        this.controller = controller;
        this.addDiscountFrame = addDiscountFrame;

        initializeComponents();
        initializeGUI();
        registerListeners();
    }

    private void initializeComponents() {
        lblDiscountCode = new JLabel("Discount code: ");
        lblDiscountCode.setMinimumSize(new Dimension(120,20));
        lblDiscountCode.setPreferredSize(new Dimension(120,20));

        txtDiscountCode = new JTextField();
        txtDiscountCode.setMinimumSize(new Dimension(120,20));
        txtDiscountCode.setPreferredSize(new Dimension(120,20));

        txtDiscountCode.setOpaque(true);
        txtDiscountCode.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        lblDiscountPercentage = new JLabel("Discount percentage: ");
        lblDiscountPercentage.setMinimumSize(new Dimension(120,20));
        lblDiscountPercentage.setPreferredSize(new Dimension(120,20));

        txtDiscountPercentage = new JTextField();
        txtDiscountPercentage.setMinimumSize(new Dimension(120,20));
        txtDiscountPercentage.setPreferredSize(new Dimension(120,20));

        txtDiscountPercentage.setOpaque(true);
        txtDiscountPercentage.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        lblDiscountReason = new JLabel("Discount reason: ");
        lblDiscountReason.setMinimumSize(new Dimension(120,20));
        lblDiscountReason.setPreferredSize(new Dimension(120,20));

        txtDiscountReason = new JTextField();
        txtDiscountReason.setMinimumSize(new Dimension(120,20));
        txtDiscountReason.setPreferredSize(new Dimension(120,20));
        txtDiscountReason.setOpaque(true);
        txtDiscountReason.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        btnAddDiscount = new JButton("Add discount");
        btnAddDiscount.setSize(new Dimension(150, 25));
        btnAddDiscount.setPreferredSize(new Dimension(150, 25));
        btnAddDiscount.setFont(new Font("Helvetica", Font.PLAIN, 12));
        btnAddDiscount.setOpaque(true);
        btnAddDiscount.setBorderPainted(false);

        btnExit = new JButton("Exit");
        btnExit.setSize(new Dimension(200, 25));
        btnExit.setPreferredSize(new Dimension(100, 25));
        btnExit.setFont(new Font("Helvetica", Font.PLAIN, 12));
        btnExit.setOpaque(true);
        btnExit.setBorderPainted(false);

    }

    private void initializeGUI() {
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(500, 400));
        setMaximumSize(new Dimension(500,400));
        setMinimumSize(new Dimension(500,400));

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblDiscountCode, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(txtDiscountCode, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblDiscountPercentage, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(txtDiscountPercentage, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lblDiscountReason, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(txtDiscountReason, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        add(btnAddDiscount, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(btnExit, gbc);
    }

    private void registerListeners(){
        btnAddDiscount.addActionListener(new AddDiscountPanel.BtnAddDiscountListener());
        btnExit.addActionListener(new BtnExitListener());
    }

    private class BtnExitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            addDiscountFrame.dispose();
        }
    }

    private class BtnAddDiscountListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int discountCode = Integer.parseInt(txtDiscountCode.getText());
            double discountPercentageRaw = Double.parseDouble(txtDiscountPercentage.getText());
            String discountReason = txtDiscountReason.getText();

            double discountPercentage = discountPercentageRaw/100;

            if(!discountReason.isEmpty() && discountCode > -1 && discountPercentageRaw > -1){
                controller.sendDiscountInformation(discountCode, discountPercentage, discountReason);
            }
            else {
                JOptionPane.showMessageDialog(null, "Enter all details!");
            }
        }
    }
}