public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addAnimalList(new Wolf("Jojo"))
                .addAnimalList(new Rabbit("Zaza"))
                .addAnimalList(new Duck("DonaldDuck"))
                .addAnimalList(new Bat("Batman"));
        for (int i = 0; i < zoo.getAnimalList().size(); i++) {
            System.out.println(zoo.getAnimalList().get(i));
        }

        for (int i = 0; i < zoo.getSayableList().size(); i++) {
            System.out.println(zoo.getSayableList().get(i).say());
        }

        for (int i = 0; i < zoo.walkables().size(); i++) {
            System.out.printf("%s - Speed: %d\n", zoo.walkables().get(i).toString(), zoo.walkables().get(i).walkSpeed());
        }

        System.out.println(zoo.flyables().toString());
        System.out.println("Winner " + zoo.winnerWalk());
        System.out.println("Winner " + zoo.winnerFly());
    }
}
