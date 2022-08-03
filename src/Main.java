public class Main {

    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(5);
        System.out.println("magicBox.add(\"first\") : " + magicBox.add("first"));
        System.out.println("magicBox.add(\"second\"): " + magicBox.add("second"));
        testPickBox(magicBox);
        System.out.println("magicBox.add(\"third\") : " + magicBox.add("third"));
        testPickBox(magicBox);
        System.out.println("magicBox.add(\"fourth\"): " + magicBox.add("fourth"));
        testPickBox(magicBox);
        System.out.println("magicBox.add(\"fifth\"): " + magicBox.add("fifth"));
        testPickBox(magicBox);
        System.out.println("magicBox.add(\"sixth\"): " + magicBox.add("sixth"));
        testPickBox(magicBox);
        testPickBox(magicBox);
        testPickBox(magicBox);
        testPickBox(magicBox);
        testPickBox(magicBox);
    }

    public static <T> void testPickBox(MagicBox<T> magicBox) {
        try {
            System.out.println("magicBox.pick(): " + magicBox.pick());
        } catch (RuntimeException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
