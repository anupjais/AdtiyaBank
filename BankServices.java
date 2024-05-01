import java.util.Scanner;
class BankServices
{
	static 	Scanner sc = new Scanner(System.in);
	static 	Accounts acc=new Accounts();
	static CenterScr scr = new CenterScr();
	static Color clr = new Color();

	public static void main(String[] args)
	{
		// Accounts acc =new Accounts("Anup","Pune","Pune","GNIPK", 123456789012l, 9876543210l, 1200, 411048, 411048, 1212);
	// accountHolderName, permanentAddress, currentAddress, panNumber, adharNumber, mobleNumber, balance, pinCode, pinCodeC, pin
		// System.out.println(acc.getAccountHolderName());
		scr.clrScr();
		outerLoop:
		for (; ; ) 
		{
			homeMenu();
			enterRequest();
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					{
						scr.clrScr();
						acc.createAccount();
						// Accounts acc =new Accounts("Anup","Pune","Pune","GNIPK", 123456789012l, 9876543210l, 1200, 411048, 411048, 1212);
						break;
					}
				case 2:
					{
						if(acc.getMobileNumber() != 0)
						{
							scr.clrScr();
							clr.green();
							// System.out.println("Implementation will soon..");
							userOption();
							clr.neutral();
						}
						else {
							notExist();
						}
					}
					break;
				case 0:
					{
						visitNote();
					}
				default:
					{
						clr.red();
						scr.clrScr();
						incorrectOption();
						clr.neutral();
					}

			}
		}

	}
	public static void homeMenu()
	{
		String welcome = "Welcome To Aditya Bank ";
		// scr.clrScr();
		// scr.centerScr();
		starPattern(welcome);
		// starPattern(welcome,'&');
		clr.blue();
		welcome(welcome);
		System.out.println();
		clr.neutral();
		starPattern(welcome);
		// starPattern(welcome,'&');
		clr.yellow();
		System.out.println("1. Create Accounts\n2. Existing User\n0. EXIT\n");
		// System.out.println(scr.centerScr()+"1. Create Accounts\n"+scr.centerScr()+"2. Existing User\n"+scr.centerScr()+"0. EXIT");
		clr.neutral();
	}
	public static void enterRequest()
	{
		clr.darkBlue();
		System.out.print("Enter Option : ");
		clr.neutral();
	}
	public static void userOption()
	{
		System.out.println("1. Check Amount\n2. Deposit Amount\n3. Withdraw Amount\n4. Change Pin\n5. Log-out\n0. EXIT\n");
		// System.out.print("Entet your option : ");
		enterRequest();
		int option = sc.nextInt();
		switch(option)
		{
			case 1:
				{
					scr.clrScr();
					checkBalance();
					break;
				}
			case 2:
				{
					// System.out.println("Diposit amount is in process");
					scr.clrScr();
					dipositAmount();
					clr.neutral();
					System.out.println();
				}
				break;
			case 3:
				{
					// System.out.println("Withdraw amount is in process");
					scr.clrScr();
					int pin1 = requestPin();
					if(acc.validatePin(pin1))
					{
						withdrawAmount();
						clr.neutral();
					}
					else
					{
						acc.incorrectPin();
					}
				}
				break;
			case 4:
				{
					// System.out.println("Change Pin is in process");
					acc.changePin();
					clr.neutral();
				}
				break;
			case 5:
				{
					// System.out.println("Log-out is in process");
					logout();
					// continue outerLoop;
					clr.neutral();
					System.exit(0);
				}
				break;
			case 0:
				{
					System.out.println("Thank you for using our servise\nPlease visit again..");
					clr.neutral();
					System.exit(0);
				}
				break;
			default:
				{
					incorrectOption();
				}
		}
	}
	
	public static void starPattern(String name)
	{
		for(int i=0; i<name.length()-3; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	public static void starPattern(String name, char ch)
	{
		for(int i=0; i<name.length(); i++)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
	}
	public static void smallStar(int num)
	{
		for(int i=0; i<num; i++)
		{
			System.out.print("* ");
		}
	}
	public static void welcome(String name)
	{
		int num = 4;
		smallStar(num);
		System.out.print(name);
		smallStar(num);
	}
	static void dipositAmount()
	{
		scr.clrScr();
		clr.indigo();
		System.out.print("Enter amount : ");
		clr.yellow();
		double amt = sc.nextDouble();
		acc.setBalance(amt);
	}
	static void withdrawAmount()
	{
		scr.clrScr();
		System.out.print("Enter Amount : ");
		clr.indigo();
		double amount = sc.nextDouble();
		// int pin = requestPin();
		double balQ = acc.getBalance();
		if(amount <= balQ-500)
		{
			acc.setBalance(-amount);
			System.out.println(amount+"₹ debited.");
		}
		else if(amount == balQ-500)
		{
			System.out.println("Minimum 500 should be in account.\n ");
		}
		else
		{
			System.out.println("Insufficient Balance\n");
		}
	}
	static void incorrectOption()
	{
		scr.clrScr();
		clr.red();
		clr.bold();
		System.out.println("Incorrect Option.\n");
		clr.neutral();
	}
	static void logout()
	{
		scr.clrScr();
		clr.itallic();
		clr.bold();
		clr.blue();
		System.out.println("User Log-out\n");
		clr.neutral();
	}
	static int requestPin()
	{
		System.out.print("Enter pin : ");
		clr.yellow();
		int pin = sc.nextInt();
		clr.neutral();
		return pin;
	}
	static void visitNote()
	{
		scr.clrScr();
		clr.indigo();
		clr.bold();
		System.out.println("Thank you for using our servise\nPlease visit again..\n");
		clr.neutral();
		System.exit(0);
	}
	static void notExist()
	{
		scr.clrScr();
		clr.red();
		clr.bold();
		System.out.println("User does not exist.\n");
		clr.neutral();
	}
	static void checkBalance()
	{
		clr.darkIndigo();
		System.out.print("Your Balance is ");
		clr.darkYellow();
		System.out.println(acc.getBalance());
		System.out.println();
		clr.neutral();
	}
}