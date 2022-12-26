package day2.Pojo;

public interface AcountService {
    void transferMoney (long fromAccountId, long toAccountId, double amount );
    void depositMoney (long accountID, double amount) throws Exception;
    Account getAccount(long accountID);
}
