package com.cinemaoperations.endpoints;

import com.cinemaoperations.models.SeatModel;
import com.cinemaoperations.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(value = "seat")
public class SeatRestResource {


    @Autowired
    private SeatService seatService;

    // http://localhost:8080/seat/getAll
    @CrossOrigin(origins = "http://localhost:1234")
    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SeatModel> getAllSeatRest() {
        return seatService.getAllService();
    }

    // http://localhost:8080/seat/updateSeat/{id}
     @CrossOrigin(origins = "http://localhost:1234")
    @PutMapping(path = "updateSeat/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateSeatRest(@RequestBody SeatModel seatModel, @PathVariable int id) {
        boolean result = seatService.updateService(seatModel, id);
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(SeatService.message);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(" failed to update ders!");
        }
    }

}
