import java.util.ArrayList;

public class AddressBook {
    //I am making changes to my code
    private ArrayList<BuddyInfo> buddies = new ArrayList<>();
    
    public AddressBook(){
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy){
        if (buddy != null) {
            buddies.remove(buddy);
        }
    }
    //I am making changes to my code on Git
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton","613");
        AddressBook buddies = new AddressBook();
        buddies.addBuddy(buddy);
        buddies.removeBuddy(buddy);
    }
}
