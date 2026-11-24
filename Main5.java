
interface Alert {
    void sendAlert(String message);
}
class EmailAlert implements Alert {
    @Override
    public void sendAlert(String message) {
        System.out.println("Email Alert: " + message);
    }
}
class MobileAlert implements Alert {
    @Override
    public void sendAlert(String message) {
        System.out.println("Mobile Alert: " + message);
    }
}
public class Main5 {
    public static void main(String[] args) {
        Alert a1 = new EmailAlert();
        Alert a2 = new MobileAlert();
        a1.sendAlert("Your order has been shipped");
        a2.sendAlert("Your OTP is 123456");
    }
}
