package md.tekwillacademy.zooclubservice;

public class Dog extends Animal{

    private boolean hasAGoodLife;

    public Dog(String nameOfTheDog, boolean hasAGoodLife){
        super(nameOfTheDog);
        this.hasAGoodLife = hasAGoodLife;
    }

    public Dog(String nameOfTheDog){
        super(nameOfTheDog);
        this.hasAGoodLife = hasAGoodLife;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating dogfood");
    }

    public String getName(){
        return this.name + "This is from the child class";
    }
}
