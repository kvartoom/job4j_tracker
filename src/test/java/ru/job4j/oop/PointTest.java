package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void when54to914Then10d0t77() {
        Point x = new Point(5, 4);
        Point y = new Point(9, 14);
        double expected = 10.77;
        assertEquals(x.distance(y), expected, 0.01);
    }

    @Test
    public void when1020to2010Then140d0t14() {
        Point x = new Point(10, 20);
        Point y = new Point(20, 10);
        double expected = 14.14;
        assertEquals(x.distance(y), expected, 0.01);
    }

    @Test
    public void when316to823Then8d0t60() {
        Point x = new Point(3, 16);
        Point y = new Point(8, 23);
        double expected = 8.60;
        assertEquals(x.distance(y), expected, 0.01);
    }

    @Test
    public void when654to649Then5dot10() {
        Point p1 = new Point(6, 5, 4);
        Point p2 = new Point(6, 4, 9);
        double expected = 5.10;
        assertEquals(p1.distance3d(p2), expected, 0.01);
    }
}
