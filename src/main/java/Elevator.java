import java.util.stream.IntStream;

public class Elevator {

    private static final int FLOOR_NUMBER = 10;
    private static final String FAILED_LIFT_MSG_TEMPLATE = "The given floorNumber (%d) is incorrect!";
    private static final String ELEVATOR_FLOORS_TEMPLATE = "|1|2|3|4|5|6|7|8|9|10|";
    private static final String BOTTOM_ARROW_POINTER = "^";
    private static final String SPACE = " ";

    private int currentFloor;

    public Elevator() {
        currentFloor = 1;
    }

    private void printPrettyFormatCurrentFloor() {
        int arrowIndex = currentFloor * 2 - 1;
        StringBuilder bottomArrowBuilder = new StringBuilder(BOTTOM_ARROW_POINTER);
        IntStream.range(0, arrowIndex)
                .forEach(i -> {
                    bottomArrowBuilder.insert(0, SPACE);
                });
        if (currentFloor == 10) {
            bottomArrowBuilder.append(BOTTOM_ARROW_POINTER);
        }
        System.out.println(ELEVATOR_FLOORS_TEMPLATE);
        System.out.println(bottomArrowBuilder);
    }

    public void goUpTheFloor(int floorNumber) throws ElevatorException {
        if (floorNumber > 0 && floorNumber <= FLOOR_NUMBER) {
            currentFloor = floorNumber;
            printPrettyFormatCurrentFloor();
        } else {
            throw new ElevatorException(String.format(FAILED_LIFT_MSG_TEMPLATE, floorNumber));
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
