import java.util.*;
import java.io.*;
class society{	
	String name;
    String loc;
    String secretory;
	society(String name,String loc,String secretory){
		this.name = name;
		this.loc = loc;
		this.secretory = secretory ;
	}
	void societyDetails() {
    	System.out.println("Society Name : "+this.name);
    	System.out.println("Location : " + this.loc);
    	System.out.println("Secretory Name : "+ this.secretory);
    }
}
class buildings extends society {
		String building;
		int num;
		buildings(String building,int num,String name,String loc,String secretory) {
			super( name, loc, secretory);	
			this.building = building;
			this.num = num;
		}
		void buildingDetails() {
	    	System.out.println("Building name : "+this.building);
	    	System.out.println("Total Number of Apartments : " + this.num);
	    }
}
class apartment extends buildings{
    int aptnum;
    String owner;
    String meternum;
    apartment(int aptnum, String owner, String meternum,String building,int num,String name,String loc,String secretory){
    	super( building, num, name, loc, secretory);
    	this.aptnum = aptnum;
    	this.owner = owner;
    	this.meternum = meternum;
    }
    void viewDetails() {
    	System.out.println("Apartment Number : "+this.aptnum);
    	System.out.println("Owner Name : " + this.owner);
    	System.out.println("Electric Meter Number : "+this.meternum);
    }
}
public class InheritanceFileIO {
	public static void main(String[] args) throws Exception   {
        String path="sample.csv";
		List<String[]> li = read(path);
		apartment arr1[] = new apartment[10];
    	apartment arr2[] = new apartment[10];
    	apartment arr3[] = new apartment[10];
    	int i = 0, j = 0, k =0 ;
    	for(String[] t:li) {
    		if(t[1].compareTo("A")== 0) {
    			arr1[i] = new apartment(Integer.parseInt(t[0]),t[2],t[3],t[1],10,"Housing-Board Society"," Tanuku","Harish");
    					i++;
    		}else if(t[1].compareTo("B") == 0) {
    			arr2[j] = new apartment(Integer.parseInt(t[0]),t[2],t[3],t[1],10,"Housing-Board Society"," Tanuku","Viswanath");
				j++;
    		}else {
    			arr3[k] = new apartment(Integer.parseInt(t[0]),t[2],t[3],t[1],10,"Housing-Board Society"," Tanuku","Subhash");
				k++;
    		}
    	}
    	int t;
    	System.out.println("Apartment Details \n");
    	for(t = 0 ; t < i ; t++){
    		arr1[t].viewDetails();
        }
    	for(t = 0 ; t < j ; t++){
    		arr2[t].viewDetails();
        }
    	for(t = 0 ; t < k ; t++){
    		arr3[t].viewDetails();
        }
    	System.out.println("Building Details \n");
    	for(t = 0 ; t < i ; t++){
    		arr1[t].buildingDetails();
        }
    	for(t = 0 ; t < j ; t++){
    		arr2[t].buildingDetails();
        }
    	for(t = 0 ; t < k ; t++){
    		arr3[t].buildingDetails();
        }
    	System.out.println("Society Details \n");
    	for(t = 0 ; t < i ; t++){
    		arr1[t].societyDetails();
        }
    	for(t = 0 ; t < j ; t++){
    		arr2[t].societyDetails();
        }
    	for(t = 0 ; t < k ; t++){
    		arr3[t].societyDetails();
        }
	}
	public static List<String[]> read(String file1){
		List<String[]> li = new ArrayList<>();
		try {
	         File file = new File(file1);
	         FileReader fr = new FileReader(file);
	         BufferedReader b = new BufferedReader(fr);
	         String line = "";
	         String[] temp;
	         while((line = b.readLine()) != null) {
	            temp = line.split(",");
	            li.add(temp);
	         }
	         b.close();
	         } catch(IOException ioe) {
	            
	         }
		return li;
	}
}