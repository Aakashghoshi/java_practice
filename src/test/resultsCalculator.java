package test;

public class resultsCalculator {
    public static void main(String[] args) {
        String[] classNames = {"Rick", "Tom", "Jill", "Megan"};

        double[][] classResults =  {
                {100.0, 87.5, 95.3, 80.0},
                {95.6, 25.0, 70.7, 85.0},
                {95.3, 96.7, 82.6, 87.5},
                {61.8, 55.9, 60.1, 60.6}
        };



        System.out.println("Class results: ");
        processResults(classNames, classResults);
    }

    public static void processResults(String[] names, double[][] scores) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Student: " + names[i]);
            System.out.print("\tAverage: ");
            //A 2D array is an array of arrays - so here, we use the 1D array containing the scores for the current student based on the counter.
            System.out.println(returnAverage(scores[i]) + "\t");
        }
    }
    public static double returnAverage(double scores[]) {
        double sum = 0;

        //Add all the scores for this student - no need for a nested loop if you only process data for one student.
        for (int j = 0; j < scores.length; j++) {
            sum += scores[j];
        }

        //Calculate the average for this student.
        double average = sum/scores.length;
        return average;
    }
}
