//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты можешь водить!");
        } else {
            System.out.println("Ты не можешь водить!");
        }

        int score = 70;
        if (score <= 60) {
            System.out.println("Ты не прошел тест!");
        } else {
            System.out.println("Ты прошел тест!");
        }

        age = 19;
        if (age > 18 && age < 21) {
            System.out.println("Ты достаточно взрослый для того, чтобы водить но не достаточно взрослый, чтобы пить алкоголь!");
        }

        if (age < 7 || age > 18) {
            System.out.println("В этом возрасте ты не должен ходить в школу!");
        }

        boolean skyIsClear = true;
        if (skyIsClear) {
            System.out.println("Небо чистое!");
        }

        boolean canNotGoToSchool = age < 7 || age > 18;
        if (age > 18 && age < 21) {
            System.out.println("Ты достаточно взрослый для того, чтобы водить но не достаточно взрослый, чтобы пить алкоголь!");
        }
        if (canNotGoToSchool) {
            System.out.println("В этом возрасте ты не должен ходить в школу!");
        }

        int temperature = 35;
        if (temperature <= 0 || temperature >= 40) {
            System.out.println("Сейчас экстримальные условия!");
        }

    }
}