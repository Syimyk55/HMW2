public class Iphone extends Telefon{
    private int price;
    private ColorEnum colorEnum;

    public Iphone(String name, int udopstva, int price, ColorEnum colorEnum) {
        super(name, udopstva);
        this.price = price;
        this.colorEnum = colorEnum;
    }

    public int getPrice() {
        return price;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public  void print() {
      System.out.println("_________________");
        System.out.println( getName() + "\nСтоимость: " + price+
                "\nСвет:"+colorEnum);
    }
}
