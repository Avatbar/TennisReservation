package local.tennisreservation.tennis.surface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tadeas Machacek
 */
@RestController
@RequestMapping(path = "api/v1/surface")
public class SurfaceTypeController {
    private final SurfaceTypeService surfaceTypeService;

    @Autowired
    public SurfaceTypeController(SurfaceTypeService surfaceTypeService) {
        this.surfaceTypeService = surfaceTypeService;
    }
    @GetMapping
    public List<SurfaceType> getSurfaces() {
        return surfaceTypeService.getSurfaces();
    }
}