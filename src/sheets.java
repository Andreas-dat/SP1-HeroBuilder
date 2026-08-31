public class sheets {

    static void hero() {
        int i;
        String name = "Ragnar";
        int currentHP = 80;
        int maxHP = 100;
        int level = 5;
        int exp = 2300;
        double gold = 156.50;
        boolean isAlive = true;
        char type = 'w';
        String inventory[] = {"Vlads", "Blink dagger", "power threads"};

        System.out.println("========= CHARECTER SHEET ==========");
        System.out.println("Name: " + name);
        System.out.println("Class " + type);
        System.out.println("Healh: " + currentHP + "/" + maxHP);
        System.out.println("XP: " + exp);
        System.out.println("Gold: " + gold);
        System.out.println("Alive: " + isAlive);
        System.out.println("Inventory: \n" + "-" + inventory[0] + "\n-" + inventory[1] + "\n-" + inventory[2]);

    }
    static void rival() {
        String name = "Ame";
        int currentHP = 80;
        int maxHP = 100;
        int level = 5;
        int exp = 2300;
        double gold = 156.50;
        boolean isAlive = true;
        char type = 'w';
        String inventory[] = {"Vlads", "Blink dagger", "power threads"};

        System.out.println("========= CHARECTER SHEET ==========");
        System.out.println("Name: " + name);
        System.out.println("Class " + type);
        System.out.println("Healh: " + currentHP + "/" + maxHP);
        System.out.println("XP: " + exp);
        System.out.println("Gold: " + gold);
        System.out.println("Alive: " + isAlive);
        System.out.println("Inventory: \n" + "-" + inventory[0] + "\n-" + inventory[1] + "\n-" + inventory[2]);

    }
}
