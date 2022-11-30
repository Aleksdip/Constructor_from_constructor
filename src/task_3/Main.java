package task_3;
/*
Використовуючи Intelij IDEA, створити проект, пакет.
Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
Перевантажити конструктори викликаючи конструктор із конструктора.
Створити клас Main, де створити екземляри класу Машина з різними параметрами.
 */

public class Main {
    public static void main(String[] args) {
        Car ford = new Car();
        Car bmw = new Car(5);
        Car mercedes = new Car(3, 250.5);
        Car toyota = new Car(4, 198.3, 1430);
        Car ferrari = new Car ( 7, 300.2, 1598, "Red");

        System.out.println("Ford: " + "Рік = " + ford.age + ", " + "Швидкість = " + ford.speed + ", " + "Вага = " + ford.weight + ", " + "Колір = " + ford.color);
        System.out.println("BMW: " + "Рік = " + bmw.age + ", " + "Швидкість = " + bmw.speed + ", " + "Вага = " + bmw.weight + ", " + "Колір = " + bmw.color);
        System.out.println("Mercedes: " + "Рік = " + mercedes.age + ", " + "Швидкість = " + mercedes.speed + ", " + "Вага = " + mercedes.weight + ", " + "Колір = " + mercedes.color);
        System.out.println("Toyota: " + "Рік = " + toyota.age + ", " + "Швидкість = " + toyota.speed + ", " + "Вага = " + toyota.weight + ", " + "Колір = " + toyota.color);
        System.out.println("Ferrari: " + "Рік = " + ferrari.age + ", " + "Швидкість = " + ferrari.speed + ", " + "Вага = " + ferrari.weight + ", " + "Колір = " + ferrari.color);
    }
}