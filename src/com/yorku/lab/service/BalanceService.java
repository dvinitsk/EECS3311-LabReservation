package com.yorku.lab.service;

import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.model.User;
import com.yorku.lab.repository.UserRepository;

public class BalanceService {
	
	private final UserRepository userRepository;
	
	public BalanceService() {
		this.userRepository = new UserRepository();
	}

	public void addFunds(User currentUser, double amount) {
		currentUser.setFunds(currentUser.getFunds() + amount);
		userRepository.findById(currentUser.getUserId()).ifPresent(user -> {
			user.setFunds(user.getFunds() + amount);
			userRepository.save(user);
		});
	}
	
	public void deductFunds(User currentUser, double amount) {
		if(currentUser.getFunds() < amount) {
			throw new IllegalArgumentException("Insufficient funds");
		}else {
		currentUser.setFunds(currentUser.getFunds() - amount);
		userRepository.findById(currentUser.getUserId()).ifPresent(user -> {
			user.setFunds(user.getFunds() - amount);
			userRepository.save(user);
		});
		}
	}

}
