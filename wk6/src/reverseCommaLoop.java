public class reverseCommaLoop {
    public static void main(String[] args){
        for (int i = 100; i >= 1; i--){
            if(i == 1){
                System.out.println(i);
            }
            else{
                System.out.print(i + ", ");
            }
        }
    }
}
