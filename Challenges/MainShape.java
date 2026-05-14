abstract class Shape {

  abstract double Perimeter();

  abstract double Area();

}

class Circle extends Shape {
  double radius;
  double perimeter;
  double area;

  @Override
  double Perimeter() {

    perimeter = 2 * Math.PI * radius;
    return perimeter;
  }

  @Override
  double Area() {
    area = 2 * Math.PI * radius;
    return area;
  }
}

class Ractangle extends Shape {

  double lenght;
  double breath;
  double perimeter;
  double area;

  @Override
  double Perimeter() {

    perimeter = 2 * (lenght + breath);
    return 0;
  }

  @Override
  double Area() {

    area = lenght * breath;
    return area;
  }

}

public class MainShape {
  public static void main(String[] args) {

    Circle r1 = new Circle();
    r1.radius = 32.4;
    System.out.println(r1.Perimeter());

    Ractangle s1 = new Ractangle();
    s1.lenght = 45.45;
    s1.breath = 54.54;

    System.out.println(s1.Area());

  }
}
