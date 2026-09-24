package util;

import java.util.Scanner;


// The Input Checking Classes.
public class inputUtil {
    public int readNumber(Scanner scanner) {
        while (true) {
            try {
                int readingNumber = Integer.parseInt(scanner.nextLine());
                return readingNumber;
            } catch (NumberFormatException e) {
                System.out.println("Oh, An Error is Occurred. Please Confirm Your Inputting.");

            }
        }
    }

    public String readingTeamName(Scanner scanner) {
        while (true) {

                String teamName = scanner.nextLine();

                //Reason: The Shortest Team Length is 4(Ex: Ajax, Roma, etc...). There is NO Teams Shorter than 4 Characters.
                if(teamName.length() < 4) {
                    System.out.println("There is no Team.");
                    continue;
                }
                if(!teamName.matches("[a-zA-Z é0-9.]+")) {
                    System.out.println("Please Input in Alphabet.");
                    continue;

                }
                return  teamName;
        }

    }

    public String checkUserName(Scanner scanner) {
        while (true) {
            String userName = scanner.nextLine();
            if(userName.matches("[a-zA-Z]+")) {
                return userName;
            }
            System.out.println("Please Input in Alphabet.");
        }

    }
}
