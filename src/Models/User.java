/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author wb2c0
 */
public class User extends Model<User> {

    public int id;
    public String name;
    public int age;
    
     public User() {
        super();
    }

    // Constructor for creating a user
    public User(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public ArrayList<User> search(String keyword) {
        ArrayList<User> tmp = new ArrayList<>();
        
        for (User user : getAll()) {
            if (user.name.contains(keyword)) {
                tmp.add(user);
                
            }
        }
        return tmp;
    }

}
