package one.digitalinnovation.parking.controller;

import one.digitalinnovation.parking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingCotroller {

    @GetMapping
    public List<Parking> findAll() {
        var parking = new Parking();
        parking.setColor("vermelho");
        parking.setLicense("mss-12234");
        parking.setModel("vw glt");
        parking.setState("SP");
        return Arrays.asList(parking);

    }

}
