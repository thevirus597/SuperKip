package sr.unasat.kip.entities;

import java.time.LocalDate;

public class VerpakteKip {
    private int labelNumber;
    private double weight;
    private LocalDate expirationDate;

    public VerpakteKip(int labelNumber, double weight, LocalDate expirationDate) {
        this.labelNumber = labelNumber;
        this.weight = weight;
        this.expirationDate = expirationDate;
    }

    public int getLabelNumber() {
        return labelNumber;
    }

    public void setLabelNumber(int labelNumber) {
        this.labelNumber = labelNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "VerpakteKip{" +
                "labelNumber=" + labelNumber +
                ", weight=" + weight +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
