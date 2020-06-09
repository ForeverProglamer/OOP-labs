package com.company;

public class Main {

    public static void main(String[] args) {
        Text text = new Text("All i want is a little of a good life, all i need is to have good time! Oooooh the good life! " + //Three Days Grace - The good life
                "I want to break free, i want to break free. I want to break free from your lies. You`re so self-satisfied, i don`t need you."); // Queen - I want to break free
        System.out.println(text);
        text.sentenceQuantityOfEntrances();

    }
}
