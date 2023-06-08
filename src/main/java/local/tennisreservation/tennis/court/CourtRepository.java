package local.tennisreservation.tennis.court;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Tadeas Machacek
 */
@Repository
public interface CourtRepository extends JpaRepository<Court, Long> {
}
