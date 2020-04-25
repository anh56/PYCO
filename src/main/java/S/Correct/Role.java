package S.Correct;

public class Role  {
    private String name;
    private String description;
    private String secretCode;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Role(){}


    /* this method is not needed inside of a model Class since this is not the aim of the class
    public Role getRoleById(){
        // connect to DB
        Role role = new Role();
        // provide info
        return role;
    }
     instead we will use a data access object to get the needed role with the condition and return it*/
}
