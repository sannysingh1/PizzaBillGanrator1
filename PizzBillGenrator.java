class Pizza
{
private int price;
private Boolean veg;
private int extraCheesePrice=100;
private int extraToppingPrice=150;
private int backpackPrice=20;
private int basePizzaPrice;
private boolean isExtraCheeseAdded=false;
private boolean isExtraToppingsAdded=false;
private boolean isOptedForTakeAway=false;


public Pizza(Boolean veg)
{
this.veg=veg;
if(this.veg)
{
this.price=300;
}
else
{
this.price=400;
}
basePizzaPrice=this.price;
}

public void addExtraCheese()
{
isExtraCheeseAdded=true;
this.price+=extraCheesePrice;
}

public void addExtraTopping()
{
isExtraToppingsAdded=true;
this.price+=extraToppingPrice;
}

public void takeAway()
{
isOptedForTakeAway=true;
this.price+=backpackPrice;
}

public void getBill()
{
String bill="";
System.out.println("Pizza:"+basePizzaPrice);
if(isExtraCheeseAdded)
{
bill+="Extra cheese added:"+extraCheesePrice+"\n";
}
if(isExtraToppingsAdded)
{
bill+="Extra Topping added:"+extraToppingPrice+"\n";
}
if(isOptedForTakeAway)
{
bill+="Extra cheese added:"+backpackPrice+"\n";
}
bill+="Bill:"+this.price+"\n";
System.out.println(bill);
}
}
class DeluxPizza extends Pizza
{
public DeluxPizza(Boolean veg)
{
super(veg);
super.addExtraCheese();
super.addExtraTopping();
}
}
public class PizzBillGenrator {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(true);
        basePizza.addExtraCheese();
        basePizza.addExtraTopping();
        basePizza.takeAway();
        basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(true);
        dp.getBill();
    }
}
