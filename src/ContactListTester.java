import java.util.Scanner;
public class ContactListTester {
    public static void main(String[] args){
        ContactList cl1=new ContactList("Ali");
        Contact c1 = new Contact();
        cl1.addContact(c1);



        ContactList cl2=new ContactList("Ali");
        Contact c2 = new Contact();
        cl1.addContact(c1);



        ContactList cl3=new ContactList("Ali");
        Contact c3 = new Contact();
        cl3.addContact(c3);



        ContactList cl4=new ContactList("Ali");
        Contact c4 = new Contact();
        cl4.addContact(c4);

        cl1.getContactsInformation();
        cl2.getContactsInformation();
        cl3.getContactsInformation();
        cl4.getContactsInformation();
        cl1.searchName("Ali");
        cl2.searchPhoneNumber("76823929");
        System.out.println(cl1.c);



    }
}
