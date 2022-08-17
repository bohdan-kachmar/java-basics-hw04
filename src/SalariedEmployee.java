public class SalariedEmployee extends Employee{
  // TODO fix class declaration and declare variables here
  protected String socialSecurityNumber;
  protected double fixedMonthlyPayment;
  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    // TODO fill in code here
    this.socialSecurityNumber = socialSecurityNumber;
    this.name = name;
    this.employeeId = employeeId;
  }

  public String getSocialSecurityNumber() {
    // TODO fill in code here and replace the return statement
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    // TODO fill in code here
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    // TODO fill in code here and replace the return statement
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    // TODO fill in code here
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }
  public String getName() {
    // TODO fill in code here and replace the return statement
    return name;
  }
  public void setName(String name) {
    // TODO fill in code here
    this.name = name;
  }
  @Override
  public double getAverageMonthlySalary() {
    // TODO fill in code here and replace the return statement
    return fixedMonthlyPayment;
  }
  // TODO fill in code here
}
