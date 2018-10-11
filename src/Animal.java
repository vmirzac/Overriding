class Animal {
    public void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{

    public void move(){
        System.out.println("Dogs can walk and run");
    }
}

 class TestDog{
     public static void main(String[] args) {

         Animal a= new Animal(); // Animal reference and object
         Animal b = new Dog(); // Animal reference but Dog object


         a.move(); // runs the method in the Animal class
         b.move(); //runs the method in the Dog class
     }
}
