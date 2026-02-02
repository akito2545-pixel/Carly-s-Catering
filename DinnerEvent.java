public class DinnerEvent {
    private int eventType;
    private String eventName;
    private int numberOfGuests;
    private int entreeChoice;
    private int sideDish1Choice;
    private int sideDish2Choice;
    private int dessertChoice;
    private String contactPhoneNumber;

    private final String[] entrees = {"Steak", "Chicken", "Fish"};
    private final String[] sideDishes = {"Potatoes", "Rice", "Vegetables"};
    private final String[] desserts = {"Cake", "Ice Cream", "Fruit Salad"};

    private Employee[] employees = new Employee[15];

    public DinnerEvent(String eventNumber, String eventName, int numberOfGuests, int entree, int side1, int side2, int dessert) {
        try {
            this.eventType = Integer.parseInt(eventNumber);
        } 
        catch (NumberFormatException e) {
            this.eventType = 0; 
        }
        this.eventName = eventName;
        this.numberOfGuests = numberOfGuests;
        this.entreeChoice = entree;
        this.sideDish1Choice = side1;
        this.sideDish2Choice = side2;
        this.dessertChoice = dessert;
    }

    public int getEventType() { return eventType; }
    public void setEventType(int eventType) { this.eventType = eventType; }
    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }
    public int getNumberOfGuests() { return numberOfGuests; }
    public void setNumberOfGuests(int numberOfGuests) { this.numberOfGuests = numberOfGuests; }
    public int getEntreeChoice() { return entreeChoice; }
    public void setEntreeChoice(int entreeChoice) { this.entreeChoice = entreeChoice; }
    public int getSideDish1Choice() { return sideDish1Choice; }
    public void setSideDish1Choice(int sideDish1Choice) { this.sideDish1Choice = sideDish1Choice; }
    public int getSideDish2Choice() { return sideDish2Choice; }
    public void setSideDish2Choice(int sideDish2Choice) { this.sideDish2Choice = sideDish2Choice; }
    public int getDessertChoice() { return dessertChoice; }
    public void setDessertChoice(int dessertChoice) { this.dessertChoice = dessertChoice; }
    public String getContactPhoneNumber() { return contactPhoneNumber; }
    public void setContactPhoneNumber(String contactPhoneNumber) { this.contactPhoneNumber = contactPhoneNumber; }
    public Employee[] getEmployees() { return employees; }
    public void setEmployees(Employee[] employees) { this.employees = employees; }

    public String getEntreeName() {
        if (entreeChoice >= 0 && entreeChoice < entrees.length) return entrees[entreeChoice];
        return "Unknown";
    }
    public String getSideDish1Name() {
        if (sideDish1Choice >= 0 && sideDish1Choice < sideDishes.length) return sideDishes[sideDish1Choice];
        return "Unknown";
    }
    public String getSideDish2Name() {
        if (sideDish2Choice >= 0 && sideDish2Choice < sideDishes.length) return sideDishes[sideDish2Choice];
        return "Unknown";
    }
    public String getDessertName() {
        if (dessertChoice >= 0 && dessertChoice < desserts.length) return desserts[dessertChoice];
        return "Unknown";
    }
}
