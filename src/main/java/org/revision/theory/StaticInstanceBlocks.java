package org.revision.theory;

class StaticInstanceBlocks {

    String name;
    static int count = 0;
    enum AnimalType {
        CARNIVORE, HERBIVORE
    }
    // this block will be executed only once when a class is loaded
    static {
        AnimalType carnivore = AnimalType.CARNIVORE;
        System.out.println (carnivore);
        System.out.println ("I am created once because i am static");
    }
    // the below block will be executed everytime an instance is created
    {
        count++; // static variable can also be accessed from instance variable
        name = "newAnimal"; // instance variable can be accessed directly
        System.out.println (count);
        System.out.println ("I am created everytime new instance is created");

    }

    static int getCount(){
       // name = "oldAnimal"; // Compile time error
        return count;  // static method can only access static variables
    }

    String getName(){
        count = 2 +1 ; // instance method can access both static variables and instance variables
        return name;
    }

    public static void main(String[] args){
        StaticInstanceBlocks instance1 = new StaticInstanceBlocks ();
        StaticInstanceBlocks instance2 = new StaticInstanceBlocks ();
    }

}


