package com.Jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
	List<Account> findByAccountholder(String Accountholder);

}
