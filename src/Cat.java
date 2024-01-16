public class Cat extends Animal {
    String color;
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    public void makeSound(){
        System.out.println("мяу-мяу");
    }
    public void purr() {
        System.out.println("Муууур");
    }
}
