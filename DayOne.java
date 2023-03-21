public class DayOne {
    
    public static void main(String[] args) {
        System.out.println("Whats up class?");
        System.out.println("Hanging out with the class");

        //Data Types
        int age = 44; // An Integer
        double altAge = 44.5;
        System.out.println(age);
        System.out.println(altAge);
        // System.out.println(altAge);
        // System.out.println(age + altAge);
        System.out.println("%s and %s", age,altAge);
        System.out.println(age + "\n" + altAge);
        char test = 'a';
        String myString = "this is a string";
        hi();
        String name = "lizette";
        int num = 3;
        System.out.println(favNum(name, num));
        if(num < 15) {
            System.out.println("less than 15");
        }
        if(num < 25) {
            System.out.println("less than 25");
        }
        if(num < 30) {
            System.out.println("less than 30");
        } else {
            System.out.println("Big number");
        }
    }
    public static void hi() {
        System.out.println("\nHello my old friends");
    }
}


public static string favNum(String name, int num){
    return "Hey everyone guess what?" + name + "has a favorite number of " + num;
}
