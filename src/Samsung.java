public class Samsung extends Telefon {
    private int model;
    private ColorEnum colorEnum;

    public Samsung(String name, int udopstva, int model, ColorEnum colorEnum) {
        super(name, udopstva);
        this.model = model;
        this.colorEnum = colorEnum;
    }

    public int getModel() {
        return model;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public void print() {
            System.out.println("_____________");
            System.out.println( getName() + "\nMодель:" + model +
                    "\nСвет:" + colorEnum);
        }
    }

