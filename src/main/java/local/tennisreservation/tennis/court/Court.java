package local.tennisreservation.tennis.court;

import jakarta.persistence.*;
import local.tennisreservation.tennis.surface.SurfaceType;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Tadeas Machacek
 */
@Entity
@Table(name = "court_table")
public class Court {
    @Id
    @SequenceGenerator(
            name = "court_sequence",
            sequenceName = "court_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "court_sequence"
    )
    private  Long id;
    private static final AtomicLong ID_GENERATOR = new AtomicLong();

    @OneToOne
    @JoinColumn(name = "surface_id", referencedColumnName = "id")
    private SurfaceType type;

    private String name;

    public Court() {
    }
    public Court(String name, SurfaceType type) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.type = type;
        this.name = name;
    }

    public SurfaceType getType() {
        return type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getPriceForCourt() {
        return this.type.getPricePerMinute();
    }
}
