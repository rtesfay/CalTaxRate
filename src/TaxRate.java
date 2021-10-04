
public class CalcTaxRate {
    private String status;
    private String married;
    private String single;
    private double salary;
    private double taxRate;


    public CalcTaxRate(){
        this.status=status;
        this.married=married;
        this.salary=salary;
        this.taxRate=taxRate;
    }
    public double getSalary(){
        return salary;
    }
    public double TaxRate() {
        if (salary <= 40000)
            &&
        if (status.equals(single))
               ||
        if (salary <= 60000)
            &&
        if (status.equals(married))
            taxRate = 10 % salary;
        System.out.println("Salary is: " +getSalary() - taxRate);
    }
        else

    {
        if (salary > 40000)
            &&
        if (status.equals(single))
            ||
        if (salary > 60000)
            &&
        if (status.equals(married))
            taxRate = 18 % salary;
        System.out.println("Salary is: " + getSalary() - taxRate);
    }

    public static void main(String[] args) {

    }
}

