package example;

import auction.AuctionWebService;
import auction.AuctionWebServiceService;

public class HelloWorldClient {
    public static void main(String[] argv) {
        AuctionWebService auctionWebService = new AuctionWebServiceService().getPort(AuctionWebService.class);
        AuctionWebService service = new AuctionWebServiceService().getPort(AuctionWebService.class);
    }
}
