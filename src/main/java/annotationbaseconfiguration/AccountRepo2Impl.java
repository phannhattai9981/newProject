package annotationbaseconfiguration;

import day2.Pojo.Account;
import day2.Pojo.AcountRepo;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountRepo2Impl implements AcountRepo {
    private Map<Long, Account> accountMap;

    @PostConstruct
    public void initData() {
        accountMap = new HashMap<>();
        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwenerName("tai");
        account1.setBalance(10.0);

        Account account2 = new Account();
        account2.setId(2L);
        account2.setOwenerName("phung");
        account2.setBalance(2.0);

        accountMap.put(account1.getId(), account1);
        accountMap.put(account2.getId(), account2);
    }


    @Override
    public void insert(Account account) {
        accountMap.put(account.getId(), account);

    }

    @Override
    public void update(Account account) {
        accountMap.put(account.getId(), account);

    }

    @Override
    public Account find(long accountID) {
        return accountMap.get(accountID);
    }
}
