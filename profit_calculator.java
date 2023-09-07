public class profit_calculator {
    public static void main(String[] args) {
        // Declare variables
        String businessName = "Mary Ventures";
        String businessLogo = "logo.png";
        double income = 10000.00;
        double expenses = 7000.00;
        
        // Calculate profit or loss
        double margin = income - expenses;
        
        // Display business information and result
        System.out.println("Business Name: " + businessName);
        System.out.println("Business Logo: " + businessLogo);
        System.out.println("Income: N" + income);
        System.out.println("Expenses: N" + expenses);
        
        if (margin > 0) {
            System.out.println("Congratulations! The business made a profit of N" + margin);
        } else if (margin < 0) {
            System.out.println("Oops! The business incurred a loss of N" + (-margin));
        } else {
            System.out.println("The business broke even. No profit, no loss.");
        }
    }
}