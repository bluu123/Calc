import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        boolean q1 = false, q2 = false, q3 = false;
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String[] roman2 = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String sa, sb;
        Scanner in = new Scanner(System.in);
        String op = in.nextLine();
        String qq = " ";
        String[] strings = op.split(" ");
        if (strings.length == 3) {
        sa = strings[0];
        sb = strings[2];
        for (String str:roman2){
            if (sa.equals(str)){
                q1 = true;
            }
        }
            for (String str:roman2){
                if (sb.equals(str)){
                    q2 = true;
                }
            }


            if ((q1 == false) && (q2 == false)){
                a = Integer.parseInt(sa);
                b = Integer.parseInt(sb);
            }
            if ((q1 == true) && (q2 == true))
            {
                a = Roma.valueOf(sa).getTr();
                b = Roma.valueOf(sb).getTr();
            }
            if ((a <= 10) && (b <= 10) && (a > 0) && (b > 0)) {
                switch (strings[1]) {
                    case "+":
                        c = a + b;
                        break;
                    case "-":
                        c = a - b;
                        break;
                    case "*":
                        c = a * b;
                        break;
                    case "/":
                        c = a / b;
                        break;
                    default: {
                        System.out.println("Ошибка");
                        q3 = true;
                    }
                }
            }else {System.out.println("Ошибка");}
            if ((q1 == true) && (q2 == true)&&(c>=1)) {
                System.out.println(roman[c]);
            }else {System.out.println("Ошибка");
            }
            if ((q1 == false) && (q2 == false)&&(q3 = false)) {
                System.out.println(c);
            }

        }else {System.out.println("Ошибка");}
    }
}