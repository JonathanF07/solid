package liskovSubstitution.good;

public class Square extends Shape {

    public int sides;

    @Override
    public float area() {
        return sides * sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

}
