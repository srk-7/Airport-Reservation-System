import javax.swing.*;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            JLabel h1=new JLabel("Welcome to Airport Reservation System");
            JFrame frame = new JFrame("Airline Reservation System");
            frame.setSize(500, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            JLabel tclass = new JLabel("Type of Class:");
            tclass.setBounds(20,20,100,20);
            frame.add(tclass);
        
            JRadioButton EcoRadio = new JRadioButton("Economic");
            EcoRadio.setBounds(150, 20, 120, 20);
            frame.add(EcoRadio);

            JRadioButton BusRadio = new JRadioButton("Business");
            BusRadio.setBounds(280, 20, 120, 20);
            frame.add(BusRadio);

            ButtonGroup flightTypeGroup = new ButtonGroup();
            flightTypeGroup.add(EcoRadio);
            flightTypeGroup.add(BusRadio);

            JLabel type = new JLabel("Type of Flight:");
            type.setBounds(20,50,100,20);
            frame.add(type);
            
            JRadioButton domesticRadio = new JRadioButton("Domestic");
            domesticRadio.setBounds(150, 50, 120, 20);
            frame.add(domesticRadio);

            JRadioButton internationalRadio = new JRadioButton("International");
            internationalRadio.setBounds(280, 50, 120, 20);
            frame.add(internationalRadio);

            ButtonGroup flightClassGroup = new ButtonGroup();
            flightClassGroup.add(domesticRadio);
            flightClassGroup.add(internationalRadio);

            JLabel flightLabel = new JLabel("Select a Flight:");
            flightLabel.setBounds(20, 80, 100, 20);
            frame.add(flightLabel);

            JTextField flightField = new JTextField();
            flightField.setBounds(150, 80, 120, 20);
            frame.add(flightField);

            JLabel seatsLabel = new JLabel("Number of Seats:");
            seatsLabel.setBounds(20, 110, 100, 20);
            frame.add(seatsLabel);

            JTextField seatsField = new JTextField();
            seatsField.setBounds(150, 110, 120, 20);
            frame.add(seatsField);

            JLabel datef = new JLabel("Date:");
            datef.setBounds(20, 140, 100, 20);
            frame.add(datef);

            JTextField datetf = new JTextField();
            datetf.setBounds(150, 140, 120, 20);
            frame.add(datetf);

            JLabel timef = new JLabel("Time:");
            timef.setBounds(20, 170, 100, 20);
            frame.add(timef);

            JTextField timetf = new JTextField();
            timetf.setBounds(150, 170, 120, 20);
            frame.add(timetf);

            JButton bookButton = new JButton("Book");
            bookButton.setBounds(20, 200, 80, 30);
            frame.add(bookButton);

            TextArea ta=new TextArea();
            ta.setBounds(20,240,350,250);
            frame.add(ta);

            JButton Fdetails = new JButton("Flight Details");
            Fdetails.setBounds(110, 200, 220, 30);
            frame.add(Fdetails);

            Fdetails.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                {
                    String date = datetf.getText().trim();
                    if (date.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Please enter the Date field.");
                    } else {
                        StringBuilder flightDetails = new StringBuilder();
                        flightDetails.append("Flight Details:\n");
                        flightDetails.append("AR1001-Delhi To Mumbai(150 SEATS)\n");
                        flightDetails.append("AR1002-Bangalore TO Chennai(120 SEATS)\n");
                        flightDetails.append("AR1003-USA to New Delhi(100 SEATS)\n");
                        flightDetails.append("AR1004-London to Bankok(80 SEATS)\n");
                        flightDetails.append("AR1005-Jaipur to Kozhikode(90 SEATS)\n");
                        flightDetails.append("AR1006-Goa to Chandigarh(110 SEATS)\n");
                        flightDetails.append("AR1007-Nagpur to Jabalpur(70 SEATS)\n");
                        flightDetails.append("AR1008-Trivandrum to Varanasi(130 SEATS)\n");
                        flightDetails.append("AR1009-Raipur to Indore(85 SEATS)\n");
                        flightDetails.append("AR1010-Patna to Guwahati(95 SEATS)\n");
                        flightDetails.append("AR1011-Srinagar to Jammu(105 SEATS)\n");
                        flightDetails.append("AR1012-Agartala to Imphal(115 SEATS)\n");
                        flightDetails.append("AR1013-Dharamshala to Lucknow(75 SEATS)\n");
                        flightDetails.append("AR1014-Mangalore to Kolkata(90 SEATS)\n");
                        flightDetails.append("AR1015-Port Blair to Siliguri(100 SEATS)\n");
                        flightDetails.append("AR1016-Hubli to Puducherry(120 SEATS)\n");
                        flightDetails.append("AR1017-Belgaum to Surat(85 SEATS)\n");
                        flightDetails.append("AR1018-Vidyanagar to Jamshedpur(95 SEATS)\n");
                        flightDetails.append("AR1019-Surat to Dibrugarh(110 SEATS)\n");
                        flightDetails.append("AR1020-Surat to Dibrugarh(70 SEATS)\n");
                        flightDetails.append("AR1021-Jammu to Srinagar(70 SEATS)\n");
                        flightDetails.append("AR1022-Imphal to Dharamshala(85 SEATS)\n");
                        flightDetails.append("AR1023-Lucknow to Mangalore(95 SEATS)\n");
                        flightDetails.append("AR1024-Uk to Australia(110 SEATS)\n");
                        flightDetails.append("AR1025-Africa to Delhi(10 SEATS)\n");

                        ta.setText(flightDetails.toString());
                    }
                }
            });

            bookButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    String selectedFlight = flightField.getText();
                    int nos = Integer.parseInt(seatsField.getText());
                    String classType = EcoRadio.isSelected() ? "Economic Class" : "Business Class";
                    String FlightType = domesticRadio.isSelected() ? "Domestic" : "International";
                    if(e.getSource()==bookButton){
                        ta.setText("Class: "+classType+",\nType: "+FlightType+",\nFlight Id: "+flightField.getText()+",\nSeats: "+seatsField.getText()+",\nDate: "+datetf.getText()+",\nTime: "+timetf.getText()+".");
			        }
                    if (selectedFlight.equals("ARS1001") && nos <= 150) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Delhi to Mumbai!");
                    } else if (selectedFlight.equals("ARS1002") && nos <= 120) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Bangalore to Chennai!");
                    } else if (selectedFlight.equals("ARS1003") && nos <= 100) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for USA to New Delhi!");
                    } else if (selectedFlight.equals("ARS1004") && nos <= 80) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for London to Bankok!");
                    } else if (selectedFlight.equals("ARS1005") && nos <= 90) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Jaipur to Kozhikode!"); 
                    } else if (selectedFlight.equals("ARS1006") && nos <= 110) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Goa to Chandigarh!");
                    } else if (selectedFlight.equals("ARS1007") && nos <= 70) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Nagpur to Jabalpur!");
                    } else if (selectedFlight.equals("ARS1008") && nos <= 130) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Trivandrum to Varanasi!");
                    } else if (selectedFlight.equals("ARS1009") && nos <= 85) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Raipur to Indore!");
                    } else if (selectedFlight.equals("ARS1010") && nos <= 95) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Patna to Guwahati!");
                    } else if (selectedFlight.equals("ARS1011") && nos <= 105) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Srinagar to Jammu!");
                    } else if (selectedFlight.equals("ARS1012") && nos <= 115) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Agartala to Imphal!");
                    } else if (selectedFlight.equals("ARS1013") && nos <= 75) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Dharamshala to Lucknow!");
                    } else if (selectedFlight.equals("ARS1014") && nos <= 90) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Mangalore to Kolkata!");
                    } else if (selectedFlight.equals("ARS1015") && nos <= 100) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Port Blair to Siliguri!");
                    } else if (selectedFlight.equals("ARS1016") && nos <= 120) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Hubli to Puducherry!");
                    } else if (selectedFlight.equals("ARS1017") && nos <= 85) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Belgaum to Surat!");
                    } else if (selectedFlight.equals("ARS1018") && nos <= 95) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Vidyanagar to Jamshedpur!");
                    } else if (selectedFlight.equals("ARS1019") && nos <= 110) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Surat to Dibrugarh!");
                    } else if (selectedFlight.equals("ARS1020") && nos <= 70) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Bhuj to Hisar!");
                    } else if (selectedFlight.equals("ARS1021") && nos <= 70) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Jammu to Srinagar!");
                    } else if (selectedFlight.equals("ARS1022") && nos <= 85) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Imphal to Dharamshala!");
                    } else if (selectedFlight.equals("ARS1023") && nos <= 95) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Lucknow to Mangalore!");
                    } else if (selectedFlight.equals("ARS1024") && nos <= 110) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Uk to Australia!");
                    } else if (selectedFlight.equals("ARS1025") && nos <= 10) {
                        JOptionPane.showMessageDialog(frame, "Seats booked successfully for Africa to Delhi!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid selection or insufficient seats available.");
                    }
                }
            });

            frame.setVisible(true);
        });
    }
}