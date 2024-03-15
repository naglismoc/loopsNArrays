public class Main {
    public static void main(String[] args) {
        //         012345
    String name = "Naglisaaa";
        System.out.println(name.contains("a"));
        System.out.println(name.contains("h"));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(5));
        System.out.println(name.length());
        System.out.println(name.repeat(10));
        System.out.println(name.equals("naglis"));
        System.out.println(name.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,5));
        System.out.println(name.replace("a","i"));
        System.out.println(name.replaceFirst("a","i"));
        System.out.println(name.replace("a","O").replace("i","U"));

        String episode = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(episode);


    }
}