package com.driver.model;

import javax.persistence.*;

@Entity

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "TINYINT(1)")
    private boolean paymentCompleted;

    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;

    @OneToMany
    @JoinColumn
    private Reservation reservation;

    public Payment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPaymentCompleted() {
        return paymentCompleted;
    }

    public void setPaymentCompleted(boolean paymentCompleted) {
        this.paymentCompleted = paymentCompleted;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Payment(int id, boolean paymentCompleted, PaymentMode paymentMode) {
        this.id = id;
        this.paymentCompleted = paymentCompleted;
        this.paymentMode = paymentMode;



    }
}
