package com.divyansh.verifone.Service;

import com.divyansh.verifone.Entity.SimCard;
import com.divyansh.verifone.Repository.SimCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SimCardService {

    @Autowired
    private SimCardRepo simCardRepo;

    public SimCard addNewSimCard(SimCard newSimCard){
//        return simCardRepo.save(newSimCard);
        return simCardRepo.save(newSimCard);
    }

    public Optional<SimCard> getSimCard(Long id){
         return  simCardRepo.findById(id);
    }
    public List<SimCard> getAllSimCardsDetails(){
//        return simCardRepo.getAllSimCard();
        return (List<SimCard>) simCardRepo.findAll();
    }

    public SimCard updateSimCardDetailsById( Long id, SimCard simCard){
//        return new SimCard();
        return simCardRepo.save(simCard);
    }

    public void deleteSimCardById(Long id){
          simCardRepo.deleteById(id);
    }

    public List<SimCard> getsimCardExpiringInNext30Days(){
        return simCardRepo.getAllsimCardExpiringInNext30Days();
    }
}
