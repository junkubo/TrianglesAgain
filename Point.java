class Point {
  private double x, y;
  public Point (double X, double Y) {
    x = X;
    y = Y;
  }
  public Point (Point p) {
    x = p.x;
    y = p.y;
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  public double distanceTo(Point other) {
    return Math.sqrt(Math.abs(Math.pow(x - other.getX(), 2) + (Math.abs(Math.pow(y - other.getY(), 2)))));
  }
  public boolean equals(Point other) {
    return x == other.getX() && y == other.getY();
  }
}
