public class wallBottles {
    public static void main(String[] args){

        for (int i = 99; i > 57; i--){
            if (i <= 99 && i > 2){
                System.out.println(i + " bottles of Pepsi on the wall, "
                        + i + " bottles of Pepsi.\nTake one down, pass it around, "
                        + (i - 1) + " bottles of Pepsi on the wall.");
            }
            else if( i == 2){
                System.out.println(i + " bottles of Pepsi on the wall, "
                        + i + " bottle of Pepsi\nTake one down, pass it around, "
                        + (i - 1) + " bottle of Pepsi on the wall.");
            }
            else if(i == 1){
                System.out.println(i + " bottle of Pepsi on the wall, "
                        + i + " bottle of Pepsi\nTake one down, pass it around, "
                        + (i - 1) + " bottles of Pepsi on the wall.");

            }

        }
    }
}
