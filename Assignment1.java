import java.util.Scanner;

class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] accountNumbers = new int[100];
        String[] names = new String[100];
        double[] balances = new double[100];
        String[] emails = new String[100];
        String[] phones = new String[100];
        int accountCount = 0;
        int nextAccNo = 1001;

        while (true) {
            System.out.println("\nWelcome to the Banking Application!");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Update contact details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                accountNumbers[accountCount] = nextAccNo;
                nextAccNo++;

                System.out.print("Enter name: ");
                names[accountCount] = sc.nextLine();

                System.out.print("Enter initial deposit: ");
                balances[accountCount] = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter email: ");
                emails[accountCount] = sc.nextLine();

                System.out.print("Enter phone: ");
                phones[accountCount] = sc.nextLine();

                System.out.println("Account created with number: " + accountNumbers[accountCount]);
                accountCount++;
            } 
            else if (choice == 2) {
                System.out.print("Enter account number: ");
                int accNo = sc.nextInt();
                System.out.print("Enter amount to deposit: ");
                double amt = sc.nextDouble();

                for (int i = 0; i < accountCount; i++) {
                    if (accountNumbers[i] == accNo) {
                        balances[i] += amt;
                        System.out.println("Deposit successful!");
                    }
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter account number: ");
                int accNo = sc.nextInt();
                System.out.print("Enter amount to withdraw: ");
                double amt = sc.nextDouble();

                for (int i = 0; i < accountCount; i++) {
                    if (accountNumbers[i] == accNo) {
                        if (balances[i] >= amt) {
                            balances[i] -= amt;
                            System.out.println("Withdrawal successful!");
                        } else {
                            System.out.println("Not enough balance.");
                        }
                    }
                }
            } 
            else if (choice == 4) {
                System.out.print("Enter account number: ");
                int accNo = sc.nextInt();

                for (int i = 0; i < accountCount; i++) {
                    if (accountNumbers[i] == accNo) {
                        System.out.println("Account Number: " + accountNumbers[i]);
                        System.out.println("Name: " + names[i]);
                        System.out.println("Balance: " + balances[i]);
                        System.out.println("Email: " + emails[i]);
                        System.out.println("Phone: " + phones[i]);
                    }
                }
            } 
            else if (choice == 5) {
                System.out.print("Enter account number: ");
                int accNo = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < accountCount; i++) {
                    if (accountNumbers[i] == accNo) {
                        System.out.print("Enter new email: ");
                        emails[i] = sc.nextLine();
                        System.out.print("Enter new phone: ");
                        phones[i] = sc.nextLine();
                        System.out.println("Contact updated!");
                    }
                }
            } 
            else if (choice == 6) {
                System.out.println("Goodbye!");
                break;
            } 
            else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
