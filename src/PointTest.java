public class PointTest {
    public static void main(String[] args) {
        Point p = new Point();
        Point3D p3d = new Point3D();
        System.out.println(p);
        System.out.println(p3d);
        p.setX(12.5);
        p.setY(69.12);
        p3d.setZ(132.4);
        p3d.setX(15);
        p3d.setY(43.1);
        System.out.println(p);
        System.out.println(p3d);

        Movable c = new Circle(p,5);
        System.out.println(c);
        c.moveDown();
        c.moveRight();
        System.out.println(c);
    }
}
