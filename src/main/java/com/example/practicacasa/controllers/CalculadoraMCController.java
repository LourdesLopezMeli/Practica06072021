package com.example.practicacasa.controllers;

import com.example.practicacasa.dtos.request.HouseRequestDto;
import com.example.practicacasa.dtos.response.HouseResponseDto;
import com.example.practicacasa.handlers.HouseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
//@RequestMapping("/house")
public class CalculadoraMCController {

    @PostMapping("/properties")
    public ResponseEntity<HouseResponseDto> getHouseProperties(@Valid @RequestBody HouseRequestDto house) {
        HouseResponseDto houseResponseDto = new HouseResponseDto(
                HouseHandler.getSizeHouse(house.getRooms()),
                HouseHandler.getValueOfHouse(house.getRooms()),
                HouseHandler.getBiggestRoom(house.getRooms()),
                HouseHandler.getRooms(house.getRooms())
        );

        return new ResponseEntity<>(houseResponseDto, HttpStatus.OK);
    }
}
