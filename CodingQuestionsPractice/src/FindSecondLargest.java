public class FindSecondLargest
{
    public static void main(String[] args)
    {
        int array[] = {985, 521, 975, 831, 479, 861};
        int secondLargest = findSecondLargest(array);
        System.out.println("Second largest number is " +secondLargest);
    }

    static int findSecondLargest(int[] array)
    {
        if (array == null || array.length<2)
        {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;

        for(int num : array)
        {
            if(num>largest)
            {
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest && num !=largest) //a number present in between secondLargest and largest
            {
                secondLargest=num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE)
        {
            throw new IllegalArgumentException("Array does not contain enough unique elements");
        }
        return secondLargest;
    }
}
