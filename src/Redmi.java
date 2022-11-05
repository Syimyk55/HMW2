public class Redmi extends Telefon{
    private  int release;
    private  int volume;
    private ColorEnum colorEnum;

    public Redmi(String name, int udopstva, int release, int volume, ColorEnum colorEnum) {
        super(name, udopstva);
        this.release = release;
        this.volume = volume;
        this.colorEnum = colorEnum;
    }

    public int getRelease() {
        return release;
    }

    public int getVolume() {
        return volume;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public void print(){
        System.out.println("_____________");
        System.out.println(getName() + "\nВыпуск:" + release +
                "\nОбьемПамяти:" + volume +
                "\nСвет:" + colorEnum );
    }
}
