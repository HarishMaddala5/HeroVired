import java.util.*;
class MissingNumber{
    public static void FindMissingNumbers(int arr[])
    {
        int i=1,n=arr.length,k=0;
        while(k<n)
        {
            if(arr[k]==i)
                k++;
            else
                System.out.print(i+" ");
            i++;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        FindMissingNumbers(arr);
    }
}