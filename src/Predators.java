public class Predators extends Mammals{ // хищники

    private String typeOfFood;// тип пищи

    public Predators(String name, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = defaultValid(typeOfFood, "Информация не указана");
    }

    @Override
    public String toString() {
        return "Животное млекопитающее хищник " + getName()+ ", возраст "+ getAge()+". Среда обитания "+
                getLivingEnvironment()+", питается "+ typeOfFood +  "\n";
    }

    private void hunt(){
        System.out.println("Хищники питаются другими животными. Они поедают пойманную добычу, но прежде лишают её жизни. При этом есть звери, которые начинают рвать плоть жертвы ещё до того, как она умрёт.");//охотиться
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

}
