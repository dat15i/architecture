package dk.clbo.presentationlayer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import dk.clbo.applicationlayer.datatypes.Hotel;
import dk.clbo.applicationlayer.HotelInfo;

public class ListAllHotels implements ActionListener
{
	// Fields
	JFrame frame = new JFrame("Hotel Administration");
	JButton btn1;
	HotelInfo hotelInfo = new HotelInfo();
	JButton btnBook;

	List<Hotel> al;

	JTextArea ta;

	public ListAllHotels() throws SQLException
	{
		frame.setSize(1200, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		// NORTH - JComboBox
		Object[] hotelArr = hotelInfo.selectAllHotels().toArray();
		System.out.println(hotelArr);
		@SuppressWarnings({ "rawtypes", "unchecked" }) 
		JComboBox hotelList = new JComboBox(hotelArr);
		hotelList.addActionListener(this);
		frame.add(hotelList, BorderLayout.NORTH);

		// CENTER - TextArea
		ta = new JTextArea();
		frame.add(ta, BorderLayout.CENTER);

		// SOUTH - Button
		btnBook = new JButton("Register new Guest in the System");
		frame.add(btnBook, BorderLayout.SOUTH);
		btnBook.addActionListener(this);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// user enters id, name, and city of hotel
		Hotel h = new Hotel(2, "Claus", "gggggg");
		hotelInfo.createHotel(h);

//		if (e.getSource() == btnBook)
//		{
//			try
//			{
//				new NewGuest();
//			}
//			catch (SQLException e1)
//			{
//				System.err.println(e1);
//			}
//		}
//		else
//		{
//			@SuppressWarnings("rawtypes")
//			JComboBox cb = (JComboBox) e.getSource();
//			Object[] hotel = cb.getSelectedObjects();
//			try
//			{
//				BookingInfo bookingInfo = new BookingInfo();
//				List<Booking> alb = bookingInfo.selectBookings(((Hotel) hotel[0]).getHotelNo());
//
//				String txt = "\t";
//				for (Booking booking : alb)
//				{
//					txt += booking + "\n\t";
//				}
//
//				ta.setText(txt);
//			}
//			catch (SQLException e1)
//			{
//				System.err.println(e1);
//			}
//		}
	}
}
