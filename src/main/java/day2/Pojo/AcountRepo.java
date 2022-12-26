package day2.Pojo;

public interface AcountRepo {
    void insert (Account account);
    void update (Account account);
    Account find (long accountID);
}
