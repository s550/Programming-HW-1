public class ArrayTools {
    public static int printAll(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("[" + i + "]: " + arr[i]);
        }
        int length = arr.length;

        return length;
    }

    public static String[] copy(String[] arr1, String[] arr2){
        if(arr2.length < arr1.length){
            System.out.println("Error: Second array isn't big enough.");
            System.out.println("First array size: " + arr1.length);
            System.out.println("Second array size: " + arr2.length);
        }
        else {
            for(int i = 0; i < arr1.length; i++){
                arr2[i] = arr1[i];
            }

        }
        return arr2;
    }
    public static String[] filter(String[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 5){
                arr[i] = arr[i].toUpperCase() + " <-- Longer than five letters";

            }
        }


        return arr;
    }
}
