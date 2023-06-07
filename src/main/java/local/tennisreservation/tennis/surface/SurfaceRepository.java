package local.tennisreservation.tennis.surface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Tadeas Machacek
 */
@Repository
public interface SurfaceRepository extends JpaRepository<SurfaceType, Long> {
}
