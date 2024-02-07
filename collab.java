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
}
