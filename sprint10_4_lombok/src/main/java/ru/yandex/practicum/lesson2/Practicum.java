package ru.yandex.practicum.lesson2;

class Point {
    private int x;
    private int y;

    public Point() { }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Practicum {

    public static void main(String[] args) {
        final Point point1 = new Point(1, 1);
        final Point point2 = new Point(2, 2);
        final Point point3 = checkAndAddPoints(point1, point2);
        System.out.println("Новая точка: " + point3);
    }

    public static Point checkAndAddPoints(final Point point1, final Point point2) {
        if(point1.equals(point2)) {
            return new Point(point1.getX(), point1.getY());
        }

        final Point point = new Point();
        point.setX(point1.getX() + point2.getX());
        point.setY(point1.getY() + point2.getY());
        return point;
    }
}
