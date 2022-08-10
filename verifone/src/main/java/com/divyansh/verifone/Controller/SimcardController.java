package com.divyansh.verifone.Controller;

import com.divyansh.verifone.Entity.SimCard;
import com.divyansh.verifone.Service.SimCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class SimcardController {

    @Autowired
    private SimCardService simCardService;
  //  @GetMapping("/")
//    public HttpStatus home (){
//        //return HttpStatus.ACCEPTED.
//    }

    @GetMapping("add")
    public SimCard addSimCard(@RequestBody SimCard simcard){
        return simCardService.addNewSimCard(simcard);
    }

    @GetMapping("listall")
    public List<SimCard> getAllSimCards(){
            return simCardService.getAllSimCardsDetails();
    }

    @PutMapping("{id}")
    public SimCard updateSimCardById(@PathVariable Long id){
        return simCardService.updateSimCardDetailsById(id);
    }

    @DeleteMapping("{id}")
    public SimCard deleteSimCard(@PathVariable Long id){
        return simCardService.deleteSimCardById(id);
    }

}
