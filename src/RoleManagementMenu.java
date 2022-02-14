import java.util.*;

class RoleManagementMenu {
	private static String srole;
	private static String rmgr;

	public static void main(String args[]) {
		boolean exit = false;
		Collection<Company> c = new ArrayList<Company>();
		HashMap<String, String> role = new HashMap<String, String>();
		HashMap<String, String> subrole = new HashMap<String, String>();
		HashMap<String, String> report = new HashMap<String, String>();

		Scanner sc = new Scanner(System.in);
		int option;

		System.out.print("Enter the root role name:");
		String boss = sc.nextLine();
		System.out.println(boss);
		role.put("CEO",boss);
		System.out.println("Root Element:"+role.get("CEO"));

		do {
			System.out.println("Operations : ");
			System.out.println(" 1. Add Sub Role.");
			System.out.println(" 2. Display Roles");
			System.out.println(" 3. Delete Role.");
			System.out.println(" 4. Add User.");
			System.out.println(" 5. Display Users.");
			System.out.println(" 6. Display Users and Sub Users.");
			System.out.println(" 7. Delete User.");
			System.out.println(" 8. Number of users from top.");
			System.out.println(" 9. Height of role hierachy.");
			System.out.println("10. Common boss of users");
			System.out.println("Operation to be performed :");

			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter sub role name : ");
				srole = sc.nextLine();
				System.out.println(srole);
				role.put("COO", srole);
				System.out.println("Root Element:"+role.get("COO"));
				System.out.println("Enter Reporting manager: ");
				rmgr = sc.nextLine();
				System.out.println(rmgr);
				c.add(new Company(srole, rmgr));
				System.out.println("This is case 1");
				break;
			case 2:
				System.out.println("This is case 2");
				  for(Map.Entry m:role.entrySet()){    
			           System.out.println(m.getKey()+" "+m.getValue());    
			          }  
				break;
			case 3:
				System.out.println("This is case 3");
				break;
			case 4:
				System.out.println("This is case 4");
				break;
			case 5:
				System.out.println("This is case 5");
				for(Map.Entry m : role.entrySet()){    
				    System.out.println(m.getKey()+" "+m.getValue());    
				   }  
				
				break;
			case 6:
				System.out.println("This is case 6");
				break;
			case 7:
				System.out.println("This is case 7");
				break;
			case 8:
				System.out.println("This is case 8");
				System.out.println("Total number of user :"+role.size());
				break;
			case 9:
				System.out.println("This is case 9");
				break;
			case 10:
				System.out.println("This is case 10");
				break;
			default:
				exit = true;
				break;

			}

		} while (option != 0 || exit != true);
		sc.close();
	}

}
