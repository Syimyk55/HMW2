public class Telefon implements Printable {
    private String name;
    private int udopstva;

    public Telefon(String name, int udopstva) {
        this.name = name;
        this.udopstva = udopstva;
    }

    public String getName() {
        return name;
    }

    public int getUdopstva() {
        return udopstva;
    }

    @Override
    public void print() {
        System.out.println("_________");
        System.out.println("Имя\nНазвание:"+ name +
                 "\nУдобность:"+ udopstva);
    }
}
