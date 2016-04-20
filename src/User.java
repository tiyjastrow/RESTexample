/**
 * Created by johnjastrow on 4/19/16.
 */
public class User {
    public User(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    private String name;
    private int age;
    private boolean married;

    public boolean isAdult(){return (age - 17) > 0; }
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        else {
            this.age = age;
        }
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
