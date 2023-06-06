package local.tennisreservation.tennis.surface;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Tadeas Machacek
 */
public class SurfaceType {
    private final Long id;
    private static final AtomicLong ID_GENERATOR = new AtomicLong();

    private final String typeOfSurface;

    private Float pricePerMinute;

    public SurfaceType(String typeOfSurface, Float price) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.typeOfSurface = typeOfSurface;
        this.pricePerMinute = price;
    }

    public SurfaceType(Long id, String typeOfSurface, Float price) {
        this.id = id;
        this.typeOfSurface = typeOfSurface;
        this.pricePerMinute = price;
    }

    public void setPricePerMinute(float newPrice) {
        if (newPrice <= 0) {
            return;
        }

        this.pricePerMinute = newPrice;
    }

    public Float getPricePerMinute() {
        return pricePerMinute;
    }

    public String getTypeOfSurface() {
        return typeOfSurface;
    }

    public Long getId() {
        return id;
    }
}