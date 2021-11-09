package com.comparators;

import java.util.Comparator;

import com.crm.core.Customer;

public class DobAndRegnAmt implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		int dateComparison = c1.getDob().compareTo(c2.getDob());
		if(dateComparison == 0) {
			return (int) (c1.getRegAmt() - c2.getRegAmt());
		}
			
		return dateComparison;
	}

}
