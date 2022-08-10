package com.divyansh.verifone.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "sim_card")
public class SimCard {
    private String  sim_card_no;
    @Id
    private Long mobile_no;
    private boolean status;
    private String state_of_registration;
    private boolean kyc;
    private String full_name;
    private Date expiry_date ;

    public SimCard() {
        super();
    }

    public SimCard(String sim_card_no, Long mobile_no, boolean status, String state_of_registration, boolean kyc, String full_name, Date expiry_date) {
        this.sim_card_no = sim_card_no;
        this.mobile_no = mobile_no;
        this.status = status;
        this.state_of_registration = state_of_registration;
        this.kyc = kyc;
        this.full_name = full_name;
        this.expiry_date = expiry_date;
    }

    public String getSim_card_no() {
        return sim_card_no;
    }

    public void setSim_card_no(String sim_card_no) {
        this.sim_card_no = sim_card_no;
    }

    public Long getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(Long mobile_no) {
        this.mobile_no = mobile_no;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getState_of_registration() {
        return state_of_registration;
    }

    public void setState_of_registration(String state_of_registration) {
        this.state_of_registration = state_of_registration;
    }

    public boolean isKyc() {
        return kyc;
    }

    public void setKyc(boolean kyc) {
        this.kyc = kyc;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }


}
