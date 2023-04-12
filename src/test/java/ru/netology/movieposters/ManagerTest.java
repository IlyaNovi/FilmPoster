package ru.netology.movieposters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void shouldReverseAllFilm() {
        Manager manager = new Manager();
        manager.addFilm("1Вперед");
        manager.addFilm("2Бладшот");
        manager.addFilm("3Отель Белград");
        manager.addFilm("4film");
        manager.addFilm("5film");
        manager.addFilm("6film");
        manager.addFilm("7film");

        String[] expected = {"1Вперед", "2Бладшот", "3Отель Белград", "4film", "5film", "6film", "7film"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldReverseLimit5Film() {
        Manager manager = new Manager();
        manager.addFilm("1Вперед");
        manager.addFilm("2Бладшот");
        manager.addFilm("3Отель Белград");
        manager.addFilm("4film");
        manager.addFilm("5film");

        String[] expected = {"1Вперед", "2Бладшот", "3Отель Белград", "4film", "5film"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldReverseOneFilm() {
        Manager manager = new Manager();
        manager.addFilm("1Вперед");

        String[] expected = {"1Вперед"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
//
//    @Test
//    public void lastAddedFilmsFromEnd() {
//        Manager manager = new Manager();
//        manager.addFilm("1Вперед");
//        manager.addFilm("2Бладшот");
//        manager.addFilm("3Отель Белград");
//        manager.addFilm("4film");
//        manager.addFilm("5film");
//        manager.addFilm("6film");
//        manager.addFilm("7film");
//
//        String[] expected = {"7film", "6film", "5film", "4film", "3Отель Белград"};
//        String[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//
//    }
//
//    @Test
//    public void limitFilms() {
//        Manager manager = new Manager();
//        manager.addFilm("1Вперед");
//        manager.addFilm("2Бладшот");
//        manager.addFilm("3Отель Белград");
//        manager.addFilm("4film");
//        manager.addFilm("5film");
//
//        String[] expected = {"5film", "4film", "3Отель Белград", "2Бладшот", "1Вперед"};
//        String[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//
//    }
//
//    @Test
//    public void last3FilmsFromEnd() {
//        Manager manager = new Manager();
//        manager.addFilm("1film");
//        manager.addFilm("2film");
//        manager.addFilm("3film");
//
//        String[] expected = {"3film", "2film", "1film"};
//        String[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//
//    }
//
//    @Test
//    public void OneFilms() {
//        Manager manager = new Manager();
//        manager.addFilm("1film");
//
//        String[] expected = {"1film"};
//        String[] actual = manager.findLast();
//
//        Assertions.assertArrayEquals(expected, actual);
//
//    }

}
