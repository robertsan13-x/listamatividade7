import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double lado, area, darea;
        System.out.println("Digite 1 lado do quadrado");
        lado = input.nextDouble();
        area = lado * lado;
        darea = area * 2;
        System.out.println("A sua área é: " + area);
        System.out.println("O dobro da sua área é: " + darea);
        input.close();
    }
}
