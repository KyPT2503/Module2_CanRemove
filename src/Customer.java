import java.util.Arrays;
import java.util.Map;

public class Customer extends Person {
    private int dayCount;
    private String kindOfRoom;

    public Customer(String name, int[] birthday, String cardNumber, int dayCount, String kindOfRoom) {
        super(name, birthday, cardNumber);
        this.dayCount = dayCount;
        this.kindOfRoom = kindOfRoom;
    }

    public int getDayCount() {
        return dayCount;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "dayCount=" + dayCount +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + Arrays.toString(birthday) +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
