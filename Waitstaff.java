public class Waitstaff extends Employee {
    private static final double MAX_RATE = 15.00;

    @Override
    public void setPayRate(double payRate) {
        setPayRateInternal(payRate, MAX_RATE);
    }

    @Override
    public void setJobTitle() {
        setJobTitleInternal("Waitstaff");
    }
}
