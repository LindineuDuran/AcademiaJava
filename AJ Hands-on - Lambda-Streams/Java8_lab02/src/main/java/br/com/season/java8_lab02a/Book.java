package br.com.season.java8_lab02a;

public class Book
{

	String title;
	double price;

	public Book(String pTitle, double pPrice)
	{
		this.title = pTitle;
		this.price = pPrice;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Book [title=" + title + ", price=" + price + "]";
	}
}
