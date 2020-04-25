package S.Correct;

public class RoleDAO {
    // we will use the function here in order to get the role needed, keeping the class Role.java to one responsibility
    public Role getRoleByID(){
        Role roleGetById = new Role();
        return roleGetById;
    }

}
