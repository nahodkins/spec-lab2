import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print color number: ");
        System.out.println(TrafficLightsColor.getColorByColorNum(scanner.nextInt()));
    }
}
