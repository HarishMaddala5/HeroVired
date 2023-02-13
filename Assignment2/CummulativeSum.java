import java.util.*;
class CummulativeSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0)
                arr[i]=sc.nextInt();
            else
                arr[i]=sc.nextInt()+arr[i-1];
        }
        for(int t:arr)
            System.out.print(t+" ");
    }
}