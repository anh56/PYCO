package D.FurtherCorrection;

public class UserServiceImpl implements UserService {
    UserDao _userDao;

    public UserServiceImpl(UserDao userDao){
        _userDao = userDao;
    }

    @Override
    public void transferMoney() {
    }

    @Override
    public User getById(int id) {
        return null;
    }
}
