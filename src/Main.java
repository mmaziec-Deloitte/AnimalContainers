import java.util.List;

public class Main {
    public static void main(String[] args) {

        Container<Animal> animals = new Container<>(
                List.of(new Animal("Cat1", 9),
                        new Mammal("Human1", 58),
                        new Dog("Husky","Boney", 13)));


        Container<Mammal> mammals = new Container<>(
          List.of(new Mammal("Adam", 54),
                  new Mammal("Danny", 10),
                  new Mammal("Pluto", 5))
        );

        Container<Dog> dogs = new Container<>(
                List.of(new Dog("York", "Dusty", 1),
                        new Dog("Shiba", "Kostek", 2),
                        new Dog("Bulldog", "James", 3))
        );

        //Displaying the containers via their propher methods
        Display display = new Display();
        display.displayAnimals(animals);
        display.displayMammals(mammals);
        display.displayDogs(dogs);

        // Animal container can show results for mammals and dogs too (as intended)
        display.displayAnimals(mammals);
        display.displayAnimals(dogs);

        display.displayAnimals(dogs);
        display.displayMammals(dogs);
        display.displayDogs(dogs);

        // Incorrect type of container => compilation error
        display.displayMammals(animals);
        display.displayDogs(mammals);
        display.displayDogs(animals);
    }
}