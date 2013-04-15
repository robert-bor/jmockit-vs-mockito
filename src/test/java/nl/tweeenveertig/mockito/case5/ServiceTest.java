package nl.tweeenveertig.mockito.case5;

import nl.tweeenveertig.model.case5.ServiceWithEnumDependency;
import nl.tweeenveertig.model.case5.ToDependency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static junit.framework.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.spy;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ServiceWithEnumDependency.class)
public class ServiceTest {

//    @Test
//    public void doSomething() throws Exception {
//        ServiceWithEnumDependency service = new ServiceWithEnumDependency();
//        ToDependency original = spy(ToDependency.TO_DEPENDENCY);
//        when(original, "crashHorribly").thenReturn(5);
//        assertEquals(9, service.doSomething());
//    }

    // Didn't get it to work...
}
