package local.tennisreservation.tennis;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Tadeas Machacek
 */
public class Court {
    private final Long id;
    private static final AtomicLong ID_GENERATOR = new AtomicLong();
    private final SurfaceType type;

    public Court(SurfaceType type) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.type = type;
    }

    public SurfaceType getType() {
        return type;
    }

    public Long getId() {
        return id;
    }

    public Float getPriceForCourt() {
        return this.type.getPricePerMinute();
    }
}
