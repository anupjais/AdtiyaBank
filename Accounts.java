import java.util.Scanner;
class Accounts
{
	static CenterScr scr = new CenterScr();
	static Color clr = new Color();

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
	public double getBalance(int pinN)
	{
		if(pin == pinN)
			return balance;
		else
			return -1;
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
		this.balance += updatedBalance;
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

// METHODS
	public void createAccount()
	{
		scr.clrScr();
		byte addChoice=0;
		System.out.print("Enter your name : ");
		clr.indigo();
		accountHolderName = sc.nextLine();
		clr.neutral();
		System.out.print("Permanent Address : ");
		clr.indigo();
		permanentAddress = sc.nextLine();
		clr.neutral();
		System.out.print("Pin Code : ");
		clr.indigo();
		pinCode = sc.nextInt();
		clr.neutral();
		System.out.print("Permanent and current address is same (0:No or 1:Yes): ");
		clr.indigo();
		addChoice = sc.nextByte();
		clr.neutral();
		if(addChoice==1)
		{
			currentAddress = currentAddress+permanentAddress;
			pinCodeC = pinCode;
			System.out.println("Done\n");
		}
		else
		{
			System.out.print("Enter the current address : ");
			clr.indigo();
			currentAddress = sc.nextLine();
			sc.nextLine();
			clr.neutral();
			System.out.print("Pin Code : ");
			clr.indigo();
			pinCodeC = sc.nextInt();
			clr.neutral();
		}
		System.out.print("Pan number : ");
		clr.indigo();
		panNumber = sc.next();
		clr.neutral();
		System.out.print("Adhar number : ");
		clr.indigo();
		adharNumber = sc.nextLong();
		clr.neutral();
		System.out.print("Mobile Number : ");
		clr.indigo();
		mobleNumber = sc.nextLong();
		clr.neutral();

		clr.darkBlue();
		System.out.print("Enter deposit amount : ");
		clr.yellow();
		balance = sc.nextDouble();
		clr.neutral();
		// pinCreate:
		createPin();
		
	}
	private void createPin()
	{
		clr.darkBlue();
		System.out.print("Create Pin : ");
		clr.darkPink();
		pin = sc.nextInt();
		clr.blue();
		System.out.print("Conform Pin : ");
		clr.darkPink();
		clr.bold();
		int conformPin = sc.nextInt();
		clr.neutral();
		if(pin!=conformPin)
		{
			this.pin=0;
			scr.clrScr();
			incorrectPin();
			createPin();
		}
		else
		{
			scr.clrScr();
			clr.darkGreen();
			System.out.println("Account Creation Successfull.\n");
			clr.neutral();
		}
	}
	
	public void changePin()
	{
		scr.clrScr();
		System.out.print("Enter pin : ");
		clr.yellow();
		int pin = sc.nextInt();
		clr.neutral();
		// int pin = requestPin();
		if(pin == this.pin)
		{
			createPin();
			scr.clrScr();
			clr.darkGreen();
			clr.bold();
			System.out.println("Pin Has Been Changed\n");
			clr.neutral();
		}
		else
		{
			incorrectPin();
		}
	}
	static void incorrectPin()
	{
		scr.clrScr();
		clr.red();
		clr.bold();
		System.out.println("Incorrect Pin.\n");
		clr.neutral();
	}
	public boolean validatePin(int pin)
	{
		if(pin == this.pin)
			return true;
		else
			return false;
	}
}