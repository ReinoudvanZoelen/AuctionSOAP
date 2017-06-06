package example;

import auction.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AuctionWebClientTest {

    AuctionWebService auctionWebService = new AuctionWebServiceService().getPort(AuctionWebService.class);
    RegistrationWebService registrationWebService = new RegistrationWebServiceService().getPort(RegistrationWebService.class);

    @Test
    public void testOfferItem() {
        String omsch = "omsch";

        User user1 = this.registrationWebService.registerUser("xx@nl");
        Category cat = new Category("cat1");
        Item item1 = this.auctionWebService.offerItem(user1, cat, omsch);
        assertEquals(omsch, item1.getDescription());
        assertNotNull(item1.getId());
    }
}