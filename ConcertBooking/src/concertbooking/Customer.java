package concertbooking;

public class Customer {

	//Variables
	private int intCustomerNumber = 0;
	private String strName = "dftname";
	private int intPhone = 0;
	private String strEmail = "dftEmail";
	private String strAddress = "dftAddress";
	private String strPostcode = "dftPostcode";
	private String strTown = "dftTown";
	private String strDateBooked = "12/12/2010";
	private int intNumberofTickets = 0;

	public int getCustomerNumber()
	{
		return intCustomerNumber;
	}
	
	public void setCustomerNumber (int intNewCustomerNumber)
	{
		intCustomerNumber = intNewCustomerNumber;
	}
	
	public String getName()
	{
		return strName;
	}
	
	public void setName (String strNewName)
	{
		strName = strNewName;
	}
	
	public int getPhone()
	{
		return intPhone;
	}
	
	public void setPhone (int intNewPhone)
	{
		intPhone = intNewPhone;
	}
	
	public String getEmail()
	{
		return strEmail;
	}
	
	public void setEmail (String strNewEmail)
	{
		strEmail = strNewEmail;
	}
	
	public String getAddress()
	{
		return strAddress;
	}
	
	public void setAddress (String strNewAddress)
	{
		strAddress = strNewAddress;
	}
	
	public String getPostcode()
	{
		return strPostcode;
	}
	
	public void setPostcode (String strNewPostcode)
	{
		strPostcode = strNewPostcode;
	}	

	public String getTown()
	{
		return strTown;
	}
	
	public void setTown (String strNewTown)
	{
		strTown = strNewTown;
	}
	
	public void setDateBooked (String strNewDateBooked)
	{
		strDateBooked = strNewDateBooked;
	}
	
	public String getDateBooked()
	{
		return strDateBooked;
	}
	
	public int getNumberofTickets()
	{
		return intNumberofTickets;
	}
	
	public void setNumberofTickets (int intNewNumberofTickets)
	{
		intNumberofTickets = intNewNumberofTickets;
	}
	
	public Customer()
	{
		setCustomerNumber(0);
		setName("dftname");
		setPhone(0);
		setEmail("dftEmail");
		setAddress("dftAddress");
		setPostcode("dftPostcode");
		setTown("dftTown");
		setDateBooked("12/12/2010");
		setNumberofTickets(0);
	}
	
	public Customer(int intCustomerNumber, String strName, int intPhone, String strEmail, String strAddress, String strPostcode, String strTown, String strDateBooked, int intNumberofTickets)
	{
		setCustomerNumber(intCustomerNumber);
		setName(strName);
		setPhone(intPhone);
		setEmail(strEmail);
		setAddress(strAddress);
		setPostcode(strPostcode);
		setTown(strTown);
		setDateBooked(strDateBooked);
		setNumberofTickets(intNumberofTickets);
	}
	
}