package liskovSubstitution.good;

public class Rectangle extends Shape {
    
    protected int height;
    protected int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public float area() {
        return width * height;
    }

}
