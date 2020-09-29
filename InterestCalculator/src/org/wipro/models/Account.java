package org.wipro.models;

abstract class Account {
	double interestRate;
	double amount;
	
	abstract double calculateInterest();
}