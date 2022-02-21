public class User {

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String ip_address;
    private int phone_number;

    public User(int id, String first_name, String last_name, String email, String gender, String ip_address, int phone_number) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.ip_address = ip_address;
        this.phone_number = phone_number;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void printUser(){
        System.out.println();
        System.out.println("ID :            " + getId());
        System.out.println("First Name :    " + getFirst_name());
        System.out.println("Last Name :     " + getLast_name());
        System.out.println("Email :         " + getEmail());
        System.out.println("Gender :        " + getGender());
        System.out.println("IP Address :    " + getIp_address());
        System.out.println("Phone Number :  " + getPhone_number());
    }

}
