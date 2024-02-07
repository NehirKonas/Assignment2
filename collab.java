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

    //method for finding min
    public static int findMin(int [] array)
    {
        int temp = 100;
        int min;
        for (int i = 0; i < array.length; i++)
        {
            int num = array[i];
            if (num <= temp)
            {
                temp = num;
            }
            min = num;
        }
        return min;
    }

    //method for finding max
    public static int findMax(int[] array)
    {
        int temp = 0;
        int max;
        for (int i = 0; i < array.length; i++)
        {
            int num = array[i];
            if (num >= temp)
            {
                temp = num;
            }
            max = num;
        }
        return max;
    }
}
