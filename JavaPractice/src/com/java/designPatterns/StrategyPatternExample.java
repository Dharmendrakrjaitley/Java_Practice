package com.java.designPatterns;

interface PaymentStrategy{
	void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy{

	private String cardNumber;
	private String name;
	
	public CreditCardPayment(String cardNumber, String name)
	{
		this.cardNumber=cardNumber;
		this.name=name;
	}
	
	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid: " + amount + " using credit card");
	}
	
}

class UpiPayment implements PaymentStrategy{

	private String mobileNumber;
	private String name;
	
	public UpiPayment(String mobileNumber, String name)
	{
		this.mobileNumber=mobileNumber;
		this.name=name;
	}
	
	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid: " + amount + " using online upi payment");
	}
	
}

class PaymentContext{
	
	private PaymentStrategy paymentStrategy;
	
	public void setPaymentStrategy(PaymentStrategy paymentStrategy)
	{
		this.paymentStrategy=paymentStrategy;
	}
	
	public void performPayment(int amount)
	{
		paymentStrategy.pay(amount);
	}
	
}



public class StrategyPatternExample {

	public static void main(String[] args) {
		PaymentContext paymentContext=new PaymentContext();
		//For credit card payment
		CreditCardPayment creditCardPayment=new CreditCardPayment("1234-5678-9123", "Dharmendra");
		paymentContext.setPaymentStrategy(creditCardPayment);
		paymentContext.performPayment(5000);
		
		//For UPI payment
		UpiPayment upiPayment=new UpiPayment("123456789", "Rahul");
		paymentContext.setPaymentStrategy(upiPayment);
		paymentContext.performPayment(10000);
	}
}
