abstract class Delivery{
    void acceptOrder(){
        System.out.println("Delivery order accepted");
    }
    abstract void deliverProduct();
}
class FoodDelivery extends Delivery{
    @Override 
    void deliverProduct(){
    System.out.println("Food order delivered to customer");
    }
}
class ParcelDelivery extends Delivery{
    @Override 
    void deliverProduct(){
    System.out.println("Parcel delivered successfully");
    }
}
public class Main3 {
    public static void main(String[] args){
        ParcelDelivery p=new ParcelDelivery();
        p.acceptOrder();
        p.deliverProduct();
        FoodDelivery f=new FoodDelivery();
        f.acceptOrder();
        f.deliverProduct();
    }
    
}
