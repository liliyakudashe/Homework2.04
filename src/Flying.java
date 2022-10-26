public class Flying extends Birds{//летающие птицы

    private String typeOfMovement; // тип перемещения

    public Flying(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = defaultValid(typeOfMovement, "Информация не указана");
    }

    @Override
    public String toString() {
        return "Животное летающие птицы " + getName() + ", возраст  " + getAge() +" лет "+
        ". Среда обитания " + getLivingEnvironment() + ", передвигается "+ typeOfMovement +  "\n";
    }

    private void toFly(){
        System.out.println("Птицы летают двумя различными способами. Если они непрерывно машут крыльями, то такой полет называют машущим. Если же они планируют, используя перемещение слоев воздуха, то говорят, что птицы парят. ");//летать
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

}
