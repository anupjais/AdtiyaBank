import java.util.Scanner;
class BankServices
{
	static 	Scanner sc = new Scanner(System.in);
	static 	Accounts obj=new Accounts();

	public static void main(String[] args)
	{
		// Accounts obj =new Accounts("Anup","Pune","Pune","GNIPK", 123456789012l, 9876543210l, 1200, 411048, 411048, 1212);
	// accountHolderName, permanentAddress, currentAddress, panNumber, adharNumber, mobleNumber, balance, pinCode, pinCodeC, pin
		// System.out.println(obj.getAccountHolderName());
		outerLoop:
		for (; ; ) 
		{
			homeMenu();
			enterRequest();
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					obj.createAccount();
					// Accounts obj =new Accounts("Anup","Pune","Pune","GNIPK", 123456789012l, 9876543210l, 1200, 411048, 411048, 1212);
					break;
				case 2:
					if(obj.getMobileNumber() != 0)
						System.out.println("Implementation will soon..");
					else {
						System.out.println("User does not exist.");
					}
					break;
				case 0:
					System.out.println("Thank you for using our servise\nPlease visit again..");
					System.exit(0);
				default:
					System.out.println("Incorrect Option");
			}
		}

	}
	public static void homeMenu()
	{
		System.out.println("1. Create Accounts\n2. Existing User\n0. EXIT");
	}
	public static void enterRequest()
	{
		System.out.print("Enter Option : ");
	}
	public static void userOption()
	{
		System.out.println("1. Check Amount\n2. Deposit Amount\n3. Withdraw Amount\n4. Change Pin\n5. Log-out\n0. EXIT");
		System.out.print("Entet your option : ");
		int option = sc.nextInt();
		switch(option)
		{
			case 1:
				System.out.println(obj.getBalance());
				break;
			case 2:
				System.out.println("Diposit amount is in process");
				break;
			case 3:
				System.out.println("Withdraw amount is in process");
				break;
			case 4:
				System.out.println("Withdraw amount is in process");
			case 5:
				System.out.println("Withdraw amount is in process");
			case 0:
				System.out.println("Thank you for using our servise\nPlease visit again..");
				System.exit(0);
			default:
				System.out.println("Incorrect Option");
		}
	}
	public void existingUser()
	{

	}
}