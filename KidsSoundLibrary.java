
import java.util.Scanner;

public class KidsSoundLibrary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("     KIDS SOUND LIBRARY");
            System.out.println("================================");
            System.out.println("1. Animal Sounds");
            System.out.println("2. Musical Sounds");
            System.out.println("3. Vehicle Sounds");
            System.out.println("4. Nature Sounds");
            System.out.println("5. Household Sounds");
            System.out.println("0. Exit");
            System.out.print("Choose a category: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Enter a valid number: ");
                scanner.next();
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showSounds("Animal Sounds",
                            "1. Cow - Moo Moo",
                            "2. Dog - Woof Woof",
                            "3. Cat - Meow Meow",
                            "4. Sheep - Baa Baa",
                            "5. Lion - Roar");
                    break;

                case 2:
                    showSounds("Musical Sounds",
                            "1. Piano - Ding Ding",
                            "2. Drum - Boom Boom",
                            "3. Bell - Ting Ting",
                            "4. Guitar - Strum Strum",
                            "5. Flute - Toot Toot");
                    break;

                case 3:
                    showSounds("Vehicle Sounds",
                            "1. Car - Beep Beep",
                            "2. Train - Choo Choo",
                            "3. Ambulance - Nee Naw",
                            "4. Airplane - Whoosh",
                            "5. Motorcycle - Vroom");
                    break;

                case 4:
                    showSounds("Nature Sounds",
                            "1. Rain - Pitter Patter",
                            "2. Thunder - Rumble",
                            "3. Wind - Whoosh",
                            "4. Bird - Chirp Chirp",
                            "5. Ocean - Splash");
                    break;

                case 5:
                    showSounds("Household Sounds",
                            "1. Doorbell - Ding Dong",
                            "2. Telephone - Ring Ring",
                            "3. Clock - Tick Tock",
                            "4. Vacuum - Bzzz",
                            "5. Water Tap - Drip Drip");
                    break;

                case 0:
                    System.out.println("Goodbye! Keep learning!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }

        } while (choice != 0);

        scanner.close();
    }

    static void showSounds(String category, String... sounds) {
        System.out.println("\n--- " + category + " ---");

        for (String sound : sounds) {
            System.out.println(sound);
        }

        System.out.println("These are sound descriptions.");
        System.out.println("Actual audio playback requires sound files.");
    }
}
