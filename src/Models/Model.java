/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author wb2c0
 */
public class Model<T> {

    private ArrayList<T> array = new ArrayList<>();

    public void create(T item) {
        array.add(item);
    }

    public void update(T itemToUpdate, T newItem) {
        int index = array.indexOf(itemToUpdate);
        if (index != -1) {
            array.set(index, newItem);
        }
    }

    public void delete(T item) {
        array.remove(item);
    }

    public ArrayList<T> getAll() {
        return array;
    }

}
