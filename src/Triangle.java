public class Triangle {
    private Point v1, v2, v3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new Point(x1, y1);
        v2 = new Point(x2, y2);
        v3 = new Point(x3, y3);
    }

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "Triangle @ " + v1 + ", " + v2 + ", " + v3;
    }

    public double getPerimeter() {
        double side1 = Point.distance(v1, v2);
        double side2 = Point.distance(v1, v3);
        double side3 = Point.distance(v2, v3);

        return side1 + side2 + side3;
    }

    public void printType() {
        double side1 = Point.distance(v1, v2);
        double side2 = Point.distance(v1, v3);
        double side3 = Point.distance(v2, v1);

        if (side1 == side2 && side2 == side3) {
            System.out.println("equilateral");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("isosceles");
        }
        else {
            System.out.println("scalene");
        }
    }
}