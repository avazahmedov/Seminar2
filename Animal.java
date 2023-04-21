public abstract class Animal implements Sayable{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // public abstract String say();
    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, Say: %s, Eats: %s", name, say(), feed());
    }
}
