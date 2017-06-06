package auction.web;

import auction.Models.Bid;
import auction.Models.Category;
import auction.Models.Item;
import auction.Models.User;
import auction.service.AuctionMgr;
import auction.service.SellerMgr;
import auction.util.Money;

import javax.jws.WebService;
import java.util.List;

@WebService
public class AuctionWebService {
    private AuctionMgr auctionMgr = new AuctionMgr();
    private SellerMgr sellerMgr = new SellerMgr();

    public AuctionWebService(){}
    public AuctionWebService(AuctionMgr auctionMgr, SellerMgr sellerMgr){
        this.auctionMgr = auctionMgr;
        this.sellerMgr = sellerMgr;
    }



    public Item getItem(Long id){
        return auctionMgr.getItem(id);
    }

    public List<Item> findItemByDescription(String description){
        return auctionMgr.findItemByDescription(description);
    }

    public Bid newBid(Item item, User buyer, Money amount){
        return auctionMgr.newBid(item, buyer, amount);
    }

    public Item offerItem(User seller, Category cat, String description){
        return sellerMgr.offerItem(seller,cat,description);
    }

    public boolean revokeItem(Item item){
        return sellerMgr.revokeItem(item);
    }
}
