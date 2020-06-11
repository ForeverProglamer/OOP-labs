package lab7;

import com.company.Vegetable;

public class Main {
    public static void main(String[] args){
        MySet mySet = new MySet();
        mySet.add(new Vegetable("H Tomato1", "Red", 40 , 50));
        mySet.add(new Vegetable("o Tomato2", "Yellow", 25 , 30));
        mySet.add(new Vegetable("c Tomato3", "Orange", 30 , 35));
        mySet.add(new Vegetable("h Tomato4", "Green", 50 , 70));
        mySet.add(new Vegetable("y Tomato5", "DarkRed", 45 , 65));
        mySet.add(new Vegetable("T Cucumber1", "Green", 35 , 20));
        mySet.add(new Vegetable("r Cucumber2", "DarkGreen", 40 , 25));
        mySet.add(new Vegetable("o Cucumber3", "LightGreen", 55 , 40));
        mySet.add(new Vegetable("i Cucumber4", "Green", 45 , 30));
        mySet.add(new Vegetable("k Cucumber5", "Green", 60 , 45));
        mySet.add(new Vegetable("y Cabbage1", "LightGreen", 100 , 50));
        mySet.add(new Vegetable(":) Cabbage2", "LightGreen", 120 , 60));
        mySet.add(new Vegetable("Cabbage3", "LightGreen", 110 , 55));
        mySet.add(new Vegetable("Cabbage4", "LightGreen", 140 , 75));
        mySet.add(new Vegetable("Cabbage5", "LightGreen", 90 , 40));
        mySet.add(new Vegetable("Tomato6", "Red", 40 , 50));
        mySet.add(new Vegetable("Tomato7", "Red", 60 , 70));
        mySet.add(new Vegetable("Cabbage6", "LightGreen", 105 , 55));
        mySet.add(new Vegetable("Cucumber6", "Green", 55 , 40));



        for (Object o: mySet) {
            System.out.println(o);
        }

        System.out.println("It`s working!");
       
    }
}
