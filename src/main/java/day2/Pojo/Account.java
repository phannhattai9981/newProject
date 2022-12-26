package day2.Pojo;

import java.util.Date;

public class Account {
    private long id;
    private String owenerName;
    private  double balance;
    private Date accessTime;
    private  boolean locker;

    public long getId() {
        return id;
    }

    public String getOwenerName() {
        return owenerName;
    }

    public double getBalance() {
        return balance;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public boolean isLocker() {
        return locker;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOwenerName(String owenerName) {
        this.owenerName = owenerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }

    public void setLocker(boolean locker) {
        this.locker = locker;
    }

}
