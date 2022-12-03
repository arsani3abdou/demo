package fhtw.exam.demo.controller;

import fhtw.exam.demo.dto.Square;
import fhtw.exam.demo.service.SquareService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private SquareService service;

    public DemoController(SquareService service){
        this.service = service;
    }

    @GetMapping("/square")
    int getSquare(){
        return service.getSquareNumber();
    }

    @GetMapping("/square/{number}")
    int squareBy(@PathVariable int number){
        service.squareBy(number);
        //aenderung 2
        //33q34234
        //hallo
        return service.getSquareNumber();
    }

}
