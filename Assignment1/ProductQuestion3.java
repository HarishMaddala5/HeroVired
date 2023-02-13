import java.util.*;
class ProductQuestion3
{
    public static Scanner sc=new Scanner(System.in);
    public static void addProduct(ArrayList<String> al,ArrayList<ArrayList<String>> ad,ArrayList<Integer> ac)
    {
        System.out.println("Enter product name");
        String name=sc.next();
        al.add(name);
        System.out.println("Enter product quantity");
        int quality=sc.nextInt();
        System.out.println("Enter specifications");
        sc.nextLine();
        String specification=sc.nextLine();
        System.out.println("Enter Cost");
        String cost=sc.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(specification);
        a.add(cost);
        a.add(Integer.toString(quality));
        ad.add(a);
        ac.add(quality);
    }

    public static void details(ArrayList<String> al,ArrayList<ArrayList<String>> ad,ArrayList<Integer> ac)
    {
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+"  ");
            String d="";
            for(int j=0;j<ad.get(i).size();j++)
            d+=ad.get(i).get(j)+" ";
            System.out.print(d);
            System.out.println();
        }
    }

    public static void list(ArrayList<String> al,ArrayList<Integer> ac)
    {
        System.out.println("Enter productname to get count");
        String name=sc.next();
        int k=al.indexOf(name);
        System.out.println(al.get(k)+" "+ac.get(k));
    }

    public static void edit(ArrayList<String> al,ArrayList<ArrayList<String>> ad,ArrayList<Integer> ac)
    {
        System.out.println("Enter productname to edit details");
        String p=sc.next();
        int k=al.indexOf(p);
        System.out.println("Enter product quantity");
        int quality=sc.nextInt();
        System.out.println("Enter specifications");
        sc.nextLine();
        String specification=sc.nextLine();
        System.out.println("Enter Cost");
        String cost=sc.next();
        ArrayList<String> a=new ArrayList<>();
        a.add(specification);
        a.add(cost);
        a.add(Integer.toString(quality));
        ad.set(k, a);
        ac.set(k,quality);
    }

    public static void count(ArrayList<String> al,ArrayList<Integer> ac)
    {
        System.out.println("Enter productname to get count");
        String name=sc.next();
        int i=al.indexOf(name);
        System.out.println(al.get(i)+"    "+ac.get(i));
    }

    public static void uadate(ArrayList<String> al,ArrayList<ArrayList<String>> ad,ArrayList<Integer> ac)
    {
        System.out.println("Enter 1 to add and 2 to delete product quantity");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Enter product name");
            String name=sc.next();
            System.out.println("Enter no of items to add");
            int n=sc.nextInt();
            int i=al.indexOf(name);
            ac.set(i,ac.get(i)+n);
            int m=ac.get(i);
            ad.get(i).set(2,Integer.toString(m));
        }
        else
        {
            System.out.println("Enter product name");
            String name=sc.next();
            System.out.println("Enter no of items to add");
            int n=sc.nextInt();
            int i=al.indexOf(name);
            ac.set(i,ac.get(i)-n);
            int m=ac.get(i);
            ad.get(i).set(2,Integer.toString(m));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        ArrayList<ArrayList<String>> ad=new ArrayList<>();
        ArrayList<Integer> ac=new ArrayList<>();
        System.out.println("Enter Number of items to be added");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        addProduct(al,ad,ac);
        details(al, ad, ac);     
    } 

}