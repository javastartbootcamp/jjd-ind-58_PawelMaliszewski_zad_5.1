package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.
    void run(Scanner scanner) {
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();
        Point point = new Point(x, y);
        PointLocation pointLocation = new PointLocation();
        System.out.print("Punkt (" + x + ", " + y + ")");
        pointLocation.pointLocationInfo(point);
        scanner.close();
    }
}
