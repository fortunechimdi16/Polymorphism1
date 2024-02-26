public class Main {
    //main class
    public static void main(String[] args) {
        Animal animal = new Animal();
        Wolf wolf = new Wolf();
        Bird bird = new Bird();
        Cat cat = new Cat();
//exercising polymorphism which allows a
// single action to be performed in different ways.
        Animal.hunt();
        Animal.flee();

        wolf.hunt();
        wolf.flee();

        bird.flee();
        bird.hunt();

        cat.hunt();
        cat.flee();

    }
}