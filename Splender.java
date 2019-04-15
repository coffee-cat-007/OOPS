//Parent class
class Bike {
    void start() {
        System.out.println("starting");
    }

    void accelerate() {
        System.out.println("Accelerating");
    }

    void decelerating() {
        System.out.println("Breaking");
    }

}

// Child class
class SuperBike extends Bike {
    void accelerate() {
        System.out.println("Hyper Acceleration");
    }

    void decelerating() {
        System.out.println("ABS Breaking");
    }

}

class Splender {

    public static void main(String args[]) {

        Bike parObj = new Bike();

        Bike chObj = new SuperBike();

        SuperBike par = new SuperBike();

        SuperBike chi = new Bike();

    }
}
