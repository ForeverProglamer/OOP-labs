package com.company;

public class Sentence {
    private static final String punctuationSymbols = ",.!?;";
    private SentenceElement[] sentenceElements;

    public Sentence(SentenceElement[] sentenceElements) {
        this.sentenceElements = sentenceElements;
    }

    public Sentence(String sentenceString) {
        String[] sentenceElementsStrings = sentenceString.split("(?=[" + punctuationSymbols + "])|\\s");
        sentenceElements = new SentenceElement[sentenceElementsStrings.length];
        String sentenceElementString;
        for (int i = 0; i < sentenceElementsStrings.length; i++) {
            sentenceElementString = sentenceElementsStrings[i];
            sentenceElements[i] = punctuationSymbols.contains(sentenceElementString)
                    ? new Punctuation(sentenceElementString)
                    : new Word(sentenceElementString);

        }
    }


    @Override
    public String toString() {
        StringBuilder sentenceString = new StringBuilder();
        for (int i = 0; i < sentenceElements.length; i++) {
            sentenceString.append(
                    (i != 0 && sentenceElements[i] instanceof Word ? " " : "") +
                            sentenceElements[i].toString()
            );
        }
        return sentenceString.toString();
    }


    public int sentenceQuantityOfEntrances(){
        int counter = 0;
    outterLoop: for (int i = 0; i < sentenceElements.length - 1; i++) {
            for (int j = i+1; j < sentenceElements.length; j++) {
                if (sentenceElements[i] instanceof  Word && sentenceElements[j] instanceof Word){
                    Word word = (Word) sentenceElements[i];
                    Word word1 = (Word) sentenceElements[j];
                    if(word.equalsWord(word1)){
                        counter++;
                        break outterLoop;
                    }
                }
            }

        }
        return counter;
    }

}

