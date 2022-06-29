public class Cat extends Pet implements Meowable{
    private String color;
//    Create a class named Cat inside of java that inherits from Pet.
//
//    Add a private field named color that is a String. This field represents the color of each instance of Cat.
//    Write the constructor on Cat that has 4 parameters: the age of the cat, a boolean indicating whether the cat is a rescue, what the cat's name is, and the color of the cat. The corresponding fields of the object should be set based on the arguments passed to the constructor. (Hint: use of the super constructor may be useful here)
//    Write a getter and setter on the Cat class for the color field.


    public Cat(int age, boolean isRescue, String name, String color) {
        super(age, isRescue, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meow(){
        System.out.println("This is a meow!");
    }
}
