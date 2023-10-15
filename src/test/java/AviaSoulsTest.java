import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;


public class AviaSoulsTest {
    @Test
    public void testSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Ekb", 500, 14, 19);
        Ticket ticket3 = new Ticket("Kzn", "Spb", 100, 20, 22);
        Ticket ticket4 = new Ticket("Spb", "Msk", 200, 10, 11);
        Ticket ticket5 = new Ticket("Kzn", "Ekb", 800, 10, 17);
        Ticket ticket6 = new Ticket("Vld", "Spb", 30, 22, 13);
        Ticket ticket7 = new Ticket("Msk", "Spb", 30, 22, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Msk", "Spb");
        Ticket[] expected = {ticket7, ticket1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNotFindTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Ekb", 500, 14, 19);
        Ticket ticket3 = new Ticket("Kzn", "Spb", 100, 20, 22);
        Ticket ticket4 = new Ticket("Spb", "Msk", 200, 10, 11);
        Ticket ticket5 = new Ticket("Kzn", "Ekb", 800, 10, 17);
        Ticket ticket6 = new Ticket("Vld", "Spb", 30, 22, 13);
        Ticket ticket7 = new Ticket("Msk", "Spb", 30, 22, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Msk", "Kzn");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindOne() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Ekb", 500, 14, 19);
        Ticket ticket3 = new Ticket("Kzn", "Spb", 100, 20, 22);
        Ticket ticket4 = new Ticket("Spb", "Msk", 200, 10, 11);
        Ticket ticket5 = new Ticket("Kzn", "Ekb", 800, 10, 17);
        Ticket ticket6 = new Ticket("Vld", "Spb", 30, 22, 13);
        Ticket ticket7 = new Ticket("Msk", "Spb", 30, 22, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("Vld", "Spb");
        Ticket[] expected = {ticket6};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testSortTicketsComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Ekb", 500, 14, 19);
        Ticket ticket3 = new Ticket("Kzn", "Spb", 100, 20, 22);
        Ticket ticket4 = new Ticket("Spb", "Msk", 200, 10, 11);
        Ticket ticket5 = new Ticket("Kzn", "Ekb", 800, 10, 17);
        Ticket ticket6 = new Ticket("Vld", "Spb", 30, 22, 13);
        Ticket ticket7 = new Ticket("Msk", "Spb", 30, 22, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Msk", "Spb", comparator);
        Ticket[] expected = {ticket7, ticket1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNotFindTicketComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Ekb", 500, 14, 19);
        Ticket ticket3 = new Ticket("Kzn", "Spb", 100, 20, 22);
        Ticket ticket4 = new Ticket("Spb", "Msk", 200, 10, 11);
        Ticket ticket5 = new Ticket("Kzn", "Ekb", 800, 10, 17);
        Ticket ticket6 = new Ticket("Vld", "Spb", 30, 22, 13);
        Ticket ticket7 = new Ticket("Msk", "Spb", 30, 22, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Msk", "Kzn", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindOneComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Msk", "Spb", 200, 10, 12);
        Ticket ticket2 = new Ticket("Msk", "Ekb", 500, 14, 19);
        Ticket ticket3 = new Ticket("Kzn", "Spb", 100, 20, 22);
        Ticket ticket4 = new Ticket("Spb", "Msk", 200, 10, 11);
        Ticket ticket5 = new Ticket("Kzn", "Ekb", 800, 10, 17);
        Ticket ticket6 = new Ticket("Vld", "Spb", 30, 22, 13);
        Ticket ticket7 = new Ticket("Msk", "Spb", 30, 22, 13);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Vld", "Spb", comparator);
        Ticket[] expected = {ticket6};

        Assertions.assertArrayEquals(expected, actual);
    }
}

