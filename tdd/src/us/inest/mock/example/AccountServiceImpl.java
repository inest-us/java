package us.inest.mock.example;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
	public Account createNewAccount(Account account) {
		// accountDao.insert(account);
		// Ultimately return the account with the modification.
		return account;
	}
	
	public Account updateAccount(Account account) {
		// accountDao.update(account);
		// Ultimately return the account with the modification.
		account.setName("Alvin Reyes: New Name");
		return account;
	}
	
	public Boolean removeAccount(Account account) {
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
