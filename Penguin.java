class Penguin extends Animal {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Honk!");
    }

    @Override
    public String naturalHabitat() {
        return "Cold coastal regions, especially Antarctica.";
    }
}
