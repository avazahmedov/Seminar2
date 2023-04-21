public class Bat extends Predator implements Flyable, Walkable{
    public Bat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Chi-chi-chi";
    }

    @Override
    public String toString() {
        return String.format("Bat %s", super.toString());
    }


    @Override
    public int flySpeed() {
        return 100;
    }

    @Override
    public int walkSpeed() {
        return 45;
    }
}
