import java.util.Scanner;

public class DinnerEventApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt for event details
		System.out.print("Enter event number: ");
		String eventNum = scanner.nextLine();
		System.out.print("Enter event name (e.g., wedding, birthday): ");
		String eventName = scanner.nextLine();
		System.out.print("Enter number of guests: ");
		int guests = scanner.nextInt();

		// Prompt for menu choices (using integer indices)
		System.out.println("Menu Options (0=Steak/Potatoes/Cake, 1=Chicken/Rice/Ice Cream, 2=Fish/Vegetables/Fruit Salad):");
		System.out.print("Enter entree choice (0-2): ");
		int entree = scanner.nextInt();
		System.out.print("Enter first side dish choice (0-2): ");
		int side1 = scanner.nextInt();
		System.out.print("Enter second side dish choice (0-2): ");
		int side2 = scanner.nextInt();
		System.out.print("Enter dessert choice (0-2): ");
		int dessert = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter contact phone number: ");
		String phone = scanner.nextLine();

		// Create DinnerEvent object
		DinnerEvent event = new DinnerEvent(eventNum, eventName, guests, entree, side1, side2, dessert);
		event.setContactPhoneNumber(phone);

		// Determine number of employees needed
		int numWaitstaff = 1 + (guests >= 10 ? 1 : 0) + (guests >= 20 ? 1 : 0); // Simplified logic
		// Better logic for waitstaff:
		numWaitstaff = (int) Math.ceil(guests / 10.0);
		if (numWaitstaff == 0) numWaitstaff = 1;

		int numBartenders = (int) Math.floor(guests / 25.0);
		int numCoordinators = 1;

		int totalEmployees = numWaitstaff + numBartenders + numCoordinators;
		int empIndex = 0;

		// Prompt for employee details and assign to event
		System.out.println("\nEnter details for " + totalEmployees + " employees:");

		// Add Waitstaff
		for (int i = 0; i < numWaitstaff; i++) {
			System.out.println("Enter details for Waitstaff #" + (i + 1));
			event.getEmployees()[empIndex++] = createEmployee(scanner, new Waitstaff());
		}

		// Add Bartenders
		for (int i = 0; i < numBartenders; i++) {
			System.out.println("Enter details for Bartender #" + (i + 1));
			event.getEmployees()[empIndex++] = createEmployee(scanner, new Bartender());
		}

		// Add Coordinator
		System.out.println("Enter details for Coordinator:");
		event.getEmployees()[empIndex++] = createEmployee(scanner, new Coordinator());

		// Display details (Part 5)
		displayEventDetails(event);
	}

	private static Employee createEmployee(Scanner scanner, Employee emp) {
		System.out.print("  Enter ID: ");
		emp.setEmployeeId(scanner.nextLine());
		System.out.print("  Enter First Name: ");
		emp.setFirstName(scanner.nextLine());
		System.out.print("  Enter Last Name: ");
		emp.setLastName(scanner.nextLine());
		System.out.print("  Enter Desired Pay Rate: ");
		double rate = scanner.nextDouble();
		scanner.nextLine();
		emp.setPayRate(rate);
		emp.setJobTitle();
		return emp;
	}

	// Part 5 display function
	private static void displayEventDetails(DinnerEvent event) {
		System.out.println("\n--- Event Details ---");
		System.out.println("Event Number: " + event.getEventType());
		System.out.println("Event Name: " + event.getEventName());
		System.out.println("Guests: " + event.getNumberOfGuests());
		System.out.println("Contact Phone: " + event.getContactPhoneNumber());
		System.out.println("Menu:");
		System.out.println("  Entree: " + event.getEntreeName());
		System.out.println("  Side 1: " + event.getSideDish1Name());
		System.out.println("  Side 2: " + event.getSideDish2Name());
		System.out.println("  Dessert: " + event.getDessertName());
		System.out.println("Employees Assigned:");
		for (Employee emp : event.getEmployees()) {
			if (emp != null) {
				System.out.println("  " + emp);
			}
		}
		System.out.println("---------------------");
	}
}
