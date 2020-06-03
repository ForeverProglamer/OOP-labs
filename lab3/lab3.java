package com.company;
import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte C3 = 9129 % 3;
        System.out.println("Const C3 is: " + C3);
        System.out.println("StringBuilder");

        byte C13 = 9129 % 17;
        System.out.println("Const C13 is: " + C13);
        System.out.println("Знайти найбільшу кількість речень заданого тексту, в яких є однакові слова.");

        StringBuilder txt = new StringBuilder("В этом году мы были на море. Как и в прошлом году, море было достаточно холодным. Тем не менее, наше желание плавать было достаточно сильным. " +
                "Мы зашли в воду и мы быстро окунулись, чтобы привикнуть, после чего поплыли где поглубже. Плавать к буйку и обратно было уже невозможно, море было реально холодным. " +
                "Быстро мы закончили, однако. Два дня после этого отогревался.");


        System.out.println("Enter your word: ");
        String inp_word= input.nextLine();
        String[] sentences = txt.toString().split("\\. ");

        System.out.println("Your word: " .concat(inp_word));
        int counter = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] words1 = sentences[i].split(" ");
            for (int k = 0; k < words1.length; k++) {
                String word1 = words1[k];
                if(inp_word.equalsIgnoreCase(word1) == true) {
                    counter += 1;
                    System.out.println("Find in sentence: ".concat(sentences[i]));

                }
            }
        }
        System.out.println("Number of found sentences: "+ counter);

        String Jenshina = new String(" Женщина");
        String Chelovek = new String(" Человек");
        System.out.println(Jenshina.equals(Chelovek));
    }

}