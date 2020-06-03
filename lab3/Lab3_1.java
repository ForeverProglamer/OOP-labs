package com.company;

public class Lab3_1 {
    public static void main(String[] args){
        StringBuilder txt = new StringBuilder("В этом году мы были на море. Как и в прошлом году, море было достаточно холодным. Тем не менее, наше желание плавать было достаточно сильным. " +
                "Мы зашли в воду и мы быстро окунулись, чтобы привикнуть, после чего поплыли где поглубже. Плавать к буйку и обратно было уже невозможно, море было реально холодным. " +
                "Быстро мы закончили, однако. Два дня после этого отогревался.");
        String[] sentences = txt.toString().split("(?<=[?!.]) ");
        String[] foundSentences = new String[2];

        int counter;
        counter = 0;

        for (int i = 0; i < sentences.length; i++) {
            String [] words = sentences[i].split(" ");
            for (int j = 0; j < words.length -1; j++) {
                String word = words[j];
                for (int k = j + 1; k < words.length; k++) {
                    String word1 = words[k];
                    if(word.equalsIgnoreCase(word1) == true){
                        System.out.printf("Word %s is equal to %s.\n", word,word1);
                        foundSentences[counter]=sentences[i];
                        counter++;
                    }
                }
            }
        }
        System.out.println();
        System.out.printf("Quantity of sentences with equal words : %d \n" ,counter);
        System.out.println();

        for (String foundSentence : foundSentences) {
            System.out.printf("Found sentence: %s\n", foundSentence);
        }


    }


}
