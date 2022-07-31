public class StepTracker {
    MonthData[] monthToData;
    private int stepsGoal = 10_000;


    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        int[] days = new int[30];
        public void daySteps(int steps, int day) {
            days[day] = steps;
        }
    }

    public int getStepsGoal() {
        return stepsGoal;
    }

    public void setStepsGoal(int stepsGoal) {
        if (stepsGoal < 0) {
            System.out.println("Число шагов должно быть неотрицательным значением");
            System.out.println();
        } else {
            this.stepsGoal = stepsGoal;
            System.out.println("Цель по количеству шагов в день изменена!");
            System.out.println();
        }
    }

    public void saveSteps(int month, int day, int steps){
        monthToData[month].daySteps(steps, day);
        System.out.println("Значение сохранено!");
        System.out.println();
    }

    public void printStatistic(int month){
        int stepsTotal = 0;
        int averageSteps = 0;
        int maxSteps = 0;
        int bestSeriesSteps = 0;
        int countSeries = 0;

        for(int i = 0; i<30; i++) {
                        System.out.println("День " + (i+1) + ": " + monthToData[month].days[i]);

            stepsTotal = stepsTotal + monthToData[month].days[i];
            if (maxSteps<monthToData[month].days[i]) {
                maxSteps = monthToData[month].days[i];
            }

            if (monthToData[month].days[i] == 0) {
                countSeries = 0;
            } else {
                if (stepsGoal<=monthToData[month].days[i]) {
                    countSeries++;
                    bestSeriesSteps = countSeries;
                }
            }
        }

        averageSteps = stepsTotal / 30;

        System.out.println("Общее количество шагов за месяц: " + stepsTotal);
        System.out.println("Максимальное пройденное количество шагов в этом месяце :" + maxSteps);
        System.out.println("Среднее количество шагов: " + averageSteps);
        Converter.convertStepsToKm(stepsTotal, Converter.stepLength);
        Converter.convertStepsToCalories(stepsTotal, Converter.stepCalories);
        System.out.println("Лучшая серия: " + bestSeriesSteps);
        System.out.println();

    }


}
