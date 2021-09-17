import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton","613");
        AddressBook buddies = new AddressBook();
        buddies.addBuddy(buddy);
        buddies.removeBuddy(buddy);
    }
}
