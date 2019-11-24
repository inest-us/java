package us.inest.mock.example;

import java.util.List;

public interface AccountService {
    public Account createNewAccount(Account account);

    public Account updateAccount(Account account);

    public Boolean removeAccount(Account account);

    public List<Transaction> listAllTransactions(Account account);
}
