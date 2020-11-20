public class Point3D extends Point{
    private double z;

    public Point3D() {
        z = 1;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D[" +
                "x=" + super.getX() +
                ",y=" + super.getY() +
                ",z=" + z +
                ']';
    }
}
