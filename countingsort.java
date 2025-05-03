public class countingsort
{
    public static void  counting(int arr[])
    {
        // find the largest element 
        int largest = Integer.MIN_VALUE;
         for(int i =0; i < arr.length ; i++)
         {
            largest = Math.max(largest,arr[i]);
         }
         // create count array and size is int [ largest ]
         int count[]= new int[largest + 1];
         for(int i = 0; i <arr.length ; i++)
         {
            count[arr[i]]++;
         }// iterate the original array 
         // sorting 
         // iterate the count array 
         int j = 0;// index original array is starts with the 0 
         for(int i = 0; i <count.length;i++)
         {
            while(count[i] > 0)
            {
                    arr[j] = i;
                    j++;
                    count[i]--;
            }
         }
        

    }
    public static void print(int arr[])
    {
        for(int i =0;i<arr.length ;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,3,5,2,4};
        counting(arr);
        print(arr);
        

    }
}