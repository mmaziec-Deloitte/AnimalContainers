import java.util.List;

public class Display {

    private void printList(List<?> list) {
        list.forEach(System.out::println);
    }

    public void displayAnimals(Container<? extends Animal> container) {
        printList(container.getT());
    }

    public void displayMammals(Container<? extends Mammal> container) {
        printList(container.getT());
    }

    public void displayDogs(Container<? extends Dog> container) {
        printList(container.getT());
    }
}
