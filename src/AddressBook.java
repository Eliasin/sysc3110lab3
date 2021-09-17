import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        this.buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.buddies.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
