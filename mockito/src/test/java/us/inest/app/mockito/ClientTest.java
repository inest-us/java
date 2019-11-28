package us.inest.app.mockito;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class ClientTest {
    private Address addressA = new Address("Street A");
    private Address addressB = new Address("Street B");
    private Client client;

    @Before
    public void setUp() {
        client = new Client();
    }

    @Test
    public void afterCreationShouldHaveNoAddress() {
        assertEquals(0, client.getAddresses().size());
    }

    @Test
    public void shouldAllowToAddAddress() {
        client.addAddress(addressA);
        assertEquals(1, client.getAddresses().size());
        assertTrue(client.getAddresses().contains(addressA));
    }

    @Test
    public void shouldAllowToAddManyAddresses() {
        client.addAddress(addressA);
        client.addAddress(addressB);
        assertEquals(2, client.getAddresses().size());
        assertTrue(client.getAddresses().contains(addressA));
        assertTrue(client.getAddresses().contains(addressB));
    }
}
