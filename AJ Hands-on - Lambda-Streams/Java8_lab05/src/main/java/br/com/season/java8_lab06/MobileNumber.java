package br.com.season.java8_lab06;

public class MobileNumber
{
	private String number;

	public MobileNumber(String number)
	{
		this.number = number;
	}

	public String getNumber()
	{
		return number;
	}

	public void setNumber(String number)
	{
		this.number = number;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "MobileNumber [number=" + number + "]";
	}
}
