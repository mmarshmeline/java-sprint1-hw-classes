public class Converter {

    final static int stepLength = 75;
    final static int stepCalories = 50;

    static void convertStepsToKm(int stepsTotal, int stepLength) {
        System.out.println("Пройденная дистанция (в км): " + (stepsTotal * stepLength / 10_000));
    }
    static void convertStepsToCalories(int stepsTotal, int stepCalories){
        System.out.println("Количество сожжённых ккал: " + (stepsTotal * stepCalories / 1000));
    }
}
