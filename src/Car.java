public class Car {
    private String carName;
    private int oldYear;
    private String country;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getOldYear() {
        return oldYear;
    }

    public void setOldYear(int oldYear) {
        this.oldYear = oldYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return
                "\nCar Name: " + carName +
                "\nOld Year: " + oldYear +
                "\n Car Of By Year: " + country ;
    }
}
