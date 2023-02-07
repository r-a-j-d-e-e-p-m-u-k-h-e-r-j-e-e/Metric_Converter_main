import java.util.Scanner;

public class converter {
    public static void main(String[] args) throws Exception {
        double number = 0;
        int selection = 0;
              
        
        // Printing the options

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the value of the unit to be changed here: ");
        number = input1.nextDouble(); 

        Scanner input2 = new Scanner(System.in);
        System.out.println("   Welcome to metric converter! ");
        System.out.println("1. Kilogram (kg) to Pounds (lbs)");
        System.out.println("2. Grams (g) to Ounces (oz)");
        System.out.println("3. Kilometers (km) to Miles (mi)");
        System.out.println("4. Millimeter (mm) to Inches (in)");
        System.out.println("5. Celcius (C) to Fahrenheit (F)");
        
        selection = input2.nextInt();
        input1.close();
        input2.close();
         

        // if /else-if statements for the selections

        if (selection == 1) {
            ktp(number);
        }
        else if (selection == 2) {
            gto(number);
        }
        else if (selection == 3) {
            ktm(number);
        }
        else if (selection == 4) {
            mti(number);
        }
        else if (selection == 5) {
            ctf(number);
        }

            
    }  
    // conversions
    public static void ktp(double number) {
        double unit;
        unit = 2.20462*number;
        System.out.println(number + " Kilograms (kg) equals " + unit + " Pounds (lbs)");
    }
    public static void gto(double number) {
        double unit2;
        unit2 = 0.035274*number;
        System.out.println(number + " Grams (g) equals " + unit2 + " Ounces (oz)");
    }
    public static void ktm(double number) {
        double unit3;
        unit3 = 0.621371*number;
        System.out.println(number + " Kilometers (km) equals " + unit3 + " Miles (mi)");
    }
    public static void mti(double number) {
        double unit4;
        unit4 = 0.0393701*number;
        System.out.println(number + " Millimeters (mm) equals " + unit4 + " Inches (in)");
    }
    public static void ctf(double number) {
        double unit5;
        unit5 = 1.8*number + 32;
        System.out.println(number + " Celcius (C) equals " + unit5 + " Fahrenheit (F)");
    }
    

}
