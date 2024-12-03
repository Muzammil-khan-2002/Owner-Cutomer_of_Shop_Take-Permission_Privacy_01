import java.util.*;
class Product
{
	private int id;
	private String name;
	private int sale_price;
	private int purchase_price;
	private String dealer_name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalePrice(int sale_price)
	{
		this.sale_price=sale_price;
	}
	public int getSalePrice()
	{
		return sale_price;
	}
	public void setPurchasePrice(int purchase_price)
	{
		this.purchase_price=purchase_price;
	}
	public int getPurchasePrice()
	{
		return purchase_price;
	}
	public void setDealerName(String dealer_name)
	{
		this.dealer_name=dealer_name;
	}
	public String getDealerName()
	{
		return dealer_name;
	}
}



public class MainPojo
{
    public static void main(String args[])
    {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter Total Products");
        int size = xyz.nextInt();
        Product[] p = new Product[size];
        for(int i = 0; i < size; i++)
        {
			System.out.println("\nEnter for "+(i+1)+" Product Detail.");
			System.out.println("\n-----------------------------------------------------------------");
			
            System.out.println("Product Id");
            int id = xyz.nextInt();
            xyz.nextLine();  // Consume the newline character
            System.out.println("Product Name");
            String name = xyz.nextLine();
            System.out.println("Product Selling Price");
            int sale_price = xyz.nextInt();
            System.out.println("Product Purchase Price");
            int purchase_price = xyz.nextInt();
            xyz.nextLine();  // Consume the newline character
            System.out.println("Product Dealer Name");
            String dealer_name = xyz.nextLine();        
            
            p[i] = new Product();
            
            p[i].setId(id);
            p[i].setName(name);
            p[i].setSalePrice(sale_price);
            p[i].setPurchasePrice(purchase_price);
            p[i].setDealerName(dealer_name);
        }
        
        int choice = 0;
        
        do
        {
            xyz.nextLine(); // Consume leftover newline from previous input
            System.out.println("Who are you? Customer/Owner");
            String check = xyz.nextLine();
            
            if(check.equalsIgnoreCase("Owner"))
            {
				System.out.println("Display Detail About Product");
                for(int i = 0; i < size; i++)
                {
					System.out.println("____________________________________________________________");
					System.out.println("\n "+(i+1)+" Product.");
                    System.out.println("Id: " + p[i].getId());
                    System.out.println("Product Name: " + p[i].getName());
                    System.out.println("Product Selling Price: " + p[i].getSalePrice());
                    System.out.println("Product Dealer Name: " + p[i].getDealerName());
                    System.out.println("Product Purchase Price: " + p[i].getPurchasePrice());
                }
            }
            else if(check.equalsIgnoreCase("Customer"))
            {
				System.out.println("Display Detail About Product");
                for(int i = 0; i < size; i++)
                {
					System.out.println("____________________________________________________________");
					System.out.println("\n "+(i+1)+" Product.");
                    System.out.println("Id: " + p[i].getId());
                    System.out.println("Product Name: " + p[i].getName());
                    System.out.println("Product Selling Price: " + p[i].getSalePrice());
                }
            }
			else{
				System.out.println("Invalid Input!");
			}
            
            System.out.println("\n-----------------\nYou Want to Continue --> Press 1");
            System.out.println("You Want to Shut Down Code --> Press 0");
            choice = xyz.nextInt();
        
        } while(choice != 0);
    }
}
