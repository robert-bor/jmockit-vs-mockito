package nl.tweeenveertig.mockito.case3;

import nl.tweeenveertig.model.case3.ServiceWithStaticDependency;
import nl.tweeenveertig.model.case3.ToDependency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)     // Be sure to pick this runner, not the default MockitoJUnitRunner
@PrepareForTest(ToDependency.class) // Note that here you have to prepare the class with the static method, whereas
                                    // in case 2, you had to prepare the class where the construction was taking place
public class ServiceTest {

    @Test
    public void doSomething() throws Exception {
        mockStatic(ToDependency.class); // @PrepareForTest is not enough, you once more prepare it
        when(ToDependency.crashHorribly()).thenReturn(5);
        ServiceWithStaticDependency service = new ServiceWithStaticDependency();
        assertEquals(9, service.doSomething());
    }

}
