package com.Jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service("customerService")
public class AccountService {
	private static final String Accountholder = null;
	@Autowired
	private AccountRepository repository;

	public void test() {

		Account newAccount = new Account();
		newAccount.setAccountnumber(120547565);
		newAccount.setAccountholder("sindhu");
		repository.save(newAccount);

		List<Account> account = repository.findByAccountholder(Accountholder);
		account.forEach(customer -> System.out.println(account));

		Iterable<Account> iterator = repository.findAll();
		iterator.forEach(Account -> System.out.println(Account));

		long count = repository.count();
		System.out.println("Number of Accounts: " + count);
	}
}
