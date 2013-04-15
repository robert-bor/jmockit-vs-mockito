package nl.tweeenveertig.mockito.case4;

import nl.tweeenveertig.model.case4.ServiceWithPrivateDependency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.spy;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ServiceWithPrivateDependency.class)
public class ServiceTest {

    @Test
    public void doSomething() throws Exception {
//        ServiceWithPrivateDependency service = spy(new ServiceWithPrivateDependency());
//        when(service, "crashHorribly").thenReturn(5);
//        service.doSomething();
//        assertEquals(9, service.doSomething());

        // can't get this to work...
    }

}
