public class HeroApplication {

    public static void main(String[] args) {

        // Variable initialization
        String heroName;
        String heroCity;

        String heroPower1, heroPower2, heroPower3;

        boolean isEvil;

        double heroSalary;
        String realName;

        String universe;

        // Variable assignment
        heroName = "STAR";
        heroCity = "Ukhta";
        heroPower1 = "Super smile";
        heroPower2 = "Super fast thinking";
        heroPower3 = "";
        isEvil = false;
        heroSalary = 100.00;
        realName = "Oxana";
        universe = "Earth universe";

        // Print out Hero information card
        System.out.println("****************************");
        System.out.println("***** HERO INFORMATION *****");
        System.out.println("****************************");

        System.out.println("Hero name: " + heroName);
        System.out.println("This hero was born in " + heroCity + ".");

        System.out.println("-----------------------------");
        System.out.println("Hero Superpowers: ");
        System.out.println("---" + heroPower1);
        System.out.println("---" + heroPower2);
        System.out.println("---" + heroPower3);

        System.out.println("Is this SuperHero evil? " + isEvil);

        System.out.println("This hero earns: " + heroSalary + " EUR per week.");
        System.out.println(realName + " hides her identity.");
        System.out.println("Hero lives in " + universe + ".");

        System.out.println("****************************");
        System.out.println("***** HERO INFORMATION *****");
        System.out.println("****************************");
    }
}
