public class Amphibians extends Animals{ // земноводные

    private String livingEnvironment;// среда проживания

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = defaultValid(livingEnvironment, "Информация не указана");
    }

    @Override
    public String toString() {
        return "Животное земноводные " + getName()+ ", возраст "+ getAge()+". Среда обитания "+
                getLivingEnvironment() +  "\n";
    }

    private void hunt(){
        System.out.println("Земноводных называют хищниками, так как они исключительно питаются насекомыми, их личинками, маленькими рыбами или моллюсками.");//охотиться
    }

    @Override
    public void eat() {
        System.out.println("Пища земноводных довольно однообразна. Отличия в кормах наших видов невелики: все они во взрослом состоянии питаются различными беспозвоночными — насекомыми, червями, ракообразными, моллюсками. ");
    }

    @Override
    public void sleep() {
        System.out.println("Как правило, все рептилии и земноводные обитающие в зонах с умеренным климатом (например, в Европе или Северной Америке), впадают в спячку");
    }

    @Override
    public void moveAround() {
        System.out.println("Органы движения земноводных устроены таким образом, чтобы их обладатели могли активно передвигаться как в воде, так и на суше.");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = defaultValid(livingEnvironment, "Информация не указана");
    }
}
