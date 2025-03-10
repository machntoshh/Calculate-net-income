package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var income = 0;

        int Bubblegum = 202;
        int Toffee = 118;
        int IceCream = 2250;
        int MilkChocolate = 1680;
        int Doughnut = 1075;
        int pancake = 80;

        income = Bubblegum + Toffee + IceCream + MilkChocolate + Doughnut + pancake;



        System.out.println("Earned amount: ");
        System.out.println("Bubblegum: $" + Bubblegum);
        System.out.println("Toffee: $" + Toffee);
        System.out.println("Ice Cream: $" + IceCream);
        System.out.println("Milk Chocolate: $" + MilkChocolate);
        System.out.println("Doughnut: $" + Doughnut);
        System.out.println("Pancake: $" + pancake);

        System.out.println();
        System.out.println("Income: $" + income);
        System.out.println();

        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("> " + staffExpenses);
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();
        System.out.println("> " + otherExpenses);
        int netIncome = income - (staffExpenses + otherExpenses);
        System.out.println("Net income: " + netIncome);

    }
}