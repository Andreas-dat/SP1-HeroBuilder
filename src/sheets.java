import java.util.Scanner;
public class sheets {
     Scanner input = new Scanner(System.in);
     public HeroData hero() { // NOT VOID, since i want to return the data to HeroData
         HeroData d = new HeroData(); //D is the name of the variabel and the
         System.out.println("What is the hero name?");
         d.name = input.nextLine();

         System.out.println("What is " + d.name + " current hp? [1 - 100] (HAS TO BE AN INT)");
        int currentHP = input.nextInt();
        int maxHP = 100;

         System.out.println("What is " + d.name + " level (HAS TO BE An INT)");
        d.level = input.nextInt();

         System.out.println("What is " + d.name + " current exp? (HAS TO BE AN INT)");
        d.exp = input.nextInt();

         System.out.println("How much gold does " + d.name +  " currently have? (HAS TO BE A DOUBLE)");
        d.gold =input.nextDouble();

        d.isAlive = true;
        input.nextLine();
         System.out.println("What type is " + d.name + " [W] [M] [R]");
        String type = input.nextLine();
        String inventory[] = {"Vlads", "Blink dagger", "power threads"};

        System.out.println("========= CHARECTER SHEET ==========");
        System.out.println("Name: " + d.name);
        System.out.println("Class " + d.type);
        System.out.println("Healh: " + currentHP + "/" + maxHP);
        System.out.println("XP: " + d.exp);
        System.out.println("Gold: " + d.gold);
        System.out.println("Alive: " + d.isAlive);
        System.out.println("Inventory: \n" + "-" + inventory[0] + "\n-" + inventory[1] + "\n-" + inventory[2]);

         return d; // Makes it so that when i come back to
     }
     void rival() {
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
