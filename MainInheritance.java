class Animal{
 
    void eat(){

        System.out.println("Animal is Eating");
    }
    
    void sleep(){

        System.out.println("Animal is Sleeping");
    }

}
class Dog extends Animal{
        void bark(){
            System.out.println("Dog is Barking");
        }
}


public class MainInheritance{
    public static void main(String [] args){
            Dog myDog = new Dog();
            myDog.eat();
            myDog.sleep();

            myDog.bark();

    }
}
