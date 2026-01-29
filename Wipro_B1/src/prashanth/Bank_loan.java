package prashanth;

import java.util.ArrayList;

public class Bank_loan {

    public static void main(String[] args) {

        Integer age = 26;
        Integer cibilScore = 720;

        ArrayList<Double> incomeList = new ArrayList<>();

        incomeList.add(30000.0);

        double monthlyIncome = incomeList.get(0);

        if (age >= 21 && monthlyIncome >= 25000 && cibilScore >= 700) {
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan Not Approved");
        }

        System.out.println("Age: " + age);
        System.out.println("Monthly Income: " + monthlyIncome);
        System.out.println("CIBIL Score: " + cibilScore);
    }
}
