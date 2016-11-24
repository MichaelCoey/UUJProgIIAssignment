package concertbooking;
/**
*
* @author Peter
*
*/

public class Customer {

	//Variables
	private String strName = "dftname";
	private String strPhone = "dftPhone";
	private String strEmail = "dftEmail";

	public String getName()
	{
            return strName;
	}
	
	public String getPhone()
	{
            return strPhone;
	}
	
	public String getEmail()
	{
            return strEmail;
	}

	public Customer(String strNewName, String strNewPhone, String strNewEmail)
	{
            strName = strNewName;
            strPhone = strNewPhone;
            strEmail= strNewEmail;
        }
}
