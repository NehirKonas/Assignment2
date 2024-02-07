package Assignment2;

import java.util.Random;
import java.util.Scanner;

class collab {
    public static int arraySize = 10;
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scanner = new Scanner(System.in);
        int userInput;
        boolean exiting = false;
        
        int[] arr = new int[arraySize];
        for(int i = 0 ; i < arraySize; i++){
            arr[i] = ran.nextInt(101);
        }

        do {
            System.out.println("Choose the operation: \n1.Find min \n2.Find max \n3.Find average \n4.Find sum of element depending on odd indexes.\n5.Find sum of element depending on even indexes.\n6.Exit.");
            userInput = scanner.nextInt();
            if(userInput==1){
                System.out.println("Min value of array: " + findMin(arr));
            }
            else if(userInput==2){
                System.out.println("Max value of array: " + findMiax(arr));
            }
            else if(userInput==3){
                System.out.println("Min value of array: " + findSum(arr));
            }
            else if(userInput==4){
                System.out.println("Min value of array: " + sumOddIndex(arr));
            }
            else if(userInput==5){
                System.out.println("Min value of array: " + sumEvenIndex(arr));
            }
            else if(userInput==6){
                System.out.println("Exiting.");
                exiting = true;
                break;
            }
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
