//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Task 2
        System.out.println("Task 2");
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        //Task 3
        System.out.println("Task 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }
        //Task 4
        System.out.println("Task 4");
        age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет.");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу.");
        }
        //Task 5
        System.out.println("Task 5");
        age = 14;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе.");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе в сопровождении.");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        //Task 6
        System.out.println("Task 6");
        int carriageCapacity = 102;
        int seatingPosition = 60;
        //int standingPlaces = carriageCapacity - seatingPosition;
        int currentPassengers = 64;
        if (currentPassengers < carriageCapacity) {
            if (currentPassengers < seatingPosition) {
                System.out.println("В вагоне есть сидячие места.");
            } else {
                System.out.println("В вагоне остались стоячие места.");
            }
        } else {
            System.out.println("В вагоне не осталось мест.");
        }
        //Task 7
        System.out.println("Task 7");
        int one = 4;
        int two = 7;
        int three = 6;
        int maxNumber = (one > two ? one : two) > three ? (one > two ? one : two) : three;
        System.out.println("Самое большое число " + maxNumber);

    }
}