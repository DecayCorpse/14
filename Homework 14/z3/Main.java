package z3;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = 1;
        int a = scanner.nextInt();
        if (a == 1) {
            Something<String> something = (s) -> new StringBuilder(s).reverse().toString();
            System.out.println(something.sdelat("sdgnjsdfgjmsdf"));
        }
        if (a == 2) {
            Something<Integer> something ;
            something = (number) -> IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y);
            System.out.println(something.sdelat(5));
            }
        }
    }


