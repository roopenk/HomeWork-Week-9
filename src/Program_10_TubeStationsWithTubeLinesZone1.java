import java.util.HashMap;
import java.util.Scanner;

/**
 * A Java program that tells you which lines are passing through a particular station within zone 1 of
 * london underground
 */
public class Program_10_TubeStationsWithTubeLinesZone1 {
    public static void main(String[] args) {
        char result;
        // Printing Zone 1 Station list to the User
        System.out.println("This is Zone 1 Station list : ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------|");
        System.out.println("ALDGATE, EUSTON SQUARE, OXFORD CIRCUS, WATERLOO STATION, TOWER HILL, OLD STREET,                                    |");
        System.out.println("SOUTH KENSINGTON, VICTORIA STATION, LANCASTER GATE, GREEN PARK, FARRINGDON, EDGWARE ROAD,                           |");
        System.out.println("QUEENSWAY, KINGS CROSS ST.PANCRAS STATION, VAUXHALL STATION, EUSTON STATION, BAYSWATER, ANGEL, PADDINGTON STATION,  |");
        System.out.println("BAKER STREET, KNIGHTSBRIDGE, CHARING CROSS STATION, GLOUCESTER ROAD, REGENTS PARK, HYDE PARK CORNER,                |");
        System.out.println("LEICESTER SQUARE, LONDON BRIDGE STATION, PICCADILLY CIRCUS, MOORGATE, ST. PAUL'S, WESTMINSTER, HOLBORN,             |");
        System.out.println("COVENT GARDEN, BOND STREET, MARBLE ARCH, TOTTENHAM COURT ROAD, RUSSELL SQUARE                                       |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------|");

        // HashMap declaration storing and binding Stations to Lines
        HashMap<String, String> zone = new HashMap<String, String>();
        zone.put("ALDGATE", "Circle / Metropolitan");
        zone.put("ANGEL", "Northern");
        zone.put("BAKER STREET", "Bakerloo / Circle / Hammersmith & City / Jubilee / Metropolitan");
        zone.put("BAYSWATER", "Circle / District");
        zone.put("BOND STREET", "Circle / Jubilee");
        zone.put("CHARING CROSS STATION", "Northern / Bakerloo");
        zone.put("COVENT GARDEN", "Piccadilly");
        zone.put("EDGWARE ROAD", "Circle / District / Hammersmith & City");
        zone.put("EUSTON STATION", "Victoria / Northern");
        zone.put("EUSTON SQUARE", "Metropolitan / Hammersmith & City / Circle");
        zone.put("FARRINGDON", "Circle / Hammersmith & City / Metropolitan");
        zone.put("GLOUCESTER ROAD", "District /Circle / Piccadilly");
        zone.put("GREEN PARK", "Jubilee / Piccadilly / Victoria");
        zone.put("HOLBORN", "Central / Piccadilly");
        zone.put("HYDE PARK CORNER", "Piccadilly");
        zone.put("KINGS CROSS ST.PANCRAS STATION", "Circle / Piccadilly / Hammersmith & City / Northern / Metropolitan / Victoria");
        zone.put("KNIGHTSBRIDGE", "Piccadilly");
        zone.put("LANCASTER GATE", "Central");
        zone.put("LEICESTER SQUARE", "Northern / Piccadilly");
        zone.put("LONDON BRIDGE STATION", "Northern / Jubilee");
        zone.put("MARBLE ARCH", "Central");
        zone.put("MOORGATE", "Circle / Hammersmith & City / Metropolitan / Northern");
        zone.put("OLD STREET", "Northern");
        zone.put("OXFORD CIRCUS", "Bakerloo / Central / Victoria");
        zone.put("PADDINGTON STATION", "Hammersmith & City / Bakerloo / District / Circle");
        zone.put("PICCADILLY CIRCUS", "Piccadilly / Bakerloo");
        zone.put("QUEENSWAY", "Central");
        zone.put("REGENTS PARK", "Bakerloo");
        zone.put("RUSSELL SQUARE", "Piccadilly");
        zone.put("SOUTH KENSINGTON", "District / Circle / Piccadilly");
        zone.put("ST. PAUL'S", "Central");
        zone.put("TOTTENHAM COURT ROAD", "Central / Northern");
        zone.put("TOWER HILL", "District / Circle");
        zone.put("VAUXHALL STATION", "Victoria");
        zone.put("VICTORIA STATION", "District / Circle / Victoria");
        zone.put("WATERLOO STATION", "Bakerloo / Jubilee / Northern");
        zone.put("WESTMINSTER", "Circle / District / Jubilee");

        do { // do while loop asking user once to enter station name and displaying results until user selects N
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter The Station Name From Above List : ");
            String name1 = input.nextLine(); // storing user inserted station in name1 variable
            name1 = name1.toUpperCase(); // converting name1 to uppercase

            for (String i : zone.keySet()) { // for loop going through HashMap and storing stations key to i
                if (name1.equals(i)) { // matching i with user inserted station
                    System.out.println("Tube Lines Passing Through Given Station  : " + zone.get(i)); // printing values of key i
                }
            }
            System.out.println("Do You Want To Try Again : 'Y' or 'N' "); // Asking whether user wants to continue
            result = input.next().charAt(0);
            input.close();
        } while (result == 'Y' || result == 'y'); // while loop to ensure do loop keeps running until user enters y or Y

    }
}
