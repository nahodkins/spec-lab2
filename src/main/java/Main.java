import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private static final int FLOOR_NUMBER = 10;



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevator elevator = new Elevator();
        boolean isExited = false;
        while (!isExited) {
            System.out.print("Print floor number (to exit print 'exit'): ");
            String givenFloor = scanner.next();
            if (givenFloor.equals("exit")) {
                isExited = true;
            } else {
                try {
                    try {
                        int givenFloorInteger = Integer.parseInt(givenFloor);
                        elevator.goUpTheFloor(givenFloorInteger);
                    } catch (NumberFormatException e) {
                        System.out.println("Not a number!");
                    }
                } catch (ElevatorException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
