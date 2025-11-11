import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nWELCOME TO YOGASYNC!\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("          Member Registration Plan for YogaSync.");
        boolean validRegistration = false;

        while (!validRegistration) {
            System.out.println("          Please enter your name:");
            String name = scanner.nextLine();

            System.out.println("          Please enter your email:");
            String email = scanner.nextLine();

            System.out.println("          Please enter your password:");
            String password = scanner.nextLine();

            System.out.println("          Please enter your phone number:");
            String phoneNumber = scanner.nextLine();

            // Validate phone number input
            boolean validPhoneNumber = false;
            while (!validPhoneNumber) {

                if (isValidPhoneNumber(phoneNumber)) {
                    validPhoneNumber = true;
                } else {
                    System.out.println("          Invalid phone number. Please try again. The phone number should consist of 10 digits only! ");
                }
            }

            // Validate password input
            boolean validPassword = false;
            while (!validPassword) {
                if (isValidPassword(password)) {
                    validPassword = true;
                } else {
                    System.out.println("          Invalid password. Password must be at least 8 characters long and contain a number. Please try again.");
                    password = scanner.nextLine();
                }
            }

            System.out.println("          If you are ADMIN, please enter your ADMIN login code or enter, 'no': ");
            String admin = scanner.nextLine();

            while (!admin.equals("1111") && !admin.equals("no")) {
                System.out.println("          Your ADMIN code is incorrect, REMEMBER if you are not admin, enter 'no': ");
                admin = scanner.nextLine();
            }

            if (admin.equals("1111")) {
                System.out.println("          Welcome ADMIN, login is successful!");
                System.out.println("          Name: " + name);
                System.out.println("          Email: " + email);
                System.out.println("          Phone Number: " + phoneNumber);
            } else {
                System.out.println("          Welcome, login is successful!");
                System.out.println("          Name: " + name);
                System.out.println("          Email: " + email);
                System.out.println("          Phone Number: " + phoneNumber);
            }

            System.out.println("          Do you want to register another member? (yes/no)");
            String continueRegistration = scanner.nextLine();

            if (!continueRegistration.equalsIgnoreCase("yes")) {
                validRegistration = true;
            }

        }

        System.out.println("          Please enter 'yes' to view the YogaSync class schedule");
        String ans = scanner.nextLine();

        while (!ans.equals("yes")) {
            System.out.println("          Please enter 'yes' to view the YogaSync class schedule");
            ans = scanner.nextLine();
        }

        System.out.println();
        System.out.println("Yoga Class - Monday 8:00 AM - 10:00 AM                        Lane Swim Class - Tuesday 8:00 AM - 10:00 AM                Power Yoga Class - Wednesday 8:00 AM - 10:00 AM");
        System.out.println("AquaFit Class - Monday 10:00 AM - 12:00 PM                    AquaFit Class - Tuesday 10:00 AM - 12:00 PM                 Yoga Class - Wednesday 10:00 AM - 12:00 PM");
        System.out.println("Power Yoga Class - Monday 12:00 PM - 2:00 PM                  Power Yoga Class - Tuesday 12:00 PM - 2:00 PM               Pilates Class - Wednesday 12:00 PM - 2:00 PM");
        System.out.println("Lane Swim Class - Monday 2:00 PM - 4:00 PM                    Pilates Class - Tuesday 2:00 PM - 4:00 PM                   Lane Swim Class - Wednesday 2:00 PM - 4:00 PM");
        System.out.println("Rec Swim Class - Monday 4:00 PM - 7:00 PM                     Rec Swim Class - Tuesday 4:00 PM - 7:00 PM                  Rec Swim Class - Wednesday 4:00 PM - 7:00 PM");
        System.out.println("Pilates Class - Monday 7:00 PM - 9:00 PM                      Yoga Class - Tuesday 7:00 PM - 9:00 PM                      AquaFit Class - Wednesday 7:00 PM - 9:00 PM");
        System.out.println("High Impact Cardio Class - Monday 9:00 PM - 11:00 PM          High Impact Cardio Class - Tuesday 9:00 PM - 11:00 PM       High Impact Cardio Class - Wednesday 9:00 PM - 11:00 PM");
        System.out.println();
        System.out.println("Yoga Class - Thursday 8:00 AM - 10:00 AM                      Pilates Class - Friday 8:00 AM - 10:00 AM                   AquaFit Class - Saturday 8:00 AM - 10:00 AM");
        System.out.println("AquaFit Class - Thursday 10:00 AM - 12:00 PM                  Yoga Class - Friday 10:00 AM - 12:00 PM                     Lane Swim Class - Saturday 10:00 AM - 12:00 PM");
        System.out.println("Power Yoga Class - Thursday 12:00 PM - 2:00 PM                Lane Swim Class - Friday 12:00 PM - 2:00 PM                 Power Yoga Class - Saturday 12:00 PM - 2:00 PM");
        System.out.println("Lane Swim Class - Thursday 2:00 PM - 4:00 PM                  High Impact Cardio Class - Friday 2:00 PM - 4:00 PM         Rec Swim Class - Saturday 2:00 PM - 4:00 PM");
        System.out.println("Rec Swim Class - Thursday 4:00 PM - 7:00 PM                   Rec Swim Class - Friday 4:00 PM - 7:00 PM                   High Impact Cardio Class - Saturday 4:00 PM - 7:00 PM");
        System.out.println("Pilates Class - Thursday 7:00 PM - 9:00 PM                    AquaFit Class - Friday 7:00 PM - 9:00 PM                    Yoga Class - Saturday 7:00 PM - 9:00 PM");
        System.out.println("High Impact Cardio Class - Thursday 9:00 PM - 11:00 PM        Power Yoga Class - Friday 9:00 PM - 11:00 PM                Pilates Class - Saturday 9:00 PM - 11:00 PM");
        System.out.println();
        System.out.println("Yoga Class - Sunday 8:00 AM - 10:00 AM");
        System.out.println("AquaFit Class - Sunday 10:00 AM - 12:00 PM");
        System.out.println("Power Yoga Class - Sunday 12:00 PM - 2:00 PM");
        System.out.println("Pilates Class - Sunday 2:00 PM - 4:00 PM");
        System.out.println("Lane Swim Class - Sunday 4:00 PM - 6:00 PM");
        System.out.println("High Impact Cardio Class - Sunday 6:00 PM - 8:00 PM");
        System.out.println("Rec Swim Class - Sunday 8:00 PM - 10:00 PM");

        List<String> chosenClasses = new ArrayList<>();
        System.out.println();
        System.out.println();

        System.out.println("          Would you like to add classes?");
        System.out.println("          Enter 'yes' or 'no'");
        String answer = scanner.nextLine();

        if (answer.equals("no")) {
            System.out.println();
            System.out.println("          Thank you for registering with YOGASYNC!");
            System.out.println("          Have a nice day!");
            return;
        }

        System.out.println();
        boolean doneChoosing = false;
        while (!doneChoosing) {
            System.out.println("          Enter the day of the class you would like to book (Monday, Tuesday, etc.):");
            String day = scanner.nextLine();

            if (!isValidDay(day)) {
                System.out.println("          Invalid day. Please enter a valid day.");
                continue;
            }

            System.out.println("          Enter the class name:");
            String className = scanner.nextLine();


            Object[] result = isValidClass(day, className);
            boolean isValid = (boolean) result[0];
            String classInfo = (String) result[1];
            if (!isValid) {
                System.out.println("          Invalid class name or not available on the specified day. Please enter a valid class.");
                continue;
            }


            chosenClasses.add(day.toUpperCase() + ": " + classInfo);

            System.out.println("          Do you want to choose another class? (yes/no)");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("no")) {
                doneChoosing = true;
            }
        }


        System.out.println("          Chosen classes:");
        System.out.println();
        for (String chosenClass : chosenClasses) {
            System.out.println(chosenClass);
        }

        System.out.println();
        System.out.println("          Each class is $35.");
        Double cost = chosenClasses.size() * 35.00;

        if (chosenClasses.size() == 1) {
            System.out.printf("          Since, you have chosen %d class, your total cost for today will be %.2f", chosenClasses.size(), cost);
            System.out.println();
        } else {
            System.out.printf("          Since, you have chosen %d classes, your total cost for today will be %.2f", chosenClasses.size(), cost);
            System.out.println();
        }

        System.out.println("          Please enter your bank information when prompted.");
        System.out.println();
        System.out.println("          Enter your bank account number with NO spaces: ");
        String accountNumber = scanner.nextLine();

        System.out.println("          Enter your card expiration date (MM/YYYY): ");
        String expirationDate = scanner.nextLine();

        System.out.println("          Enter your CCV number: ");
        String ccvNumber = scanner.nextLine();

        while (!isValidBankDetails(accountNumber, expirationDate, ccvNumber)) {
            System.out.println("          Payment processing error caused by invalid bank details. Please check and try again.");
            System.out.println("          Enter your bank account number with NO spaces: ");
            accountNumber = scanner.nextLine();

            System.out.println("          Enter your card expiration date (MM/YYYY): ");
            expirationDate = scanner.nextLine();

            System.out.println("          Enter your CCV number: ");
            ccvNumber = scanner.nextLine();
        }

        System.out.println("          Thank you! Payment Successful.");
        System.out.println();

        System.out.println("          WELCOME TO YOGASYNC!");
        System.out.println("          ");
        System.out.println("          Your Upcoming Classes:");

        System.out.println("          Chosen classes:");
        System.out.println();

        Collections.sort(chosenClasses, new TimeComparator());
        System.out.println("Your Upcoming Classes:");
        int temp = 0;
        for (String chosenClass : chosenClasses) {
            temp = temp + 1;
            System.out.print(chosenClass + " Session " + String.valueOf(temp));
        }

        scanner.close();
    }

    private static boolean isValidPhoneNumber(String phoneNumber){
        return phoneNumber.matches("\\d{10}");
    }

    private static boolean isValidPassword(String password){
        return password.length() >= 8 && password.matches(".*\\d.*");
    }

    private static boolean isValidDay(String day) {
        day = day.toLowerCase();
        List<String> validDays = Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");
        return validDays.contains(day);
    }

    private static Object[] isValidClass(String day, String className) {
        day = day.toLowerCase();

        Map<String, List<String>> classesMap = new HashMap<>();
        classesMap.put("monday", Arrays.asList(
                "Yoga Class @ 8:00 AM", "AquaFit Class @ 10:00 AM", "Power Yoga Class @ 12:00 PM",
                "Lane Swim Class @ 2:00 PM", "Rec Swim Class @ 4:00 PM", "Pilates Class @ 7:00 PM",
                "High Impact Cardio Class @ 9:00 PM"
        ));
        classesMap.put("tuesday", Arrays.asList(
                "Lane Swim Class @ 8:00 AM", "AquaFit Class @ 10:00 AM", "Yoga Class @ 7:00 PM",
                "Power Yoga Class @ 12:00 PM", "Pilates Class @ 2:00 PM", "Rec Swim Class @ 4:00 PM",
                "High Impact Cardio Class @ 9:00 PM"
        ));
        classesMap.put("wednesday", Arrays.asList(
                "Power Yoga Class @ 8:00 AM", "Yoga Class @ 10:00 AM", "Pilates Class @ 12:00 PM",
                "Lane Swim Class @ 2:00 PM", "Rec Swim Class @ 4:00 PM", "AquaFit Class @ 7:00 PM",
                "High Impact Cardio Class @ 9:00 PM"
        ));
        classesMap.put("thursday", Arrays.asList(
                "Yoga Class @ 8:00 AM", "Pilates Class @ 10:00 AM", "Lane Swim Class @ 2:00 PM",
                "High Impact Cardio Class @ 9:00 PM"
        ));
        classesMap.put("friday", Arrays.asList(
                "Pilates Class @ 8:00 AM", "Yoga Class @ 10:00 AM", "High Impact Cardio Class @ 9:00 PM"
        ));
        classesMap.put("saturday", Arrays.asList(
                "AquaFit Class @ 8:00 AM", "Lane Swim Class @ 10:00 AM", "Power Yoga Class @ 12:00 PM",
                "Rec Swim Class @ 2:00 PM", "Yoga Class @ 7:00 PM", "Pilates Class @ 9:00 PM"
        ));
        classesMap.put("sunday", Arrays.asList(
                "Yoga Class @ 8:00 AM", "AquaFit Class @ 10:00 AM", "Power Yoga Class @ 12:00 PM",
                "Pilates Class @ 2:00 PM", "Lane Swim Class @ 4:00 PM", "High Impact Cardio Class @ 6:00 PM",
                "Rec Swim Class @ 8:00 PM"
        ));

        if (!classesMap.containsKey(day)) {
            System.out.println("Invalid day. Please enter a valid day.");
            return new Object[]{false, null};
        }

        // Check if the class exists on the specified day
        List<String> classesOnDay = classesMap.get(day);
        for (String classInfo : classesOnDay) {
            if (classInfo.toLowerCase().contains(className.toLowerCase())) {
                return new Object[]{true, classInfo};
            }
        }
        return new Object[]{false, null};
    }

    private static boolean isValidBankDetails(String accountNumber, String expirationDate,
                                              String ccvNumber) {
        boolean isValid = true;

        if (accountNumber.length() != 16 && accountNumber.matches("[0-9]+")) {
            System.out.println("Account number must contain digits only and be 10 digits long.");
            isValid = false;
        }

        if (!isValidExpirationDate(expirationDate)) {
            System.out.println("Invalid expiration date format. Please use MM/YYYY format.");
            isValid = false;
        }

        if (ccvNumber.length() != 3 && ccvNumber.matches("[0-9]+")) {
            System.out.println("CCV number must contain digits only and be 3 digits long.");
            isValid = false;
        }

        return isValid;
    }

    private static boolean isValidExpirationDate(String expirationDate) {
        return expirationDate.matches("^(0[1-9]|1[0-2])/(20)\\d{2}$");
    }

    static class TimeComparator implements Comparator<String> {
        @Override
        public int compare(String class1, String class2) {
            String time1 = extractTime(class1);
            String time2 = extractTime(class2);
            return time1.compareTo(time2);
        }

        private String extractTime(String classString) {
            return classString.split(" @ ")[1];
        }
    }

}