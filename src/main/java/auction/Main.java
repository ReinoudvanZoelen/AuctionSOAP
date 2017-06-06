package auction;


import auction.service.AuctionMgr;
import auction.service.RegistrationMgr;
import auction.service.SellerMgr;
import auction.web.AuctionWebService;
import auction.web.RegistrationWebService;

import javax.xml.ws.Endpoint;

public class Main {
    private static final String localUrl = "http://localhost:1337/AuctionSOAP/";

    public static void main(String[] args) {
        Endpoint.publish(localUrl + "Auction", new AuctionWebService(new AuctionMgr(), new SellerMgr()));
        Endpoint.publish(localUrl + "Registration", new RegistrationWebService(new RegistrationMgr()));
    }
}
