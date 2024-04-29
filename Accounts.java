import java.util.Scanner;
class Accounts
{
	static Scanner sc = new Scanner(System.in);
	private String accountHolderName;
	private String permanentAddress;
	private String currentAddress;
	private String panNumber;
	private long mobleNumber;
	private int pinCode;
	private long adharNumber;
	private int pin;
	private int pinCodeC;
	private double balance;

// GETTERS
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	private  String getPermanetAddress()
	{
		return permanentAddress;
	}
	public String getCurrentAddress()
	{
		return currentAddress;
	}
	public String getPanNumber()
	{
		return panNumber;
	}
	public long getMobileNumber()
	{
		return mobleNumber;
	}
	public int getPinCode()
	{
		return pinCode;
	}public int getPinCodeC()
	{
		return pinCodeC;
	}
	public long getAdharNumber()
	{
		return adharNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	
// SETTERS
	public void setAccountHolderName(String updatedName)
	{
		this.accountHolderName = updatedName;
		// accountHolderName = updatedName;
	}
	private void setPermanetAddress(String updatedPermanentAdderess)
	{
		this.permanentAddress = updatedPermanentAdderess;
		// permanentAddress = updatedPermanentAdderess
	}
	public void setCurrentAddress(String updatedCurrentAddress)
	{
		this.currentAddress = updatedCurrentAddress;
		// currentAddress = updatedCurrentAddress;
	}
	public void setMobileNumber(long updateMoblieNumber)
	{
		this.mobleNumber = updateMoblieNumber;
		// mobleNumber = updateMoblieNumber;
	}
	private void setPinCode(int updatedPin)
	{
		this.pinCode = updatedPin;
		// pinCode = updatedPin;
	}
	public void setPinCodeC(int updatedPinC)
	{
		this.pinCodeC = updatedPinC;
		// pinCodeC = updatedPin;
	}
	public void setBalance(double updatedBalance)
	{
		this.balance = updatedBalance;
		// balance = updatedBalance;
	}

// CONSTRUCTORS
	Accounts()
	{
	}
	Accounts(String accountHolderName, String permanentAddress, String currentAddress, String panNumber, long adharNumber, long mobleNumber, double balance, int pinCode, int pinCodeC, int pin)
	{
		this.accountHolderName = accountHolderName;
		this.permanentAddress = permanentAddress;
		this.currentAddress = currentAddress;
		this.panNumber = panNumber;
		this.adharNumber = adharNumber;
		this.mobleNumber = mobleNumber;
		this.balance = balance;
		this.pinCode = pinCode;
		this.pinCodeC = pinCodeC;
		this.pin = pin;
	}
	public void createAccount()
	{
		byte addChoice=0;
		System.out.print("Enter your name : ");
		accountHolderName = sc.nextLine();
		System.out.print("Permanent Address : ");
		permanentAddress = sc.nextLine();
		System.out.print("Pin Code : ");
		pinCode = sc.nextInt();
		System.out.print("Permanent and current address is same (0:No or 1:Yes): ");
		addChoice = sc.nextByte();
		if(addChoice==1)
		{
			currentAddress = currentAddress+permanentAddress;
			pinCodeC = pinCode;
		}
		else
		{
			System.out.print("Enter the current address : ");
			currentAddress = sc.nextLine();
			System.out.print("Pin Code : ");
			pinCodeC = sc.nextInt();
		}
		System.out.print("Pan number : ");
		panNumber = sc.next();
		System.out.print("Adhar number : ");
		adharNumber = sc.nextLong();
		System.out.print("Mobile Number : ");
		mobleNumber = sc.nextLong();

		System.out.print("Enter deposit amount : ");
		balance = sc.nextDouble();
		// pinCreate:
		System.out.print("Create Pine : ");
		pin = sc.nextInt();
		System.out.print("Create Pine : ");
		int conformPin = sc.nextInt();
		// if(pin!=conformPin)
		// 	continue pinCreate;
		// else
			System.out.println("Account creation Successfull.");
	}
}