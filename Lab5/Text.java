package com.company;

public class Text {
    private Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public Text(String textString) {
        String[] sentencesStrings = textString.split("(?<=[?!.]) ");
        sentences = new Sentence[sentencesStrings.length];
        for (int i = 0; i < sentencesStrings.length; i++) {
            sentences[i] = new Sentence(sentencesStrings[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder textString = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            textString.append(sentences[i].toString() + (i != sentences.length - 1 ? " " : ""));
        }
        return textString.toString();
    }


    public void sentenceQuantityOfEntrances(){
        String[] foundSentences = new String[sentences.length];
        int counter;
        counter = 0;
        for (Sentence sentence : sentences) {
            counter += sentence.sentenceQuantityOfEntrances();

        }

        System.out.printf("Quantity of sentneces with equal words: %d", counter);
    }

}
