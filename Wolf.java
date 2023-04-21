public class Wolf extends Predator implements Walkable{
    public Wolf(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Uuuu";
    }

    @Override
    public String toString() {
        return String.format("Wolf, %s", super.toString() );
    }

    @Override
    public int walkSpeed() {
        return 60;
    }
}
