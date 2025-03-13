package ma.project.demo.web;



import ma.project.demo.entites.GpsCoordinate;
import ma.project.demo.repository.GpsCoordinateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/gps")
public class GpsController {
//dcs
    @Autowired
    private GpsCoordinateRepository gpsCoordinateRepository;

    @GetMapping("/coordinates")
    public List<GpsCoordinate> getCoordinates() {
        return gpsCoordinateRepository.findAllByOrderByIdDateAsc();
    }
}



