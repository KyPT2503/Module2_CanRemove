import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    public static final String NO_CARD_NUMBER_AVAILABLE = "No card number available.";
    private static Map<String, Integer> priceEachRoom = new HashMap<String, Integer>();

    static {
        priceEachRoom.put("small", 1000);
        priceEachRoom.put("normal", 2000);
        priceEachRoom.put("luxury", 3000);
    }


    List<Customer> customers;

    public Hotel() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public Customer getCustomerByCardNumber(String cardNumber) {
        for (Customer customer : customers) {
            if (customer.getCardNumber().equals(cardNumber)) return customer;
        }
        throw new UnsupportedOperationException(NO_CARD_NUMBER_AVAILABLE);
    }

    public void removeCustomer(String cardNumber) {
        this.customers.remove(getCustomerByCardNumber(cardNumber));
    }

    public int getBill(String cardNumber) {
        Customer customer = getCustomerByCardNumber(cardNumber);
        int dayCount = customer.getDayCount();
        int price = priceEachRoom.get(customer.getKindOfRoom());
        return dayCount * price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "customers=" + customers +
                '}' + '\n';
    }
}
