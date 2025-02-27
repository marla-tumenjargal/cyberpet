import java.util.Scanner;

/**
 * Main app :D
 */
public class CyberPetApp {
    private static Scanner in = new Scanner(System.in);
    private static PetManager petManager = new PetManager();

    /**
     * The main method
     *
     * @param args
     */
    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    printAddPetMenu();
                    break;
                case 2:
                    System.out.print("Enter the pet index to feed: ");
                    int feedIndex = in.nextInt();
                    in.nextLine(); // Consume newline
                    System.out.println("\n" + petManager.feedPet(feedIndex) + "\n");
                    break;
                case 3:
                    playToy();
                    break;
                case 4:
                    System.out.println("\n" + petManager.listPets());
                    break;
                case 5:
                    System.out.println("\n" + petManager.triggerUniqueBehavior());
                    break;
                case 6:
                    running = false;
                    System.out.println("\nExiting Cyber Pet System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        in.close();
    }

    /**
     * Prints the main menu options.
     */
    private static void printMenu() {
        System.out.println("----- CYBER PET MENU -----");
        System.out.println("1) Add a Pet");
        System.out.println("2) Feed a Pet");
        System.out.println("3) Play with a Pet");
        System.out.println("4) List Pets");
        System.out.println("5) Trigger Unique Behaviors");
        System.out.println("6) Exit");
        System.out.println("--------------------------");
        System.out.print("Enter choice: ");
    }

    /**
     * Prints the menu for adding a pet and handles the selection.
     */
    private static void printAddPetMenu() {
        System.out.println("\nPet Types:");
        System.out.println(" 1) DragonPet");
        System.out.println(" 2) SlimePet");
        System.out.println(" 3) AstralKitten");
        System.out.print("Select pet type (1-3): ");

        int petType = in.nextInt();
        in.nextLine(); // Consume newline

        switch (petType) {
            case 1:
                addDragon();
                break;
            case 2:
                addSlime();
                break;
            case 3:
                addAstralKitten();
                break;
            default:
                System.out.println("Invalid pet type selection.");
        }
    }

    /**
     * Adds a dragon pet to the pet manager.
     */
    private static void addDragon() {
        System.out.print("Enter pet name for DragonPet: ");
        String name = in.nextLine();

        DragonPet dragon = new DragonPet(name);
        System.out.println(petManager.addPet(dragon) + "\n");
    }

    /**
     * Adds a slime pet to the pet manager.
     */
    private static void addSlime() {
        System.out.print("Enter color for SlimePet: ");
        String color = in.nextLine();

        SlimePet slime = new SlimePet(color);
        System.out.println(petManager.addPet(slime) + "\n");
    }

    /**
     * Adds an astral kitten pet to the pet manager.
     */
    private static void addAstralKitten() {
        AstralKitten kitten = new AstralKitten("Low", 1);
        System.out.println("AstralKitten added!\n");
        petManager.addPet(kitten);
    }

    /**
     * Handles playing with a pet using a specified toy.
     */
    private static void playToy() {
        System.out.print("Enter the pet index to play with: ");
        int playIndex = in.nextInt();
        in.nextLine(); // Consume newline

        System.out.print("Enter toy name: ");
        String toy = in.nextLine();

        System.out.println("\n" + petManager.playPet(playIndex, toy) + "\n");
    }
}
