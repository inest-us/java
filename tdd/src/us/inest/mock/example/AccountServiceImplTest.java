package us.inest.mock.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class AccountServiceImplTest {
	AccountServiceImpl accountService = new AccountServiceImpl();
	
	@Test
	public void testCreateNewAccount() {
		Account newAccount = new Account();
		newAccount.setName("Alvin Reyes");
		newAccount.setDescription("This is the description");
		Account newAcccountInserted = accountService.createNewAccount(newAccount);
		
		// Check if the account has the same composition.
		assertEquals(newAccount.getName(), newAcccountInserted.getName());
	}
	
	@Test
	public void testUpdateAccount() {
		// The old account (assumed that this came from a database or mock)
		Account oldAccount = new Account();
		oldAccount.setName("Alvin Reyes");
		oldAccount.setDescription("This is the description");
		
		String name = oldAccount.getName();
		// Check if the account is still the same. it is expected to be different since we updated it.
		Account expectedAccountObj = new Account();
		expectedAccountObj = accountService.updateAccount(oldAccount);
		assertNotEquals(name, expectedAccountObj.getName());
	}
	
	@Test
	public void testRemoveAccount() {
		// Set up the account to be removed.
		Account toBeRemovedAccount = new Account();
		toBeRemovedAccount.setName("Alvin Reyes");
		toBeRemovedAccount.setDescription("This is the description");
		
		// Removed the account.
		assertTrue(accountService.removeAccount(toBeRemovedAccount));
	}
	
	@Test
	public void testListAllTransactions() {
		Account account = new Account();
		account.setName("Alvin Reyes");
		
		// Service gets all transaction
		List<Transaction> listOfAllTransactions = accountService.listAllTransactions(account);
		
		// Check if there are transactions.
		assertTrue(listOfAllTransactions.size() > 1);
	}
}
