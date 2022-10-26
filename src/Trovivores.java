public class Trovivores extends Mammals{// травоядные

    private String typeOfFood;//тип пищи

    public Trovivores(String name, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = defaultValid(typeOfFood, "Информация не указана");
    }

    @Override
    public String toString() {
        return "Животное травоядное млекопитающее " + getName() + ", возраст  " + getAge() +" лет "+
                ". Среда обитания " + getLivingEnvironment() + ", передвигается со скоростью "+
                getMovementSpeed()+ ", питается "+ typeOfFood+  "\n";
    }

    private void graze(){
        System.out.println("Большинство травоядных животных живут группами или стадами, то есть они социальные");//пастись
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

}
