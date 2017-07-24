package liskovSubstitution.bad;

public class LiskovBadTest {

    private static Rectangle getNewRectangle() {

        // it can be an object returned by some factory ...
        return new Square();
    }

    public static void main(String args[]) {

        Rectangle rectangle = LiskovBadTest.getNewRectangle();

        rectangle.setWidth(5);
        rectangle.setHeight(10);
        // user knows that r it's a rectangle.
        // It assumes that he's able to set the width and height as for the base class

        System.out.println(rectangle.getArea());
        // now he's surprised to see that the area is 100 instead of 50.
    }

}
