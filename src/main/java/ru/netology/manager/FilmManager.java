package ru.netology.manager;

public class FilmManager {
    private String[] films = new String[0];
    private int countFilms;

    public FilmManager() {
        this.countFilms = 5;
    }

    public FilmManager(int countFilms) {
        this.countFilms = countFilms;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int result;
        if (films.length < countFilms) {
            result = films.length;
        } else {
            result = countFilms;
        }
        String[] tmp = new String[result];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}