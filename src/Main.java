public class

Main
{
    public static void main(String[] args)
    {
        double itemCost = 150.00;
        double SHIPPING_RATE = 0.02;
        int SHIPPING_CUTOFF = 100;
        double totalPrice = 0;
        double shippingCost = 0.00;

        if(itemCost <= SHIPPING_CUTOFF)
        {
            shippingCost = itemCost * SHIPPING_RATE;
            totalPrice = itemCost + shippingCost;
            System.out.println("The cost of shipping is $" + shippingCost);
            System.out.println("The total cost of your purchase is $" + totalPrice);
        }
        else
        {
            System.out.println("Your Shipping is Free!");
            System.out.println("The total cost of your purchase is $" + itemCost);
        }
    }
}