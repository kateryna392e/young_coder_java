package figures;

public class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Rectangle area = new Rectangle(5, 10);
System.out.println(area.a *" "*area.b);
}