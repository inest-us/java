package us.inest.app.mockito;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
	public Account createNewAccount(Account account) {
		// Dummy Dao! Database insert here.
		// accountDao.insert(account);
		// Ultimately return the account with the modification.
		return account;
	}

	public Account updateAccount(Account account) {
		// Dummy Dao! Database insert here.
		// accountDao.update(account);
		// Ultimately return the account with the modification.
		account.setName("Alvin Reyes: New Name");
		return account;
	}

	public boolean removeAccount(Account account) {
		// Dummy Dao! Database insert here.
		// accountDao.delete(account);
		// Ultimately return the account with the modification.
		// if exception occurs, return false.
		return true;
	}

	public List<Transaction> listAllTransactions(Account account) {
		// accountDao.loadAllTransactions(account);
		List<Transaction> listOfAllTransactions = new ArrayList<>();
		listOfAllTransactions.add(new Transaction());
		listOfAllTransactions.add(new Transaction());
		listOfAllTransactions.add(new Transaction());

		account.setTransactions(listOfAllTransactions);
		return listOfAllTransactions;
	}
}
