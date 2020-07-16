package src.main;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double number1=0.0, number2=0.0, result=0.0;
        String operator;

        Operators SumCalc =  new Operators();

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        try {
            number1 = Double.parseDouble(scanObject.nextLine());
        } catch(NumberFormatException e) {
            System.out.println("Era para digitar um número, animal!");
            System.out.close();
        }

        System.out.println("Digite a operação que deseja realizar. + para somar, - para subtrair, / para dividir e x para multiplicar");
        operator = scanObject.nextLine();

        System.out.println("Digite o próximo número");
        try {
            number2 = Double.parseDouble(scanObject.nextLine());
        } catch(NumberFormatException e) {
            System.out.println("Era para digitar um número, animal!");
            System.out.close();
        }


        switch (operator) {
            case "+":
                System.out.println("O resultado da soma é: " + SumCalc.sum(number1,number2));
                break;
            case "-":
                System.out.println("O resultado da subtração é: " + SumCalc.subtract(number1,number2));
                break;
            case "/":
                System.out.println("O resultado da divisão é: " + SumCalc.divide(number1,number2));
                break;
            case "x":
                System.out.println("O resultado da multiplicação é: " + SumCalc.multiply(number1,number2));
                break;
        }
    }
}

