package com.divyansh.verifone.Service;

import com.divyansh.verifone.Entity.SimCard;
import com.divyansh.verifone.Repository.SimCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimCardService {

    @Autowired
    private SimCardRepo simCardRepo;

    public SimCard addNewSimCard(SimCard newSimCard){
        return new SimCard();
    }

    public List<SimCard> getAllSimCardsDetails(){
        return new ArrayList<SimCard>();
    }

    public SimCard updateSimCardDetailsById( Long mobile_no){
        return new SimCard();
    }

    public SimCard deleteSimCardById(Long mobile_no){
        return  new SimCard();
    }
}
