package SaverchenkoGROUP10LAB1VARC2;

public class Cheese extends Food {

    private int calories = 70;

    public Cheese()
    {
        super("Сыр");
    }

    public void consume()
    {
        System.out.print(this+" съеден");
    }

    public int calculateCalories()
    {
        return calories;
    }
}
