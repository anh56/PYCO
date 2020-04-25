package I.Incorrect;

public interface MainRepo {
    // imagine that we have an data transfer object that have the following methods
    // then it is normal for other class to implement this interface to build their DTO
    public  Object getObjectByID();
    public  Object getObjectByName();
    //unless there is a case where secret code is not available
    public  Object getObjectBySecretCode();

}
