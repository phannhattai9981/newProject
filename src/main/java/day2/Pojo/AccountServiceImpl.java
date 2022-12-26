package day2.Pojo;

public class AccountServiceImpl implements  AcountService{
    private  AcountRepo acountRepo;

    public void setAcountRepo(AcountRepo acountRepo) {
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
