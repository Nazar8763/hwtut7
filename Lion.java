class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says: Roar!");
    }
    @Override
    public String naturalHabitat() {
        return "Savannahs and grasslands of Africa.";
    }
}
