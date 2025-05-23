class Elephant extends Animal {

    public Elephant(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says: Trumpet!");
    }
    @Override
    public String naturalHabitat() {
        return "Forests, grasslands, and swamps in Africa and Asia.";
    }
}
