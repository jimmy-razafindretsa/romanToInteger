import java.util.Scanner;

public class leetcode73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int total = romanToInt(s);
        System.out.println(total);
    }

    static int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (s.charAt(i + 1) == 'V') {
                        total += 4;
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        total += 9;
                        i++;
                    } else {
                        total += 1;
                    }
                    break;

                case 'X':
                    if (s.charAt(i + 1) == 'L') {
                        total += 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        total += 90;
                        i++;
                    } else {
                        total += 10;
                    }
                    break;

                case 'C':
                    if (s.charAt(i + 1) == 'D') {
                        total += 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        total += 900;
                        i++;
                    } else {
                        total += 100;
                    }
                    break;

                case 'V':
                    total += 5;
                    break;

                case 'L':
                    total += 50;
                    break;

                case 'D':
                    total += 500;
                    break;

                case 'M':
                    System.out.println("i love pp");
                    total += 1000;
                    break;
            }
        }


        if (s.length() > 0) {
            switch (s.charAt(s.length() - 1)) {
                case 'I':
                    total += 1;
                    break;
                case 'V':
                    total += 5;
                    break;
                case 'X':
                    total += 10;
                    break;
                case 'L':
                    total += 50;
                    break;
                case 'C':
                    total += 100;
                    break;
                case 'D':
                    total += 500;
                    break;
                case 'M':
                    total += 1000;
                    break;
            }
        }

        return total;
    }
}
