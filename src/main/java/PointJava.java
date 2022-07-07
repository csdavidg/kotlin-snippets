public class PointJava {

    private int x;
    private int y;

    public PointJava(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PointJava plus(PointJava otherPoint) {
        return new PointJava(x + otherPoint.getX(), y + otherPoint.getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "PointJava{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
