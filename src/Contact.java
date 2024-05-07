public class Contact {
    private int contactId;
    private String fullName;
    private String phoneNumber;
    private String email;

    public Contact(){}
    public Contact(int contactId,String fullName,String phoneNumber,String email){
        this.contactId=contactId;
        this.fullName=fullName;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

                this.email=email;
        }


    public void setContactId(int contactId){
        this.contactId=contactId;
    }

    public int getContactId() {
        return contactId;
    }
    public void printInfo(){
        System.out.println("Name: "+fullName+" Phone Number: "+phoneNumber+" Email: "+email);
    }

    @Override
    public String toString() {
       return "Name: "+fullName+" Phone Number: "+phoneNumber+" Email: "+email;
    }
}
