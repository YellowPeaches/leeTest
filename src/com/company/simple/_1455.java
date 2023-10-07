package com.company.simple;

public class _1455 {


    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = -1;
        String[] oneWord = sentence.split(" ");
        for (int i = 0; i < oneWord.length; i++) {
            if (oneWord[i].startsWith(searchWord)) {
                index = i + 1;
                break;
            }
        }
        return index;
    }
}
