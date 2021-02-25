public class fivePrint {
    public static void main(String[] args){
//        System.out.println(195 % 5);
        for(int i = 1; i <= 1000; i++){
            if(i % 5 == 0){
                System.out.println("-" + i);
            }
            else{
                System.out.println(i);
            }
        }
    }
}
