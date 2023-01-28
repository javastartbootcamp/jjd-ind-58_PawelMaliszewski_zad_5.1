package pl.javastart.task;

public class PointLocation {
    private String quarterNumber;

    void pointLocationInfo(Point point) {
        if (point.getX() > 0 && point.getY() > 0) {
            quarterNumber = "I";
            quarterinfo(quarterNumber);
        } else if (point.getX() < 0 && point.getY() > 0) {
            quarterNumber = "II";
            quarterinfo(quarterNumber);
        } else if (point.getX() < 0 && point.getY() < 0) {
            quarterNumber = "III";
            quarterinfo(quarterNumber);
        } else if (point.getX() > 0 && point.getY() < 0) {
            quarterNumber = "IV";
            quarterinfo(quarterNumber);
        } else if (point.getY() == 0 && point.getX() != 0) {
            System.out.println(" leży na osi X");
        } else if (point.getX() == 0 && point.getY() != 0) {
            System.out.println(" leży na osi Y.");
        } else if (point.getX() == 0 && point.getY() == 0) {
            System.out.println(" leży na środku układu współrzędnych");
        }
    }

    private void quarterinfo(String string) {
        System.out.println(" leży w " + string + " ćwiartce układu współrzędnych");
    }
}

