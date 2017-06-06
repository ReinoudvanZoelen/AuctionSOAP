package auction;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Reino on 6-6-2017.
 */
public class RegistrationWebServiceTest {

    RegistrationWebService service = new RegistrationWebServiceService().getPort(RegistrationWebService.class);

    @Test
    public void registerUser() {
        User user1 = service.registerUser("xxx1@yyy");
        assertTrue(user1.getEmail().equals("xxx1@yyy"));
        User user2 = service.registerUser("xxx2@yyy2");
        assertTrue(user2.getEmail().equals("xxx2@yyy2"));
        User user2bis = service.registerUser("xxx2@yyy2");
        assertSame(user2bis.getId(), user2.getId());
        //geen @ in het adres
        assertNull(service.registerUser("abc"));
    }

    @Test
    public void getUser() {
        User user1 = service.registerUser("xxx5@yyy5");
        User userGet = service.getUser("xxx5@yyy5");
        assertSame(userGet.getId(), user1.getId());
        assertNull(service.getUser("aaa4@bb5"));
        service.registerUser("abc");
        assertNull(service.getUser("abc"));
    }

}