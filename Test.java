class Test {
  public static void main(String[] args) {
    Point p1 = new Point(1, 2);
    Point p2 = new Point(7, 8);
    System.out.println(p1.getX());
    System.out.println(p1.getY());
    System.out.println(p1.distanceTo(p2));

  }
}
