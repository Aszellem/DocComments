public class ReturnValues {
    public static void main(String[] args) {
        double meansure1 = meansureRectangle(2.2, 4.3);
        double meansure2 = meansureRectangle(2.5, 4.1);

        stringPrinter(2.2, 4.3, meansure1);
    }

    public static double meansureRectangle(double length, double width){
        double area = length * width;
        return area;
    }

    public static void stringPrinter(double length, double width, double area){
        System.out.println("The area of rectangle with length "+ length + 
        " and with " + width + "  is equal to " + area + "\n");
    }

}
