public abstract class Bird {
    abstract void ativity();
    void eat() {
        System.out.println("I am eating");
    }
    void eat(String food) {
        System.out.println("I am eating " + food);
    }
}
