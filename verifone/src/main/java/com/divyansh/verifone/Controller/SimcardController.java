package com.divyansh.verifone.Controller;

import com.divyansh.verifone.Entity.SimCard;
import com.divyansh.verifone.Service.SimCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SimcardController {

    @Autowired
    private SimCardService simCardService;
    @GetMapping("/")
    public String home (){
        //return HttpStatus.ACCEPTED.
        return "Hello Verifone";
    }

    @PostMapping("/add")
    public SimCard addSimCard(@RequestBody SimCard simcard){
        return simCardService.addNewSimCard(simcard);
    }

    @GetMapping("/{id}")
    public Optional<SimCard> getSimCard(@PathVariable Long id){
        return simCardService.getSimCard(id);
    }

    @GetMapping("/listall")
    public List<SimCard> getAllSimCards(){
            return simCardService.getAllSimCardsDetails();
    }

    @PutMapping("/{id}")
    public SimCard updateSimCardById(@PathVariable Long id,@RequestBody SimCard simCard){
        return simCardService.updateSimCardDetailsById(id, simCard);
    }

    @DeleteMapping("/{id}")
    public void deleteSimCard(@PathVariable Long id){
        simCardService.deleteSimCardById(id);
    }

    @GetMapping("/to-renew")
    public List<SimCard> getAllsimCardExpiringInNext30Days(){
        return simCardService.getsimCardExpiringInNext30Days();
    }

}
