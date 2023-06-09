package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void testAdd3() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd0() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd1() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast3() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast5() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast7() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast0() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast1() {
        FilmsManager manager = new FilmsManager();

        manager.add("Movie 1");

        String[] actual = manager.findLast();
        String[] expected = {"Movie 1"};
        Assertions.assertArrayEquals(expected, actual);
    }
}