import java.util.Objects;

public abstract class Animals {//животные
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = defaultValid(name, "Информация не указана");
        this.age = Math.max(age, 0);
    }

    public String defaultValid (String valid, String defaul){
        if (valid == null || valid.isBlank() || valid.isEmpty()){
            return defaul;
        } else {
            return valid;
        }
    }

    public abstract void eat();//кушать

    public abstract void sleep();//спать

    public abstract void moveAround();//перемещаться

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
