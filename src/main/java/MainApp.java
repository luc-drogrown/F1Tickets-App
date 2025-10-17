import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main
{
    public static void main(String[] args) throws IOException {
        TicketManager ticketManager = new TicketManager();
        ticketManager.genBarcode("luci", "ceva");

        ticketManager.testDatabase();
    }
}