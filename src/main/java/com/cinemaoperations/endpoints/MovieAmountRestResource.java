package com.cinemaoperations.endpoints;

import com.cinemaoperations.models.MovieAmountModel; 
import com.cinemaoperations.services.MovieAmountService;
import com.cinemaoperations.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "movieamount")
public class MovieAmountRestResource {

    @Autowired
    private MovieAmountService movieAmountService;

    // http://localhost:8080/movieamount/getAll
    @CrossOrigin(origins = "http://localhost:1234")
    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MovieAmountModel> getAllMovieAmountRest() {
        return movieAmountService.getAllService();
    }

    // http://localhost:8080/movieamount/updateMovieData/{id}
    @CrossOrigin(origins = "http://localhost:1234")
    @PutMapping(path = "updateMovieData/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<String> updateSeatRest(@RequestBody MovieAmountModel movieAmountModel, @PathVariable int id) {
        boolean result = movieAmountService.updateService(movieAmountModel, id);
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body(SeatService.message);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(" failed to update ders!");
        }
    }

    // http://localhost:8080/movieamount/insertMovieData
    @CrossOrigin(origins = "http://localhost:1234")
    @PostMapping(path = "insertMovieData", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> insertMovieDataRest(@RequestBody MovieAmountModel movieAmountModel) {
        boolean result = movieAmountService.insertService(movieAmountModel);
        if (result) {
           return    ResponseEntity.status(HttpStatus.CREATED).body(movieAmountModel.getMovieName());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body( " failed to update ders!");
        }
    }

    //http://localhost:8080/movieamount/deleteById/{id}
    @CrossOrigin(origins = "http://localhost:1234")
    @DeleteMapping(path = "deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteRest(@PathVariable int id) {
        boolean isDeleted = true;
        MovieAmountModel movieAmountModel = new MovieAmountService().getByIdMovieDataService(id);
        if (movieAmountModel == null) {
            isDeleted = new MovieAmountService().deleteService(id);
        } else {
            boolean isDeletedMovieAmount = new MovieAmountService().deleteService(id);
            if (isDeletedMovieAmount) {
                System.out.println("MovieAmount could not be deleted" + isDeleted);
            }
        }
        System.out.println("is deleted : " + isDeleted);
        if (isDeleted) {
            return ResponseEntity.status(HttpStatus.OK).body("deleted");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("not Deleted!");
        }
    }
}
