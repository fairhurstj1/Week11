/*
Create a personal phone directory application called PhoneNumbers that contains room for first names and phone numbers for 30 people.

Assign names and phone numbers for the first 10 people.

Prompt the user for a name, and if the name is found in the list, display the corresponding phone number.

If the name is not found in the list, prompt the user for a phone number, and add the new name and phone number to the list.

Continue to prompt the user for names until the user enters quit.

After the arrays are full (containing 30 names), display a message if the user tries to make an additional entry, and end the program.

An example of the program is shown below:

Enter name to look up. Type 'quit' to quit. >> Rodger
Rodger not found in current list
   Enter phone number for Rodger >> (555) 555-0103
Enter new name to look up. Type 'quit' to quit. >> Deepak
Deepak's phone number is (930) 412-0991
Enter new name to look up. Type 'quit' to quit. >> Shu
Shu not found in current list
   Enter phone number for Shu >> (555) 555-0162
Enter new name to look up. Type 'quit' to quit. >> Shu
Shu's phone number is (555) 555-0162
Enter new name to look up. Type 'quit' to quit. >> quit
danger> The following names are used for testing and should not be included in your program's initial list: Rodger,
Freida, Leland, Donnell, Antonia, Shu, Phylicia, Gus, Yuonne, Christina, Albert, Stephen, Norris, Johnna, Noble, Abe,
Hester, Joana, Catrina, Perry, Khanh, Agnus, Marguerite, Norman, Aubrey, Sharda, Kattie, Jenette, Alanna, Telma,
Maragret, Adolfo, Sunni, Jeffry, Corrina, Dao, Nhung.
 */


import java.util.*;
public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] directory = new String[30][2];
        directory[0][0] = "Bob";
        directory[0][1] = "555-1234";
        directory[1][0] = "Bobert";
        directory[1][1] = "555-2345";
        directory[2][0] = "Bobalina";
        directory[2][1] = "555-3456";
        directory[3][0] = "Bobatron";
        directory[3][1] = "555-4567";
        directory[4][0] = "Bobinsway";
        directory[4][1] = "555-5678";
        directory[5][0] = "Bobafett";
        directory[5][1] = "555-6789";
        directory[6][0] = "Bobloboat";
        directory[6][1] = "555-9876";
        directory[7][0] = "Bobross";
        directory[7][1] = "555-8765";
        directory[8][0] = "Bobariffic";
        directory[8][1] = "555-7654";
        directory[9][0] = "Bobtonomous";
        directory[9][1] = "555-6543";

        int directorySize = 10;
        String entry;
        String phone;

        while (true) {
            System.out.print("Enter name to look up. Type 'quit' to quit. >> ");
            entry = input.nextLine();

            if ("quit".equalsIgnoreCase(entry)){
                break;
            }
            boolean isFound = false;

            for (int x = 0; x < directorySize; ++x) {
                if (directory[x][0].equalsIgnoreCase(entry)) {
                    System.out.println(directory[x][0] + "'s phone number is " + directory[x][1]);
                    isFound = true;
                    break;
                }
            }
            if (!isFound){
                System.out.println(entry+" not found in current list");
                System.out.print("   Enter phone number for "+entry+" >> ");
                phone = input.nextLine();
                directory[directorySize][0]=entry;
                directory[directorySize][1]=phone;
                directorySize++;
            }
        }
    }
}
