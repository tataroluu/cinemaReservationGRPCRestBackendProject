package com.cinemaoperations.endpoints;

import com.cinemaoperations.models.SalesMovieModel;
import com.cinemaoperations.services.SalesMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "salesmovie")
public class SalesMovieRestResource {

    @Autowired
    private SalesMovieService service;

    // http://localhost:8080/salesmovie/getAll
    @CrossOrigin(origins = "http://localhost:1234")
    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SalesMovieModel> getAllMovieAmountRest() {
        return service.getAllService();
    }

    // http://localhost:8080/salesmovie/insert
    @CrossOrigin(origins = "http://localhost:1234")
    @PostMapping(path = "insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> insertSalesMovieRest(@RequestBody SalesMovieModel salesMovieModel) {
        boolean result = service.insertService(salesMovieModel);
        if (result) {
            return    ResponseEntity.status(HttpStatus.CREATED).body(salesMovieModel.getMovieName());
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body( " failed to update salesMovie!");
        }
    }

    //http://localhost:8080/salesmovie/deleteById/{id}
    @CrossOrigin(origins = "http://localhost:1234")
    @DeleteMapping(path = "deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteRest(@PathVariable int id) {
        boolean isDeleted = true;
        SalesMovieModel salesMovieModel = new  SalesMovieService().getByIdService(id);
        if (salesMovieModel == null) {
            isDeleted = new SalesMovieService().deleteService(id);
        } else {
            boolean isDeletedSalesMovie  = new SalesMovieService().deleteService(id);
            if (isDeletedSalesMovie) {
                System.out.println("SalesMovie could not be deleted" + isDeleted);
            }
        }
        System.out.println("is deleted : " + isDeleted);
        if (isDeleted) {
            return ResponseEntity.status(HttpStatus.OK).body("deleted");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("not Deleted!");
        }
    }

    //http://localhost:8080/salesmovie/cancelById/{id}
    @CrossOrigin(origins = "http://localhost:1234")
    @PutMapping(path = "cancelById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> cancelRest(@PathVariable int id) {
        boolean isCanceled = true;
        SalesMovieModel salesMovieModel = new SalesMovieService().getByIdService(id);
        if (salesMovieModel == null) {
            isCanceled = new SalesMovieService().cancelService(id);
        } else {
            boolean isCanceledSalesMovie = new SalesMovieService().cancelService(id);
            if (isCanceledSalesMovie) {
                System.out.println("SalesMovie could not be deleted" + isCanceled);
            }
        }
        System.out.println("is deleted : " + isCanceled);
        if (isCanceled) {
            return ResponseEntity.status(HttpStatus.OK).body("canceled");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("not canceled!");
        }
    }

    // http://localhost:8080/salesmovie/getAllCanceled
    @CrossOrigin(origins = "http://localhost:1234")
    @GetMapping(path = "getAllCanceled", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SalesMovieModel> getAllCanceledMovieAmountRest() {
        return service.getAllCanceledService();
    }

    //http://localhost:8080/salesmovie/changedAllCanceled
    @CrossOrigin(origins = "http://localhost:1234")
    @PutMapping(path = "changedAllCanceled", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> changedCanceled() {
        boolean isCanceled = true;
        List<SalesMovieModel> salesMovieModel = new SalesMovieService().getAllCanceledService();
        if (salesMovieModel == null) {
            isCanceled = new SalesMovieService().changedCanceledService();
        } else {
            boolean isChangedCanceledSalesMovie = new SalesMovieService().changedCanceledService();
            if (isChangedCanceledSalesMovie) {
                System.out.println("All Changed SalesMovie Data could not be deleted" + isCanceled);
            }
        }
        System.out.println("is deleted : " + isCanceled);
        if (isCanceled) {
            return ResponseEntity.status(HttpStatus.OK).body("All Changed SalesMovie Data");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("not changed!");
        }
    }

    //http://localhost:8080/salesmovie/deletedAllCanceled/
    @CrossOrigin(origins = "http://localhost:1234")
    @DeleteMapping(path = "deletedAllCanceled", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deletedAllCanceledById() {
        boolean isDeletedAll = true;
         boolean salesMovieModel = new SalesMovieService().deletedAllCanceledService();
        if (salesMovieModel == true) {
            isDeletedAll = new SalesMovieService().deletedAllCanceledService();
        } else {
            boolean isDeletedAllCanceledSalesMovie = new SalesMovieService().deletedAllCanceledService();
            if (isDeletedAllCanceledSalesMovie) {
                System.out.println(" All Canceled SalesMovie Data could not be deleted" + isDeletedAll);
            }
        }
        System.out.println("is deleted : " + isDeletedAll);
        if (isDeletedAll) {
            return ResponseEntity.status(HttpStatus.OK).body("All Deleted SalesMovie Data");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("not deleted!");
        }
    }

}

