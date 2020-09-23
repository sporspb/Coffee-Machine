class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        speed += 5;
    }

    void brake() {
        if (speed > 0) {
            speed -= 5;
        } else {
            speed = 0;
        }
    }
}