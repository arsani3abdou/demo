package fhtw.exam.demo.service;

import fhtw.exam.demo.dto.Square;
import org.springframework.stereotype.Service;

@Service
public class SquareService {
    Square square = new Square();

    public void squareBy(int hochx){
        square.setSquareNumber(hochx);
    }
    public int getSquareNumber(){
        return square.getNumber();
    }
    //hier auch fertig gemacht
}
