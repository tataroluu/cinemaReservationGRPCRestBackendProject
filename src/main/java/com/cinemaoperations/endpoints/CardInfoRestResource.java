package com.cinemaoperations.endpoints;

import com.cinemaoperations.models.CardInfoModel;
import com.cinemaoperations.services.CardInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "cardinfo")
public class CardInfoRestResource {

    @Autowired
    private CardInfoService service;

    // http://localhost:8080/cardinfo/getAll
    @CrossOrigin(origins = "http://localhost:1234")
    @GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CardInfoModel> getAllCardInfoRest() {
        return service.getAllService();
    }


}
