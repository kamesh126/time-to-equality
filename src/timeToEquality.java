import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class timeToEquality {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int array[] = new int[size];
            for(int i=0;i<size;i++)
            {
                array[i] = sc.nextInt();
            }
            System.out.println(timeEquality(array));
        }
        public static int timeEquality(int array[])
        {
            int maximum = Integer.MIN_VALUE;
            int result = 0;
            for(int i=0;i<array.length;i++)// overall time complexity O(N)
            {
                if(array[i]>maximum)
                {
                    maximum = array[i];
                }
            }
            for(int i=0;i< array.length;i++)
            {
                result+=maximum-array[i];
            }
            return  result;
        }
        
    }
