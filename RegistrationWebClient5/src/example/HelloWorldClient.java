package example;

import auction.RegistrationWebService;
import auction.RegistrationWebServiceService;

/**
 * Created by Reino on 6-6-2017.
 */
public class HelloWorldClient {
    public static void main(String[] argv) {
        RegistrationWebService service = new RegistrationWebServiceService().getPort(RegistrationWebService.class);
    }
}
