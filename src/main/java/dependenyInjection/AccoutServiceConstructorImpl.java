package dependenyInjection;

import day2.Pojo.Account;
import day2.Pojo.AcountRepo;
import day2.Pojo.AcountService;
import org.springframework.beans.factory.annotation.Autowired;

public class AccoutServiceConstructorImpl implements AcountService {

    private AcountRepo acountRepo;

    public AccoutServiceConstructorImpl(AcountRepo acountRepo) {
        this.acountRepo = acountRepo;
    }

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {
        Account sourceAcount = acountRepo.find(fromAccountId);
        Account targetAcount = acountRepo.find(toAccountId);
        sourceAcount.setBalance(sourceAcount.getBalance() - amount);
        sourceAcount.setBalance(targetAcount.getBalance() + amount);
        acountRepo.update(sourceAcount);
        acountRepo.update(targetAcount);

    }

    @Override
    public void depositMoney(long accountID, double amount) throws Exception {
        Account account = acountRepo.find(accountID);
        account.setBalance(account.getBalance() + amount);
        acountRepo.update(account);

    }

    @Override
    public Account getAccount(long accountID) {
        return acountRepo.find(accountID);
    }
}
