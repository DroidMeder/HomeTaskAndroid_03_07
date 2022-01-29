package com.example.hometaskandroid_03_07.likefragment;

public class NewLike {
    private final int firstImage;
    private final int firstText;
    private final int secondText;
    private final int SecondImage;

    public NewLike(int firstImage, int firstText, int secondText, int secondImage) {
        this.firstImage = firstImage;
        this.firstText = firstText;
        this.secondText = secondText;
        SecondImage = secondImage;
    }

    public int getFirstImage() {
        return firstImage;
    }

    public int getFirstText() {
        return firstText;
    }

    public int getSecondText() {
        return secondText;
    }

    public int getSecondImage() {
        return SecondImage;
    }
}
