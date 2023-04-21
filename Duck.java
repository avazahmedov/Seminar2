public class Duck extends Herbivores implements Flyable, Walkable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Krya-krya-krya";
    }

    @Override
    public String toString() {
        return String.format("Duck %s", super.toString());
    }

    @Override
    public int flySpeed() {
        return 80;
    }

    @Override
    public int walkSpeed() {
        return 5;
    }
}
