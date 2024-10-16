import java.util.Scanner;
class Loan {
    public int loanAmount;
    public double annualInterestRate;
    public int loanDurationinYears;
     
    public double calcMonthlyPayment(int loanAmount, double annualInterestRate, int loanDurationinYears) {
       double monthlyInterestRate = annualInterestRate/1200;
       double loanDurationinMonths = loanDurationinYears*12;
       int monthlyPayment = (int) (loanAmount * (monthlyInterestRate*Math.pow((1+monthlyInterestRate), loanDurationinMonths))/(Math.pow((1+monthlyInterestRate), loanDurationinMonths)-1)); 
       return monthlyPayment;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterest() {
        return annualInterestRate;
    }

    public void setInterest(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanDurationinyears() {
        return loanDurationinYears;
    }

    public void setLoanDurationinYears(int loanDuration) {
        this.loanDurationinYears = loanDuration;
    }
}
class Morgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        Loan loan = new Loan();
        System.out.println("Enter loan amount: ");
        loan.setLoanAmount(scanner.nextInt());
        System.out.println("Enter interest rate: ");
        loan.setInterest(scanner.nextInt());
        System.out.println("Enter loan duration in years: ");
        loan.setLoanDurationinYears(scanner.nextInt());
        double monthlyPayment = loan.calcMonthlyPayment(loan.getLoanAmount(), loan.getInterest(), loan.getLoanDurationinyears());
        System.out.println("Monthly payment: "+monthlyPayment);

    }
}