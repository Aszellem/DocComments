public class ReturnValues {
    public static void main(String[] args) {
        double meansure1 = meansureRectangle(2.2, 4.3, "area");
        double meansure2 = meansureRectangle(2.5, 4.1,"perimeter");

        stringPrinter(2.2, 4.3, meansure1, "area");
        stringPrinter(2.5, 4.1, meansure2, "perimeter");

    }

    public static double meansureRectangle(double length, double width, String option){
        if(length < 0 || width < 0){
            System.out.println("length or width cannot be negative");
            System.exit(0);
        }
        switch(option){
            case "area": return length * width;
            case "perimeter": return 2 * (length + width);
            default: return 404;
        }
    }

    public static void stringPrinter(double length, double width, double area, String option){
        System.out.println("The " + option + " of rectangle with length "+ length + 
        " and with " + width + "  is equal to " + area + "\n");
    }

}
