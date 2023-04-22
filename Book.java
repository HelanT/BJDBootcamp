
public class Book {
     
	
	int bid;
	String bname;
	
	void display()
	{
		
		bid = 500;
		bname = "Java";
		System.out.println(bid+"\t"+bname);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Book b = new Book();
		System.out.println(b.bid + "\t" + b.bname);
		b.display();
		System.out.println(b.bid + "\t"+ b.bname);
		
		Book b1 = new Book();
		b1.display();
		System.out.println(b1.bid +"\t" + b1.bname);
		
		
	}

}
