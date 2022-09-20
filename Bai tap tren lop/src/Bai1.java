public class Bai1 {
    public static void main(String[] args) {

        int [] arr = {8,1,8,2,1,9,2,3,6,47,5,55,8,996,62,4};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("max " + max);
        System.out.println("min " + min);

    }
}
