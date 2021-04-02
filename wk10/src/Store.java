public class Store {
    public static double calculateRetail(double wholesale, double markup){
        double percent = markup / 100;
        double total = wholesale + (percent * wholesale);


        return total;
    }
}
