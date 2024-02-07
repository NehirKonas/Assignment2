package Assignment2;

import java.util.Random;

class collab {
    public static void main(String[] args) {
        Random ran = new Random();
        boolean exiting = false;
        int arraySize = 10;
        int[] arr = new int[arraySize];
        for(int i = 0 ; i < arraySize; i++){
            arr[i] = ran.nextInt(101);
        }
        do {
            System.out.println("Choose ");
            
        } while (!exiting);
    }

    public static int sumOddIndex(int[] nums){
        int sum = 0;
        for(int i = 1 ; i < nums.length ; i++){
            sum += nums[i];
        }
        
        return sum;
    }

    public static int sumEvenIndex(int[] nums){
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }

        return sum;
    }
}
