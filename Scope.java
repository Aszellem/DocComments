public class Scope {
    static int dogs = 5;

    public static void main(String[] args) {
        System.out.println(dogs);
        someFunction();
    }

    /*
     * void function is not gonna return anyting
     */

    public static void someFunction(){
        System.out.println(dogs);
    }
}
