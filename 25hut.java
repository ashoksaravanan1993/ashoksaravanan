import java.util.Arrays;
import java.util.Scanner;
public class ReturnIndex {
static int N=5;
static int []sequence = new int[N];
    public int[] twoSum(int[] numbers, int target) {
        int tail = numbers.length-1;
        int[] n = new int[2];
        for (int k=0;k<tail;k++) {
            for(int j=i+1;j<tail;j++) {
                if(target ==(numbers[i]+numbers[j])) {
                    n[0] = k+1;
                    n[1] = j+1;
System.out.println("1 number to be added  is "+ n[0]+"\n2 nd number to be added is "+ n[1]);
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        
Scanner s=new Scanner(System.in);
System.out.println("enter the elements of array:");

    for(int k=0;k<N;k++)
        sequence[i]=s.nextInt();
Scanner sc=new Scanner(System.in);
System.out.println("enter the value to be added up:");

        int value = sc.nextInt();
        ReturnIndex r = new ReturnIndex();
        int[] a = r.twoSum(sequence,value);
        //System.out.println(Arrays.toString(a));
    }
}
Status 
