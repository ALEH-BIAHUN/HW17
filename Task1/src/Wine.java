public class Wine {
    private String mark;
    private String color;
    private String country;
    private String descriptionOfTheWine;
    private int yearOfBottling;

    public Wine() {
    }

    public Wine(String mark, String color, String country, String descriptionOfTheWine, int yearOfBottling) {
        this.mark = mark;
        this.color = color;
        this.country = country;
        this.descriptionOfTheWine = descriptionOfTheWine;
        this.yearOfBottling = yearOfBottling;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescriptionOfTheWine() {
        return descriptionOfTheWine;
    }

    public void setDescriptionOfTheWine(String descriptionOfTheWine) {
        this.descriptionOfTheWine = descriptionOfTheWine;
    }

    public int getYearOfBottling() {
        return yearOfBottling;
    }

    public void setYearOfBottling(int yearOfBottling) {
        this.yearOfBottling = yearOfBottling;
    }
}