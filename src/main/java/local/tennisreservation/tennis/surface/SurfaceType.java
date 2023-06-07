package local.tennisreservation.tennis.surface;

import jakarta.persistence.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Tadeas Machacek
 */
@Entity
@Table
public class SurfaceType {
    @Id
    @SequenceGenerator(
            name = "surface_type_sequence",
            sequenceName = "surface_type_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "surface_type_sequence"
    )

    private Long id;
    private static final AtomicLong ID_GENERATOR = new AtomicLong();

    private String typeOfSurface;

    private Float pricePerMinute;

    public SurfaceType() {
    }

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