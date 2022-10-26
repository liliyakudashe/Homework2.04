public class Flightless extends Birds{ // нелетающие птицы

    private String typeOfMovement; // тип перемещения

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = defaultValid(typeOfMovement, "Информация не указана");
    }

    @Override
    public String toString() {
        return "Животное нелетающие птицы " + getName() + ", возраст  " + getAge() +" лет "+
                ". Среда обитания " + getLivingEnvironment() + ", передвигается "+ typeOfMovement +  "\n";
    }

    private void walk(){
        System.out.println("Нелетающие птицы — птицы, утратившие в процессе эволюции способность к полёту.");//гулять
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

}
