package day01;

import java.time.LocalDate;

public class Running {

    private double km;
    private LocalDate date;

    public Running(double km, LocalDate date) {
        this.km = km;
        this.date = date;
    }

    public double getKm() {
        return km;
    }

    public LocalDate getDate() {
        return date;
    }
}
