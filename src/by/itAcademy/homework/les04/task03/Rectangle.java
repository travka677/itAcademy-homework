package by.itAcademy.homework.les04.task03;

public class Rectangle {
    private Point p1;
    private Point p2;

    public Rectangle (Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP1() {
        return p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP2() {
        return p2;
    }

    public double area() {
        double a = p2.getX() - p1.getX();
        double d = p1.distance(p2);
        return a * Math.sqrt(d*d - a*a);
    }

    public double diagonalLength() {
        return p1.distance(p2);
    }

}
