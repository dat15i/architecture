package dk.clbo.applicationlayer;

import dk.clbo.applicationlayer.datatypes.Hotel;
import dk.clbo.dataaccesslayer.*;

import java.util.List;

/**
 * Created by clbo on 07/03/2016.
 */
public class HotelInfo {

    private HotelSql hotelSql = new HotelSql();
    private List<Hotel> hotels = hotelSql.selectAllHotels();
    Hotel hotel;

    public List<Hotel> selectAllHotels() {
        return hotels;
    }


    public void createHotel(Hotel h)   //int id ,String name, String city)
    {
        hotel = h;
        hotelSql.createHotel(hotel);
    }

}
