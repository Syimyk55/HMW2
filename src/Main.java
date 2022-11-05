public class Main {
    public static void main(String[] args) {
        createObjecct("Samsung").print();
        createObjecct("Redmi").print();
        createObjecct("Iphone").print();
    }

    public static Printable createObjecct(String className) {
        Printable printable = null;
        switch (className) {
            case "Samsung":
                Samsung samsung = new Samsung("Самсунг", 90,
                        50, ColorEnum.BLUE);
                return samsung;
            case "Redmi":
                Redmi redmi = new Redmi("Ми", 99, 2021,
                        125, ColorEnum.RED);
                return redmi;
            case "Iphone":
                Iphone iphone = new Iphone("АйфонXR", 88,
                        35, ColorEnum.GREEN);
                return iphone;
        }
        return printable;
    }
}