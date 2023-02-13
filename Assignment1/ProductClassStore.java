import java.util.*;
class ProductStore{
	double cost;
	int count;
	String spec,name;
	ProductStore(String name,String spec,double cost,int count){
		this.cost = cost;
		this.count = count;
		this.name = name;
		this.spec = spec;
	}

	public int productCount() {
		return this.count;
	}

	public void productDetails() {
		System.out.println("product name : "+this.name);
		System.out.println("product Specification : "+this.spec);
		System.out.println("product cost : "+this.cost);
		System.out.println("product count : "+this.count);
		System.out.println();
	}

	public void editOrUpdate(String spec) {
		this.spec = spec;
	}

	public void editProductName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return this.name;
	}

	public void editOrUpdate(int count) {
		this.count = count;
	}

	public void editOrUpdate(double cost) {
		this.cost = cost;
	}

}

public class ProductClassStore {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("No of products\n ");
		int n = sc.nextInt();x
		sc.nextLine();
		List<ProductStore>list = new ArrayList<ProductStore>();
		System.out.println("Note : enter details of product with name in one line seperared with spaces \n");
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter product Name,  Specification,  cost,  count : \n");
			String t = sc.nextLine();
			String []arr = t.split(" ");
			String name = arr[0];
			String spec = arr[1];
			double cost = Double.parseDouble(arr[2]);
			int count = Integer.parseInt(arr[3]);
			ProductStore p1 = new ProductStore(name,spec,cost,count);
			list.add(p1);
			System.out.println();
		}
		boolean flag = true;
		while(flag != false) {
			System.out.println("------------X------------");
			System.out.println("	1.Product List  ");
			System.out.println("	2.Product count ");
			System.out.println("	3.Product details ");
			System.out.println("	4.Edit product details ");
			System.out.println("	5.Update Inventory ");
			System.out.println("	6.Exit");
			System.out.println("	Enter your choice ");
			int ch = sc.nextInt();
			if(ch == 1) {
				productList(list);
			}
			else if(ch == 2) {
				productcount(list);
			}
			else if(ch == 3) {
				productdetails(list);
			}
			else if(ch == 4) {
				editproduct(list);
			}
			else if(ch == 5) {
				updateInventory(list);
			}
			else if(ch  == 6) {
				flag = false;
			}
			else {
					System.out.println("Enter choice between 1 - 6 ");
			}
			
		}
		sc.close();
	}

	public static void editproduct(List<ProductStore> list) {
		System.out.println("Enter product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		for(ProductStore p: list) {
			if(p.getProduct().compareToIgnoreCase(pname) == 0) {
				System.out.println("what do you want to edit :\n1.Specification\n2.Cost\n3.Product count");
				int ch = sc.nextInt();
				if(ch == 1) {
					System.out.println("Enter product specification ");
					sc.nextLine();
					String st = sc.nextLine();
					p.editOrUpdate(st);
				}
				else if(ch == 2) {
					System.out.println("Enter product cost ");
					double cost = sc.nextDouble();
					p.editOrUpdate(cost);
				}
				else {
					System.out.println("\nEnter product count ");
					int count = sc.nextInt();
					p.editOrUpdate(count);
				}
				return;
			}System.out.println();
		}
		System.out.println("\nProduct not found");
	}

	public static void productdetails(List<ProductStore> list) {
		System.out.println("\nEnter product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		for(ProductStore p: list) {
			if(p.getProduct().compareToIgnoreCase(pname) == 0) {
				p.productDetails();
				return;
			}
		}
		System.out.println("\nProduct not found");System.out.println();
	}

	public static void productcount(List<ProductStore> list) {
		System.out.print("\nEnter product name : ");
		sc.nextLine();
		String pname = sc.nextLine();
		boolean f = false;
		for(ProductStore p: list) {
			if((p.getProduct()).compareToIgnoreCase(pname) == 0) {
				System.out.println("count of "+p.getProduct() + " is "+p.productCount());
				f = true;
				break;
			}
		}
		if(!f)
		System.out.println("Product not found");
	}

	public static void productList(List<ProductStore> list) {
		if(list.size() == 0) {
			System.out.println("Empty ... ");
			return;
		}
		int i = 1 ;
		for(ProductStore p:list)
			System.out.println((i++) + " " +p.getProduct());
		System.out.println();
	}

	public static void updateInventory(List<ProductStore> list) {
		System.out.println("-----------------------");
		System.out.println("   1. Add poduct");
		System.out.println("   2. Delete product");
		System.out.println("Enter your choice");System.out.println();
		sc.nextLine();
		int n = sc.nextInt();
		if(n == 1) {
			System.out.println("Enter product Name,Specification,cost,count : ");
			sc.nextLine();
			String t = sc.nextLine();
			String []arr = t.split(" ");
			String name = arr[0];
			String spec = arr[1];
			double cost = Double.parseDouble(arr[2]);
			int count = Integer.parseInt(arr[3]);
			ProductStore p1 = new ProductStore(name,spec,cost,count);
			list.add(p1);
		}
		else {
			System.out.println("Enter name to delete product : ");
			sc.nextLine();
			String pname = sc.nextLine();
			int i = 0;
			for(ProductStore p: list) {
				if((p.getProduct()).compareToIgnoreCase(pname) == 0) 
					break;
				i++;
			}
			if(i == list.size())
				System.out.println("product not found");
			else {
				list.remove(i);
				System.out.println("Product removed successfully");
			}
		}
	}

}