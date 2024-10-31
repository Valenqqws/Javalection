import java.util.ArrayList;
import java.util.concurrent.Callable;

public class InMemoryContacts {

    private ArrayList<Contact> contacts = new ArrayList();

    public static ArrayList<Contact> allGetContacts() {

        return null;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.add(contact);
    }

    public void ShowAllContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            System.out.println(contact.getName() + " " + contact.getPhoneNumber());


        }

    }

    public void showAllContacts() {
    }

    public Contact findContactByName(String contactName) {
        return null;
    }
}





