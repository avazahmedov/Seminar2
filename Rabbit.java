public class Rabbit extends Herbivores implements Walkable{
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pi-pi-pi";
    }

    @Override
    public String toString() {
        return String.format("Rabbit %s", super.toString());
    }

    @Override
    public int walkSpeed() {
        return 50;
    }
}
