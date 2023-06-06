package local.tennisreservation.tennis.reservation;

import local.tennisreservation.tennis.court.Court;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Tadeas Machacek
 */
public class Reservation {
    private final Long id;

    private static final AtomicLong ID_GENERATOR = new AtomicLong();
    private Integer timeOfReservation;

    private Court reservatedCourt;

    private Boolean isFourPlay;

    private Float finalPrice = 0f;

    public Reservation() {
        this.id = ID_GENERATOR.getAndIncrement();
    }

    public void setFinalPrice() {
        this.finalPrice = this.reservatedCourt.getPriceForCourt() * (this.isFourPlay ? 1.5f : 1);
    }

    public void setCourt(Court court) {
        this.reservatedCourt = court;
    }

    public void setTimeOfReservation(Integer time) {
        this.timeOfReservation = time;
    }

    public void setFourPlay(Boolean fourPlay) {
        this.isFourPlay = fourPlay;
    }

    public Integer getTimeOfReservation() {
        return this.timeOfReservation;
    }

    public Court getReservatedCourt() {
        return this.reservatedCourt;
    }

    public Boolean getFourPlay() {
        return this.isFourPlay;
    }

    public Float getFinalPrice() {
        return this.finalPrice;
    }
}
