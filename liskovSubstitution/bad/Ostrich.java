package liskovSubstitution.bad;

public class Ostrich extends Bird {

    public void fly() {
        throw new UnsupportedOperationException();
    }

}
