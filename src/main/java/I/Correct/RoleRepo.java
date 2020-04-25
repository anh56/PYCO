package I.Correct;


// the IDataTransferObject works perfectly fine for this
public interface RoleRepo {
    public Object getObjectByID();

    public Object getObjectByName();

    // only role dto is allowed to implement get secret code function
    public Object getObjectBySecretCode();
}
