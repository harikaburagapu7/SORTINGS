public class insertionsort
{
    public static void insertionsort (int numbers[])
    {
        for(int i=1;i<numbers.length;i++)
        {
            int curr = numbers[i];
            int prev=i-1;
            // finding out the correct position to insert 
            while(prev >=0 && numbers[prev] > curr)
            {
                numbers[prev+1]=numbers[prev];
                prev--;

            }
            //insertion sort
            numbers[prev+1]=curr;


        }
    }

    public static void print(int numbers[])
    {
        for(int i =0; i < numbers.length;i++)
        {
            System.out.println(numbers[i] + " " );
        }
    }
    public static void main(String args[])
    {
        int numbers[]={1,3,5,4,2};
        //calling 
        insertionsort(numbers);
        print(numbers);

    }
}