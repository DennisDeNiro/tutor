package lesson_36;

public class USD extends Money {
    public USD(int getAmount) {
        super(getAmount);
    }

    @Override
    int getAmount() {
        return super.getAmount();
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
