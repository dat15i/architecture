package dk.clbo.applicationlayer.datatypes;

public class Guest
{
	private int guestNo;
	private String name;
	private String address;
	private boolean gender;

	public Guest(int guestNo, String name, String address)
	{
		this.guestNo = guestNo;
		this.name = name;
		this.address = address;
	}

	public int getGuestNo()
	{
		return guestNo;
	}

	public void setGuestNo(int guestNo)
	{
		this.guestNo = guestNo;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	@Override
	public String toString()
	{
		return guestNo + ", " + name + ", " + address;
	}
}
