package local.tennisreservation.tennis.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Tadeas Machacek
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
