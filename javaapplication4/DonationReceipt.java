/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author msa
 */
public class DonationReceipt extends Document {
    private String organization;
	private String receiver;
	private String address;
	private String receiptNumber;
	private String amount;
	private String date;
	
	public DonationReceipt(String id)
	{
		super(id);
	}
	
	public DonationReceipt(String id, String receiver, String organization, String number, String amount, String date)
	{
		super(id);
		this.receiver = receiver;
		this.organization = organization;
		this.receiptNumber = number;
		this.amount = amount;
		this.date = date;
	}

	// Set the body of the receipt. Overrides the setBody() method in Document 
	public void setBody(String receiptBody)
	{
		//-----------Start below here. To do: approximate lines of code = 2
		// Set the string body variable, inherited from Document, to contain
		// the given receiptBody string followed by the receiver followed by "\n\nReceipt#: " followed by 
		// the receiptNumber followed by "\nAmount: " followed by the amount followed by "\nDate: " followed by the date string
		         
            
            super.setBody("%s"+receiptBody+ this.receiptNumber+"\n");
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}
	
	public String getOrganization()
	{
		return organization;
	}

	public void setOrganization(String organization)
	{
		this.organization = organization;
	}

	public String getReceiver()
	{
		return receiver;
	}

	public void setReceiver(String receiver)
	{
		this.receiver = receiver;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getReceiptNumber()
	{
		return receiptNumber;
	}

	public void setReceiptNumber(String receiptNumber)
	{
		this.receiptNumber = receiptNumber;
	}

	public String getAmount()
	{
		return amount;
	}

	public void setAmount(String amount)
	{
		this.amount = amount;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}
}
