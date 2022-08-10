package com.divyansh.verifone.Repository;

import com.divyansh.verifone.Entity.SimCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SimCardRepo extends CrudRepository<SimCard, Long> {

//    @Query(value = "SELECT  DATE_FORMAT(expiry_date, '%d/%m/%y')\n" +
//            "FROM    sim_card\n" +
//            "WHERE   expiry_date BETWEEN (CURDATE() + INTERVAL 30 DAY) AND CURDATE()")

    @Query(value = "SELECT\n" +
            "    * \n" +
            "FROM\n" +
            "    sim_card \n" +
            "WHERE\n" +
            "    expiry_date BETWEEN DATE_ADD(NOW(), INTERVAL 30 DAY)\n" +
            "AND NOW();",nativeQuery = true)
    public List<SimCard> getAllsimCardExpiringInNext30Days();


}
