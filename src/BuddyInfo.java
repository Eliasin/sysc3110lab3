public class BuddyInfo {

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        // RFC 3966 permits the usage of the * and # characters in local phone numbers
        this("Joe", "18 Nondescript Way", "111111*11111");
    }

    private String name;
    private String address;
    private String phoneNumber;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("David", "98 Somewhere Drive", "8792134");

        // Sample
        System.out.println("Hello " + buddy.getName());
    }
}
