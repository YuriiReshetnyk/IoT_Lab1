package ua.lviv;

public class Main {
    public static void main(String[] args) {
        Footwear footwear1 = new Footwear();
        Footwear footwear2 = new Footwear("Addidas", 1200, 48);
        Footwear footwear3 = new Footwear("Ecco", 800, 45, "Blue", "Pigskin", 2022);
        System.out.println("Footwear1:");
        System.out.println(footwear1);
        System.out.println("\nFoorwear2:");
        System.out.println(footwear2);
        System.out.println("\nFootwear3:");
        System.out.println(footwear3);
        System.out.println("\n" + Footwear.getStaticFeild());
    }
}
