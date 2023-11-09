package com.example.rentalservice.dto.response;

import java.util.UUID;

public class PaymentResponse {
    private UUID paymentUid;
    private String status;
    private Integer price;

    public PaymentResponse(UUID paymentUid, String status, Integer price) {
        this.paymentUid = paymentUid;
        this.status = status;
        this.price = price;
    }

    public PaymentResponse() {
    }

    public UUID getPaymentUid() {
        return paymentUid;
    }

    public void setPaymentUid(UUID paymentUid) {
        this.paymentUid = paymentUid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

