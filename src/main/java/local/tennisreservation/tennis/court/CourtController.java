package local.tennisreservation.tennis.court;

import local.tennisreservation.tennis.court.Court;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tadeas Machacek
 */
@RestController
@RequestMapping(path = "api/v1/court")
public class CourtController {
    @GetMapping("/")
    public List<Court> getCourts() {
        return null;
    }
}
