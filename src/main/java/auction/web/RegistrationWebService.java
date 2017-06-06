package auction.web;

import auction.Models.User;
import auction.service.RegistrationMgr;

import javax.jws.WebService;

@WebService
public class RegistrationWebService {

    private RegistrationMgr registrationMgr;


    public RegistrationWebService(){}

    public RegistrationWebService(RegistrationMgr registrationMgr){
        this.registrationMgr = registrationMgr;
    }



    public User registerUser(String email){
        return registrationMgr.registerUser(email);
    }

    public User getUser(String email){
        return registrationMgr.getUser(email);
    }
}
