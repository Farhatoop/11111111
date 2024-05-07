public class ContactList {
    private String name;
    private int numberOfContacts=20;
    private Contact contactsArray[];
    public int c=0;

    public ContactList(String name){
    this.name=name;
    }
    public void addContact(Contact contact){
        contactsArray[c] =contact;
        c++;
    }
    public String getContactsInformation(){
        for (int i=0;i<=c;i++)
            return contactsArray[i].toString();

        return null;
    }
    public void searchName(String fullName){
        for(int i=0;i<=c;i++)
        {
            if(contactsArray[i].getFullName()==fullName){
                contactsArray[i].toString();
            }
        }
    }
    public void searchPhoneNumber(String phoneNumber){
        for(int i=0;i<=c;i++)
        {
            if(contactsArray[i].getPhoneNumber()==phoneNumber){
                contactsArray[i].toString();
            }
        }
    }
    public int countFamilyContacts(){
        return c;
    }
}
