public class Mammals extends Animals {//млекопитающиеся

    private String livingEnvironment; // среда обитания
    private double movementSpeed; // скорость передвижения

    public Mammals(String name, int age, String livingEnvironment, double movementSpeed) {
        super(name, age);
        this.livingEnvironment = defaultValid(livingEnvironment, "Информация не указана");
        this.movementSpeed = Math.max(movementSpeed, 0);
    }

    private void walk(){
    } // гулять

    @Override
    public void eat() {
        System.out.println("Класс позвоночных животных, основной отличительной особенностью которых является вскармливание детёнышей молоком");
    }

    @Override
    public void sleep() {
        System.out.println("Сон у животных относится к поведенческому и физиологическому состоянию, характеризующемуся измененным сознанием, сниженной реактивностью на внешние раздражители и гомеостатической регуляцией, наблюдаемой у различных животных");
    }

    @Override
    public void moveAround() {
        System.out.println("Большинство млекопитающих передвигается по суше тем же способом, что и маленький ребёнок - на четвереньках: сначала поднимают переднюю правую конечность, затем переднюю левую, потом правую заднюю. Животное всегда опирается о землю тремя конечностями и может при необходимости резко остановиться, не рискуя упасть.");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = defaultValid(livingEnvironment, "Информация не указана");
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = Math.max(movementSpeed, 0);
    }
}
