public class Person {
    protected String name;
    protected int[] birthday;
    protected String cardNumber;

    public Person() {
    }

    public Person(String name, int[] birthday, String cardNumber) {
        this.name = name;
        this.birthday = birthday;
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public int[] getBirthday() {
        return birthday;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
