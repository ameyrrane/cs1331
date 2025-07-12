public class GamePlay {
    public static void main(String[] args) {
        BlueAstronaut bob = new BlueAstronaut("Bob", 20, 6, 30);
        BlueAstronaut heath = new BlueAstronaut("Heath", 30, 3, 21);
        BlueAstronaut albert = new BlueAstronaut("Albert", 44, 2, 0);
        BlueAstronaut angel = new BlueAstronaut("Angel", 0, 1, 0);
        RedAstronaut liam = new RedAstronaut("Liam", 19, "experienced");
        RedAstronaut suspicousPerson = new RedAstronaut("Suspicious Person", 100, "expert");

        System.out.println("Liam sabotages Bob.");
        liam.sabotage(bob);
        System.out.println();
        System.out.println(bob);
        System.out.println();
        
        // System.out.println("Liam freezes suspicious person!");
        // liam.freeze(suspicousPerson);
        // System.out.println(suspicousPerson);
        // System.out.println();
        // System.out.println(liam);
        // System.out.println();

        // System.out.println("Liam tries to freeze Albert.");
        liam.freeze(albert);
        // System.out.println(liam);
        // System.out.println();
        // System.out.println(albert);
        System.out.println();

        // System.out.println("Printing all players");
        // printPlayers();
        // System.out.println("Albert calls Emergency Meeting!");
        // albert.emergencyMeeting();
        // System.out.println();
        // System.out.println("Printing all players");
        // printPlayers();

        System.out.println("Suspisious person calls Emergency Meeting!");
        suspicousPerson.emergencyMeeting();

        // // System.out.println();
        // System.out.println("Printing all players");
        // printPlayers();

        System.out.println();
        System.out.println("Bob calls emergency meeting!");
        bob.emergencyMeeting();
        // System.out.println();
        // System.out.println("Printing all players");
        // printPlayers();
        System.out.println();
        System.out.println("Heath completes tasks");
        heath.completeTask();
        System.out.println(heath);

        System.out.println();
        System.out.println("Heath completes tasks");
        heath.completeTask();
        System.out.println(heath);

        System.out.println();
        liam.freeze(angel);
        System.out.println("liam freezes angel");
        System.out.println();
        System.out.println(angel);
        System.out.println();
        System.out.println(liam);

        System.out.println("liam sabotages bob twice!");
        liam.sabotage(bob);
        System.out.println(bob);
        liam.sabotage(bob);

        System.out.println(bob);
        liam.freeze(bob);
        System.out.println(bob);

        // angel.emergencyMeeting();
        // System.out.println(liam);

        for (int i = 0; i < 5; i++) {
            liam.sabotage(heath);
            System.out.println();
            System.out.println(heath);
        }

        liam.freeze(heath);
        System.out.println();
        System.out.println(heath);

    }

    public static void printPlayers() {
        for (Player player : Player.getPlayers()) {
            System.out.println(player);
        }
    }
}
