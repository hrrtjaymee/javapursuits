import java.util.Scanner;

public class Regencia_Exercise4 {
    static double localRad;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = "Enter number: ";

        System.out.println(line);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        sc.close();

        double dish = distance(x1, y1, x2, y2);
        double rad = radius(x1, y1, x2, y2);
        double circ = circumference(rad);
        double ar = area(rad);

        System.out.printf("Distance: %.2f Radius: %.2f Circumference: %.2f Area: %.2f", dish, rad, circ, ar);

    }

    public static double distance(double x1, double y1, double x2, double y2){
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) - Math.pow(y2 - y1, 2));
        return dist;
    }

    public static double radius(double x1, double y1, double x2, double y2){
        localRad = distance(x1, y1, x2, y2)/2;
        return localRad;
    }

    public static double circumference(double radius){ 
        return 2 * Math.PI * radius;
    }

    public static double area(double a){
        return Math.PI * Math.pow(a, 2);
    }
}
