import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            this.buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < this.buddies.size()) {
            return this.buddies.remove(index);
        }

        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Jim", "Mimsy", "6138888888");

        // Another sample change, but this time, on a branch!!
        AddressBook myAddressBook = new AddressBook();
        myAddressBook.addBuddy(buddyInfo);
        BuddyInfo jim = myAddressBook.removeBuddy(0);
    }
}
