package com.example.quizgame2.model;

public class WordItem {
    public  final int imageResId;
    public  final String mainword;
    public  final String subword;

    public WordItem(int imageResId, String mainword, String subword) {
        this.imageResId = imageResId;
        this.mainword = mainword;
        this.subword = subword;
    }
}
