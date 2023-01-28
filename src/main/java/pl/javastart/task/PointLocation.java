package pl.javastart.task;

public class PointLocation {

    void pointLocationInfo(Point point) {
        if (point.getX() > 0 && point.getY() > 0) {
            System.out.println(" leży w I ćwiartce układu współrzędnych.");
        } else if (point.getX() < 0 && point.getY() > 0) {
            System.out.println(" leży w II ćwiartce układu współrzędnych.");
        } else if (point.getX() < 0 && point.getY() < 0) {
            System.out.println(" leży w III ćwiartce układu współrzędnych.");
        } else if (point.getX() > 0 && point.getY() < 0) {
            System.out.println(" leży w IV ćwiartce układu współrzędnych.");
        } else if (point.getY() == 0 && point.getX() != 0) {
            System.out.println(" leży na osi X");
        } else if (point.getX() == 0 && point.getY() != 0) {
            System.out.println(" leży na osi Y.");
        } else if (point.getX() == 0 && point.getY() == 0) {
            System.out.println(" leży na środku układu współrzędnych");
        }
    }
}
