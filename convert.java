import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input a number:");
        int num = Integer.parseInt(scanner.nextLine());
        scanner.close();

        String binary = binary(num);
        String hexadecimal = hexadecimal(num);

        System.out.println("Input number was: " + num);
        System.out.println("Input number in binary: " + binary);
        System.out.println("Input number in hexadecimal: " + hexadecimal);
    }

    private static String hexadecimal(int num) {
        return null;
    }

    public static String binary(int num) {
        String str = binBuild(num, "");

        String aux = "";
        for (int i = str.length()-1; i >= 0; i--) {
            aux += str.charAt(i);
        }

        return aux;
    }

    private static String binBuild(int num, String str) {
        if (num == 0) {
            return str + "0";
        }
        if (num == 1) {
            return str + "1";
        }
        str += String.valueOf(num % 2);
        return binBuild(num/2, str);
    }
}