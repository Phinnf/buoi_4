import java.util.Scanner;

public class Calculator {
    static int calculateSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        char choice;
        String input;

        do {
            System.out.print("Nhap mot so nguyen hoac nhan 'n' de dung: ");
                input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
            num = input;
            sum += num;
            System.out.print("ban co muon tiep tuc khong? (y/n): ");
            choice = scanner.nextLine();
        } while (choice == 'y');

        return sum;
    }
    static int calculateSumOfProduct(int n){
        int i, tich = 1; 
        for (i = 1; i <= n; i++) {
            tich *= i;
        }
        int tong = 0;
        for (i = 1; i <= n; i++) {
            tong += tich;
        }
        System.out.printf("%d", tong);
        return tich;
        }
    }
