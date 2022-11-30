package task_3;

public class Car {
    int age;
    double speed;
    int weight;
    String color;

    public Car() {
        this(1,185.7, 1600,"blue");

    }

    public Car(int age) {
        this(age,200.6, 1678, "white");
    }

    public Car(int age, double speed) {
        this(age, speed, 1990, "black");
    }

    public Car(int age, double speed, int weight) {
        this(age, speed, weight, "yellow");
    }

    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
