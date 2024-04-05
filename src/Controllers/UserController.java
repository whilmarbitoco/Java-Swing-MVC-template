/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.User;
import Views.HomeView;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author wb2c0
 */
public class UserController implements Controller{
    User userModel;
    
    HomeView homeView;
    
    public void run() {
        userModel = new User();
        
        homeView = new HomeView(this);
        homeView.setVisible(true);
        
        initialize();
    }
    
    private void initialize() {
        homeView.populateTable(userModel.getAll());
    }
    
    @Override
    public void addUser(String name, int age) {
        userModel.create(new User(new Random().nextInt(), name, age));
        initialize();
    }

    @Override
    public void search(String charac) {
            homeView.populateTable(userModel.search(charac));
    }
    
}
