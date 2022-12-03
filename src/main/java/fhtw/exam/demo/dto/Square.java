package fhtw.exam.demo.dto;
import java.lang.Math;

public class Square {
    private int number;

    public int getNumber() {
        return number;
    }
//funktion fertig
    public void setSquareNumber(int number) {
        this.number = (int) Math.sqrt(number);
    }
}
