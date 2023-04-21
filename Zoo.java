import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animalList = new ArrayList<>();

    public List<Animal> getAnimalList(){
        return animalList;
    }

    public Zoo addAnimalList(Animal animal){
        animalList.add(animal);
        return this;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    private Radio radio;

    public List<Sayable> getSayableList(){
        List<Sayable> sayableList = new ArrayList<>();
        for (int i = 0; i < getAnimalList().size(); i++) {
            sayableList.add(getAnimalList().get(i));
        }
        sayableList.add(radio);
        return sayableList;
    }

    public List<Walkable> walkables(){
        List<Walkable> walkableList = new ArrayList<>();
        for (int i = 0; i < getAnimalList().size(); i++) {
            if (getAnimalList().get(i) instanceof Walkable){
                walkableList.add((Walkable) getAnimalList().get(i));
            }
        }
        return walkableList;
    }

    public List<Flyable> flyables(){
        List<Flyable> flyableList = new ArrayList<>();
        for (int i = 0; i < getAnimalList().size(); i++) {
            if (getAnimalList().get(i) instanceof Flyable) flyableList.add((Flyable) getAnimalList().get(i));
        }
        return flyableList;
    }

    public Walkable winnerWalk(){
        int index = 0;
        for (int i = 0; i < walkables().size(); i++) {
            if(walkables().get(i).walkSpeed() > walkables().get(index).walkSpeed())
                index = i;
        }
        return walkables().get(index);
    }

    public Flyable winnerFly(){
        int index = 0;
        for (int i = 0; i < flyables().size(); i++) {
            if(flyables().get(i).flySpeed() > flyables().get(index).flySpeed())
                index = i;
        }
        return flyables().get(index);
    }

}
