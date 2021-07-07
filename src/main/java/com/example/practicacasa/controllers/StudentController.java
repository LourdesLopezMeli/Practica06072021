package com.example.practicacasa.controllers;

import com.example.practicacasa.dtos.request.StudentRequestDto;
import com.example.practicacasa.dtos.response.StudentResponseDto;
import com.example.practicacasa.handlers.StudentHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/averages")
public class StudentController {

    @PostMapping("/students")
    public ResponseEntity<StudentResponseDto> getAverages(@RequestBody StudentRequestDto student) {
        StudentResponseDto studentResponseDto = new StudentResponseDto(
                StudentHandler.getMessage(student.getAssigments()),
                StudentHandler.getAverage(student.getAssigments()),
                student.getName()
        );

        return new ResponseEntity<>(studentResponseDto, HttpStatus.OK);

    }
}
