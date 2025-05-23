public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo");
        Animal elephant = new Elephant("Ella");
        Animal penguin = new Penguin("Penny");

        Animal[] animals = {lion, elephant, penguin};

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            System.out.println();
        }
    }
}
