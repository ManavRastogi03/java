package Java.OopsinJAVA;

public class StringMethods {
    public static void main(String[] args) {
        String name="Hii Welcome to Wizard";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String a="    Manav";
        System.out.println(a.trim());
        System.out.println(a.substring(2));
        System.out.println(a.replace('a','b'));
        System.out.println(a.startsWith("Har"));
        System.out.println(a.endsWith("anv"));
        System.out.println(a.charAt(0));
    }
}
