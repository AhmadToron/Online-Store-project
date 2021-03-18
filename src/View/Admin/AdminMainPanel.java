package View.Admin;

import View.Main.MainPanel;

import javax.swing.*;
import java.awt.*;

public class AdminMainPanel extends JPanel {
    private MainPanel mainPanel;
    private OptionsPanel optionsPanel;
    private AdminStorePanel adminStorePanel;

    public AdminMainPanel(MainPanel mainPanel) {
        this.mainPanel = mainPanel;

        initializeComponents();
        initializeGUI();
    }

    private void initializeComponents() {
        this.optionsPanel = new OptionsPanel(this);
        this.adminStorePanel = new AdminStorePanel(this);
    }

    private void initializeGUI() {
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(600, 600));
        setMaximumSize(new Dimension(600, 600));
        setMinimumSize(new Dimension(600, 600));
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        add(optionsPanel, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        add(adminStorePanel, gbc);
    }
}