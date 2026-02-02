public abstract class Employee {
    private String employeeId;
    private String lastName;
    private String firstName;
    private double payRate;
    private String jobTitle;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getPayRate() {
        return payRate;
    }

    public abstract void setPayRate(double payRate);

    public String getJobTitle() {
        return jobTitle;
    }

    public abstract void setJobTitle();

    protected void setPayRateInternal(double rate, double maxRate) {
        if (rate > maxRate) {
            this.payRate = maxRate;
        } else {
            this.payRate = rate;
        }
    }

    protected void setJobTitleInternal(String title) {
        this.jobTitle = title;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + employeeId + '\'' +
                ", Name='" + firstName + " " + lastName + '\'' +
                ", Pay Rate=" + payRate +
                ", Title='" + jobTitle + '\'' +
                '}';
    }
}
