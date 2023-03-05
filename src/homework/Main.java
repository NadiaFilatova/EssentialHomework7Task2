package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        for (int i = 0; i < 5; i++) {
            workers[i] = createWorker();
        }
        Arrays.sort(workers);
        System.out.println(Arrays.toString(workers));
    }

    public static Worker createWorker() {
        String surname;
        String nameWork;
        int year;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter surname: ");
                surname = scanner.next();
                if (surname.length() >= 20 || containsNotLetters(surname)) {
                    System.out.println("Surname must be shorter than 20 symbols and contain only letters");
                    continue;
                }
                break;
            } catch (RuntimeException e) {
                System.out.println("Error");
            }
        }
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter nameWork: ");
                nameWork = scanner.next();
                if (nameWork.length() >= 20 || containsNotLetters(nameWork)) {
                    System.out.println("nameWork must be shorter than 20 symbols and contain only letters");
                    continue;
                }
                break;
            } catch (RuntimeException e) {
                System.out.println("Error");
            }
        }
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter year: ");
                year = scanner.nextInt();
            } catch (RuntimeException e) {
                System.out.println("Error");
                continue;
            }
            if (year >= 2024 || year <= 1940) {
                System.out.println("year must be less than 2024 and greater than 1900");
                continue;
            }
            break;
        }
        System.out.println("Thank you");
        return new Worker(surname, nameWork, year);
    }

    private static boolean containsNotLetters(String str) {
        for (char symbol : str.toCharArray()) {
            if (!Character.isLetter(symbol)) {
                return true;
            }
        }
        return false;
    }
}