public class Exam {
    public static double getAverage(double d1, double d2, double d3, double d4, double d5){
        double avgGrade = (d1 + d2 + d3 + d4 + d5) / 5;

        return avgGrade;
    }

    public static char determineGrade(double avg){
        char letterGrade;

        if(avg >= 90.0){
            letterGrade = 'A';
        }
        else if(avg <= 89.9 && avg >= 80.0){
            letterGrade = 'B';
        }else if(avg <= 79.9 && avg >= 70.0){
            letterGrade = 'C';
        }else if(avg <= 69.9 && avg >= 60.0){
            letterGrade = 'D';
        }else{
            letterGrade = 'F';
        }

        return letterGrade;
    }
}
