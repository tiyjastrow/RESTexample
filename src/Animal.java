/**
 * Created by johnjastrow on 4/20/16.
 */
public class Animal {
    String species;
    String name;
    boolean makeSound;
    String sound;

    public Animal(String species, String name, boolean makeSound, String sound) {
        this.species = species;
        this.name = name;
        this.makeSound = makeSound;
        this.sound = sound;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMakeSound() {
        return makeSound;
    }

    public void setMakeSound(boolean makeSound) {
        this.makeSound = makeSound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
