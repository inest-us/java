package us.inest.app.mockito;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ServiceMockAnnotationTest {
    @Mock
    private Collaborator collaboratorMock;

    @InjectMocks
    private Service service;

    @Test
    public void testPerformService() throws Exception {
        // Configure mock
        doReturn("output").when(collaboratorMock).transformString("input");

        // Perform the test
        String actual = service.performService("input");

        // Junit asserts
        String expected = "output";
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void testPerformServiceShouldFail() throws Exception {
        // Configure mock
        doThrow(new Exception()).when(collaboratorMock).transformString("input");

        // Perform the test
        service.performService("input");
    }
}
