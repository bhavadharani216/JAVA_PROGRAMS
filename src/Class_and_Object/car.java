package Class_and_Object;

class Car {
    private String brand;
    private int speed;
    private double height;

    public void start() {
        System.out.println("Car Started");
    }

    public void stop() {
        System.out.println("Car Stopped");
    }
}

class Test {
    public static void main(String[] args) {
        Car c = new Car();

        c.start();
        c.stop();
    }
}