public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String jobTitle;

    private String password;
    private int id;

    public Person(String firstName, String lastName, String email, String jobTitle, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.jobTitle = jobTitle;
        this.id = id;
        this.password = password;
    }


    //first name
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    //last name
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    //last name
    public void setEmail(String newEmail) {
        this.lastName = newEmail;
    }

    public String getEmail() {
        return this.email;
    }

    //job title
    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String newJobTitle) {
        this.jobTitle = newJobTitle;
    }

    //password needs hashing
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
        this.password = this.password;
    }

    //ID
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void viewPastTickets() {
        //hits DB api and gets the records
    }

    public void reEmbersmentRequest() {
        // hits the Api
    }


}