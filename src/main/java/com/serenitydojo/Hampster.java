package com.serenitydojo;

public class Hampster extends Pet {
    private String favoriteGame;

    public static final String HAMPSTER_NOISE = "PfeePfeePfee";

    public Hampster(String name, String favoriteGame, int age) {
        super(name, age);
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    @Override
    public String makeNoise() {
        return Hampster.HAMPSTER_NOISE;
    }

    @Override
    public String play() {
        return ("runs with " + favoriteGame);
    }
}
