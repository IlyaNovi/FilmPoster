package ru.netology.movieposters;
public class Manager {
    private String[] films = new String[0];
    private int limit;

    public Manager () {
        this.limit = 5;
    }
    public Manager (int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
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
        int allFilms;
        if (films.length < limit) {
            allFilms = films.length;
        } else {
            allFilms = limit;
        }
        String[] tmp = new String[allFilms];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }

}


