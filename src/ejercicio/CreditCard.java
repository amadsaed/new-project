package ejercicio;

public class CreditCard implements Payment{

    @Override
    public int pay(int amount) {
        return amount;
    }

}