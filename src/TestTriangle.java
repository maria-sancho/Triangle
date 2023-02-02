public class TestTriangle {
    public static void main(String[] args) {
        Point p1 = new Point(3, 1);
        Point p2 = new Point(6, 8);
        Point p3 = new Point(7, 2);

        Triangle t1 = new Triangle(p1, p2, p3);

        System.out.println(t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.print("Type: ");
        t1.printType();

        Triangle t2 = new Triangle(5, 2, 1, 3, 9, 10);
        System.out.println(t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.print("Type: ");
        t2.printType();
    }
}