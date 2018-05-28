package com.nt.beans;

public class LoanDetails {

	private int loanId;
	private String loanType;
	private String customer;

	public LoanDetails() {
		System.out.println("Loan detials 0-param constructor");
	}

		public int getLoanid() {
		return loanId;
	}

	public void setLoanid(int loanid) {
		this.loanId = loanid;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

		@Override
		public String toString() {
			return "LoanDetails [loanid=" + loanId + ", loanType=" + loanType + ", customer=" + customer + "]";
		}
	
	

}
