public class bubblesort
{
    public static void bubble(int numbers[])
    {
        for(int turns=0 ; turns <numbers.length -1;turns++)// outer loop like 0th pass, 1st pass ..
        {
            for(int j = 0 ; j < numbers.length-1;j++)
            {
                //swap
                if(numbers[j] > numbers[j+1])
                {
                    //swap
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]= temp;
                }
            }

        }

    }

    public static void printArr(int numbers[])
    {
        for(int i = 0; i < numbers.length; i++){
            System.out.print( numbers[i] + " " );
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int numbers[] = {5,3,4,2,1};
        bubble(numbers);
        printArr(numbers);
    }
}