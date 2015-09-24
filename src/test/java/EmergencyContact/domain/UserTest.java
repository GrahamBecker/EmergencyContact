package EmergencyContact.domain;

import EmergencyContact.conf.factory.UserFactory;
import org.junit.Test;
import org.testng.Assert;

import static org.junit.Assert.*;

/**
 * Created by graham on 2015/09/20.
 */
public class UserTest {

    @Test
    public void testCreate() throws Exception {
        User user = UserFactory
                .createUser(0001L,"Graham","Becker","20/11/1984","15 Oranje Street","0829978749");
     //   Assert.assertEquals(1L, user.getId());
    }


}