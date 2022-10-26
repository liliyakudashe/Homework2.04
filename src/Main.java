public class Main {
    public static void main(String[] args) {

        Trovivores gazelle = new Trovivores("Газель", 5,"пустыня",150,"листья");
        Trovivores giraffe = new Trovivores("Жираф",6,"тропики", 55, "листья деревьев");
        Trovivores horse = new Trovivores("Лошадь",2,"степи",60,"сено");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        gazelle.eat();
        giraffe.sleep();
        horse.moveAround();

        Predators hyena = new Predators("Гиена", 1,"пустыня", 40, "падаль");
        Predators tiger = new Predators("Тигр",5,"мангровые болота",60,"мясо");
        Predators bear = new Predators("Медведь", 8,"арктика",60,"рыба");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        hyena.eat();
        tiger.sleep();
        bear.moveAround();

        Amphibians frog = new Amphibians("Лягушка", 1,"водоём");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный",1,"водоём");

        System.out.println(frog);
        System.out.println(alreadyFreshwater);
        frog.eat();
        alreadyFreshwater.sleep();
        frog.moveAround();

        Flightless peacock = new Flightless("Павлин", 2,"саванна", "пешком");
        Flightless penguin = new Flightless("Пингвин", 5,"арктика","пешком");
        Flightless dodo = new Flightless("Птица додо", 2,"лес","пешком");

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        peacock.eat();
        penguin.sleep();
        dodo.moveAround();

        Flying seagull = new Flying("Чайка", 3,"морские акватория","летает");
        Flying albatross = new Flying("Альбатрос", 2,"ледяные воды","летает");
        Flying falcon = new Flying("Сокол", 5,"тайга", "летает");

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
        seagull.eat();
        albatross.sleep();
        falcon.moveAround();

    }
}