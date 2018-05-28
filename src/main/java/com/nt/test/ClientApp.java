package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.BankLoanApprover;

public class ClientApp {

	public static void main(String[] args) {

		// create ioc container
		BeanFactory pfactory = new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/loan-beans.xml"));

		// create child ioc continer
		BeanFactory cfactory = new XmlBeanFactory(
				new FileSystemResource("src/main/java/com/nt/cfgs/apporoval-beans.xml"), pfactory);

		// get bean
		BankLoanApprover approver = cfactory.getBean("approver", BankLoanApprover.class);

		System.out.println(approver.approveLoan());
	}

}
