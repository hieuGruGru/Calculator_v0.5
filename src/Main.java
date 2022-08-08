import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int i = 0;
        while( i < 5) {
            Scanner sc = new Scanner(System.in);
            String inputString = sc.nextLine();
            double res = EvaluationExpression.evaluation(inputString);
            System.out.println("biểu thức cần tính toán : " + inputString );
            System.out.println("Kết quả tính toán được là : " + res);
            i++;
        }
    }
}

