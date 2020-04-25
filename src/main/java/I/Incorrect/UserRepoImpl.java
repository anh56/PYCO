package I.Incorrect;

public class UserRepoImpl implements MainRepo {
    // we have a userDataTransferObject that implement such methods
    @Override
    public Object getObjectByID() {
        return null;
    }

    @Override
    public Object getObjectByName() {
        return null;
    }


    // if the class User did not have the SecretCode property, then this method is unnecessary
    // this is a violation of Interface Integration principle
    @Override
    public Object getObjectBySecretCode() {
        return null;
    }
}
