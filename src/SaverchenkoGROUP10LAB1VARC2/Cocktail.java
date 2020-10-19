package SaverchenkoGROUP10LAB1VARC2;

public class Cocktail extends Food{

    private String fruit=null;
    private String drink=null;
    private Double calories=null;

    public Cocktail(String fruit,String drink)
    {
        super("Коктейль");
        this.fruit=fruit;
        this.drink=drink;
    }

    public void consume()
    {
        System.out.println(this + " выпит");
    }

    public double calculateCalories()
    {
        if (drink.equals("молочный") && fruit.equals("бананом"))
            calories=27.50;
        else if (drink.equals("шоколадный") && fruit.equals("клубникой"))
            calories = 36.50;
        else if (drink.equals("виноградный") && fruit.equals("киви"))
            calories = 29.50;
        return calories;
    }

    public String toString()
    {
        return super.toString() + " " + this.drink + " с " +this.fruit;
    }

    public boolean equals(Object obj) {
        if (super.equals(obj))
        {
            if (!(obj instanceof Cocktail)) return false;
            return (drink.equals(((Cocktail)obj).drink) && fruit.equals(((Cocktail)obj).fruit));
        } else return false;
    }

    public String getFruit()
    {
        return fruit;
    }

    public String getDrink()
    {
        return drink;
    }

    public void setFruit(String fruit)
    {
        this.fruit=fruit;
    }

    public void setDrink(String drink)
    {
        this.drink=drink;
    }

}
