class Test {
  public static void main(String[] args) {
    Point p1 = new Point(1, 2);
    Point p2 = new Point(7, 8);
    Point p3 = new Point(5, 9);
    Point p1s = new Point(1, 2);
    System.out.println(p1.getX());
    System.out.println(p1.getY());
    System.out.println(p1.distanceTo(p2));
    System.out.println(p1.equals(p1s));
    System.out.println(p1.equals(p2));
    Triangle t1 = new Triangle(p1, p2, p3);
    System.out.println(t1.getPerimeter());
    System.out.println(t1.getArea());
    System.out.println(t1.toString());
    System.out.println(t1.classify());
  }
}
