package nl.tweeenveertig.mockito.case2;

import nl.tweeenveertig.model.case2.ServiceWithNewDependency;
import nl.tweeenveertig.model.case2.ToDependency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)                 // Be sure to pick this runner, not the default MockitoJUnitRunner
@PrepareForTest(ServiceWithNewDependency.class) // Note that you prepare the class where the construction is taking
                                                // place, not the constructed class.
public class ServiceTest {

    @Test
    public void doSomething() throws Exception {
        ToDependency toDep = mock(ToDependency.class);
        when(toDep.crashHorribly()).thenReturn(5);
        whenNew(ToDependency.class).withNoArguments().thenReturn(toDep);
        ServiceWithNewDependency service = new ServiceWithNewDependency();
        assertEquals(9, service.doSomething());
    }

}
