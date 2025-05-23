abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound();
    public abstract String naturalHabitat();
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Habitat: " + naturalHabitat());
    }
}
