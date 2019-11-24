package us.inest.app.mockito;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class ServiceTest {
    @Test
    public void testPerformService() throws Exception {
        // Configure mock
        Collaborator collaboratorMock = mock(Collaborator.class);
        doReturn("output").when(collaboratorMock).transformString("input");

        // Perform the test
        Service service = new Service(collaboratorMock);
        String actual = service.performService("input");

        // Junit asserts
        String expected = "output";
        assertEquals(expected, actual);
    }
}
