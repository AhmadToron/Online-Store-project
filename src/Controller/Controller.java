package Controller;

import View.Main.MainFrame;
import View.Main.MainPanel;
import Model.*;
import View.User.CreateAccountFrame;

import java.util.ArrayList;

public class Controller {

    private DBController DBController;
    private MainFrame mainFrame;
    private MainPanel mainPanel;
    CreateAccountFrame createAccountFrame;

    public Controller(DBController DBController){
        this.DBController=DBController;
        mainFrame = new MainFrame(this, DBController);
        mainPanel = new MainPanel(this);
    }



    public ArrayList<String> getProductsForCustomers() {
        return null;
    }

    public ArrayList<String> getSearchedProducts(String searchedCode, String searchedSupplier, String searchedProduct) {
        return null;
    }

    public ArrayList<String> getAllProducts() {
        return null;
    }

    public ArrayList<String> getProducts() {
        return null;
    }

    public void openCreateAccountWindow() {
        createAccountFrame = new CreateAccountFrame(this, DBController);
    }

    public Countries[] getCountries() {
        return Countries.values();
    }

    public boolean createAdminUser(User admin, String adminPassword) {
        return false;
    }

    public boolean createNormalUser(User regularUser) {
        return false;
    }

    public boolean isUserNormal(String userNameLogin, String passwordLogin) {
        DBController.isUserNormal(userNameLogin, passwordLogin);
        return DBController.isUserNormal(userNameLogin, passwordLogin);
    }

    public boolean isUserAdmin(String userNameLogin, String passwordLogin) {
        DBController.isUserAdmin(userNameLogin, passwordLogin);
        return DBController.isUserAdmin(userNameLogin, passwordLogin);
    }
}
