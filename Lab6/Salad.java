package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Salad {
    private SaladElement[] saladElements;

    public Salad(SaladElement[] saladElements) {
        this.saladElements = saladElements;
    }

    public void caloriesCounter(){
        int counter = 0;
        for (int i = 0; i < saladElements.length; i++) {
            counter += saladElements[i].getCalories();
        }
        System.out.printf("Ваш салат містить %d калорій.\n", counter);
    }
    
    public void colorSort(){
        ArrayList sorted = new ArrayList();
        for (int i = 0; i < saladElements.length; i++) {
            if(saladElements[i] instanceof Vegetable){
                Vegetable veg = (Vegetable) saladElements[i];
                sorted.add(veg.getColor());
            }
        }
        Collections.sort(sorted);
        System.out.println("Відсортовано по кольору: ");
        for (Object s : sorted) {
            System.out.printf("%s ", s);
        }
    }
    public void findInRange(int bottom, int top){
        ArrayList labels = new ArrayList();
        for (int i = 0; i < saladElements.length; i++) {
            if(saladElements[i] instanceof Vegetable){
                Vegetable veg = (Vegetable) saladElements[i];
                int arg = veg.getCalories();
                if(arg > bottom && arg < top){
                    labels.add(veg.getLabel());
                }
            }
        }
        System.out.println("Овочі у даному калорійному діапазоні:");
        for (Object lab : labels) {
            System.out.printf("%s ", lab);
        }
    }
}
