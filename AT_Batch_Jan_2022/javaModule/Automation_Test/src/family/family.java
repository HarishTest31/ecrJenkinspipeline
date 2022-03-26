package family;

public class family {
	public String firstName;
	public static String lastName = "Lingampally";
	public int age;
	public String designation;
	public String contactNo;
	
	
	public void lastName()
	{
		
		System.out.println(firstName +" "+ lastName + " "+ age +" "+ designation +" "+ contactNo);
	}
	

	public family(String firstName,  int age, String designation, String contactNo) {
		super();
		this.firstName = firstName;	
		this.age = age;
		this.designation = designation;
		this.contactNo = contactNo;
	}
	
}
