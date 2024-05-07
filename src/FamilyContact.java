public class FamilyContact extends Contact{
    private String relation;
    private String birthday;
    public FamilyContact(){super();}
    public FamilyContact(int contactId,String fullName,String phoneNumber,String email,String relation,String birthday){
        super(contactId,fullName,phoneNumber,email);
        this.relation=relation;
        this.birthday=birthday;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public void printInfo(){
        System.out.println("Name: "+getFullName()+" Phone Number: "+getPhoneNumber()+" Email: "+getEmail()+" Relation: "+relation+" BIrthdaY: "+birthday);
    }
    @Override
    public String toString() {
        return "Name: "+getFullName()+" Phone Number: "+getPhoneNumber()+" Email: "+getEmail()+" Relation: "+relation+" BIrthdaY: "+birthday;
    }
}
