package D.FurtherCorrection;

import java.util.ArrayList;
import java.util.List;


public class UserDaoImpl implements UserDao {
    List<User> userList = new ArrayList<User>();
    public UserDaoImpl(){};

    @Override
    public void update(User user) {
    }
    @Override
    public User findById(int id){
        return null;
    }
}
