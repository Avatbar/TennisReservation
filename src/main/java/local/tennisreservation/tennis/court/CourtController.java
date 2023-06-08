package local.tennisreservation.tennis.court;

import org.springframework.beans.factory.annotation.Autowired;
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
    private final CourtService courtService;

    @Autowired
    public CourtController(CourtService courtService) {
        this.courtService = courtService;
    }

    @GetMapping
    public List<Court> getCourts() {
        return courtService.getCourts();
    }
}
