package us.inest.app.mockito;

import java.util.List;

public interface AccountService {
	Account createNewAccount(Account account);
	
	Account updateAccount(Account account);
	
	boolean removeAccount(Account account);
	
	List<Transaction> listAllTransactions(Account account);
}
