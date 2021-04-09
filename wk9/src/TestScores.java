public class TestScores {
    private String name;
    private double totalScore;
    private int numScores;
//    numbers not initialized start at 0 strings start at null.

    public TestScores(String name){
        this.name = name;
    }

    public void addTestScore(double earned){
        totalScore += earned;
        numScores++;
    }

    public int getNumTestsTaken(){
        return numScores;
    }

    public double getAverage(){
        double finalScore = totalScore/numScores;
        return finalScore;
    }
}
