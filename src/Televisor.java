public class Televisor {
    boolean status;

    public void turnOff() {
        status = false;
    }

    public void turnOn() {
        status = true;
    }

    public void showStatus() {
        System.out.println(status);
    }
}