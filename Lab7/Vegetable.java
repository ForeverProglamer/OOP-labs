package com.company;

public class Vegetable extends SaladElement{
    private String label;
    private String color;
    private int weight;

    public Vegetable(String label,String color, int weight, int calories) {
        super(calories);
        this.label = label;
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "Label: "+label+"; "+"Color: "+color+"; "+"Weight"+weight;
    }
}
