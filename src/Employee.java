import java.text.DecimalFormat;

public class Employee implements Payable{
  protected String name;
  protected String employeeId;
  // TODO fix class declaration and declare variables here

  public Employee(String employeeId, String name) {
    // TODO fill in code here
  }

  public String getEmployeeId() {
    // TODO fill in code here and replace the return statement
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    // TODO fill in code here
    this.employeeId = employeeId;
  }

  public String getName() {
    // TODO fill in code here and replace the return statement
    return name;
  }

  public void setName(String name) {
    // TODO fill in code here
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    // TODO fill in code here and replace the return statement
    return getAverageMonthlySalary();
  }
  @Override
  public String toString() {
    // TODO fill in code here and replace the return statement, be sure to format double value
    return String.format("Name: %s, Average Monthly Salary: %f", name, Math.ceil(getAverageMonthlySalary()));
  }

  @Override
  public void calculatePay() {

  }
}
