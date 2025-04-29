import java.util.Scanner;

public class Nokia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] mainMenu = {
            "1. Phone book",
            "2. Message",
            "3. Chat",
            "4. Call register",
            "5. Tones",
            "6. Settings",
            "7. Call divert",
            "8. Games",
            "9. Calculator",
            "10. Reminders",
            "11. Clock",
            "12. Profiles",
            "13. SIM Services"
        };

        System.out.println("=== Nokia 3310 Main Menu ===");
        for (String item : mainMenu) {
            System.out.println(item);
        }

        System.out.println("Enter a menu number (1-13) to explore: ");
        int choice = scanner.nextInt();

        System.out.println();

         switch (choice) {
            case 1:
                String[] phonebook = {
                    "1. Search",
                    "2. Search nos",
                    "3. Add name",
                    "4. Erase",
                    "5. Edit",
                    "6. Assign tone",
                    "7. Send b'card",
                    "8. Options",
                    "9. Speed dials",
                    "10. Voice tags",
                };
                System.out.println("--- phonebook Submenu --- ");
                for (String item : phonebook) System.out.println(item);
                break;
             
            case 2:
                String[] messagesMenu = {
                    "1. Write Message",
                    "2. Inbox",
                    "3. Outbox",
                    "4. Picture Messages",
                    "5. Templates",
                    "6. Smileys",
                    "7. Set",
                    "8. Info Service",
                    "9. Voice Mailbox Number",
                    "10. Service Command Editor"
                };
                System.out.println("--- Messages Submenu ---");
                for (String item : messagesMenu) System.out.println(item);
                break;

            case 3:
                String[] chat = {
                  };
                System.out.println("--- chat --- ");
                for (String item : chat ) System.out.println(item);
                break;   

            case 4:
                String[] callregister = {
                    "1. Missed Calls",
                    "2. Received Calls",
                    "3. Dialed Numbers",
                    "4. Erase Recent Call Lists",
                    "5. Show Call Duration",
                    "6. Show Call Costs",
                    "7. Call Cost Settings",
                    "8. Prepaid Credit"
                };
                System.out.println("--- call register Submenu ---");
                for (String item : callregister) System.out.println(item);
                break;
            case 5:
                String[] tones = {
                    "1. Ringing Tone",
                    "2. Ringing Volume",
                    "3. Incoming Call Alert",
                    "4. Composer",
                    "5. Message Alert Tone",
                    "6. Keypad Tones",
                    "7. Warning and Game Tones",
                    "8. Vibrating Alert",
                    "9. Screen Saver"
                };
                System.out.println("--- tones Submenu ---");
                for (String item : tones) System.out.println(item);
                break;
              case 6:
                 String[] settings = {
                    "1. Ringing Tone",
                    "2. Phone settings",
                    "3. Security settings",
                    "4. Restore factory settings",
                    
                };
                System.out.println("--- settings Submenu ---");
                for (String item : settings ) System.out.println(item);
                break;
            
             case 7:
                 String[] calldivert = {
                  };
                System.out.println("--- calldivert ---");
                for (String item : calldivert) System.out.println(item);
                break;   

             case 8:
                  String[] games = {
                  };
                System.out.println("--- games ---");
                for (String item : games ) System.out.println(item);
                break;   
            
            case 9:
                String[] calculator = {
                  };
                System.out.println("--- calculator ---");
                for (String item : calculator ) System.out.println(item);
                break;

             case 10:
                  String[] reminders = {
                  };
                System.out.println("---reminders---");
                for (String item : reminders ) System.out.println(item);
                break;

              case 11:
                String[] clock = {
                    "1. Alarm clock",
                    "2. Clock settings",
                    "3. Date setting",
                    "4. Stop watch",
                    "5. Countdown timer",
                    "6. Auto update of date and time",
                   
                };
                System.out.println("--- clock---");
                for (String item : clock) System.out.println(item);
                break;


              case 12:
                  String[] profiles = {
                  };
                System.out.println("--- profiles---");
                for (String item : profiles ) System.out.println(item);
                break;   

              case 13:
                  String[] simservice = {
                  };
                System.out.println("--- simservice ---");
                for (String item : simservice) System.out.println(item);
                break; 
        
            default:
                System.out.println("Invalid menu number. Please choose between 1 and 13.");
        }
    }
}