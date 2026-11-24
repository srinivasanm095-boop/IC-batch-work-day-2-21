
abstract class Vehicle{
    abstract void StartEngine();
    void stopEngine(){
        System.out.println("Vehicle engine stopped");
    }
}
class Bike extends Vehicle{
    @Override 
    void StartEngine(){
        System.out.println("Bike engine started using self-start");
    }
}
public class Main {
    public static void main(String[] args){
        Bike b=new Bike();
        b.StartEngine();
        b.stopEngine();
    }
}
