package org.revision.theory;

import java.io.*;

class Rectangle implements Serializable {
    float length;
    float breadth;
    transient float area; // making field transient it will not be picked up for serialization

    public Rectangle(float length,float breadth){
        this.length = length;
        this.breadth  = breadth;
        area = length * breadth;
    }

    @Override
    public String toString () {
        return "[ Length X Breadth X Area = " +length + " X " + breadth + " X "+area +" ]";
    }
}


public class SerializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Rectangle rectangle = new Rectangle (10,15);
        FileOutputStream fos = new FileOutputStream ("Rectangle.ser");
        ObjectOutputStream oos= new ObjectOutputStream (fos);
        oos.writeObject (rectangle);
        System.out.println (rectangle);

        FileInputStream fis = new FileInputStream ("Rectangle.ser");
        ObjectInputStream ois = new ObjectInputStream (fis);
        Rectangle newRectangle = (Rectangle) ois.readObject ();

        System.out.println (newRectangle.length +" "+newRectangle.breadth +" "+ newRectangle.area);
    }

}
