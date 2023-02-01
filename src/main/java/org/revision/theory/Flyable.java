package org.revision.theory;

interface Movable {
     void move();
}

interface NonMovable {
     void halt();
}

interface Flyable extends Movable, NonMovable { //Note : Interface can extend multiple interface
      int num = 10;

      default void fly (){
          System.out.println ("I can Fly");
      }

     void stop();
}

class Aeroplane extends Company implements Flyable {
     int count;
     public void move() {
          System.out.println ("I can move out");
     }

     public void stop () {
          System.out.println ("I am stopping");
     }

     public void fly(){
     System.out.println ("Flying already yeh");
     }

     @Override
      void name () {
          System.out.println ("I am implemeting an abstract method from one of the abstract classes");
     }

     @Override
     public void halt () {

     }
}

abstract class Company extends Engine {
     abstract void name ();
}

abstract class Engine{ // methods in an abstract classes can have any visibility  but methods of an interface should always be public in sub-class where it is being implemented
     void engineType() {
          System.out.println ("Default Engine Type");
     }
}

class Runner{
     public static void main(String args[]){
          Aeroplane a1 = new Aeroplane ();
          System.out.println (a1.num);
          a1.fly ();
          a1.stop ();
          a1.engineType ();
          System.out.println ( a1 instanceof Company);

     }
}
