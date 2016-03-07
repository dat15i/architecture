package dk.clbo.dataaccesslayer;

import java.util.ArrayList;
import java.util.List;

import dk.clbo.applicationlayer.datatypes.Hotel;

public class HotelSql
{
	private ArrayList<Hotel> al = new ArrayList<Hotel>();

	public List<Hotel> selectAllHotels()
	{
		// Get hotels from DataBase and put it in List

		al.add(new Hotel(1, "Radison", "Copenhagen"));
		al.add(new Hotel(2, "Ibis", "Copenhagen"));
		al.add(new Hotel(1, "Hilton", "London"));
		al.add(new Hotel(1, "hhhh", "New Your"));
		al.add(new Hotel(1, "rrrr", "London"));
		return al;
	}

	public void createHotel(Hotel h)
	{
		// write h to the database
	}

}
