public class Cow {
    private int cowCode;
    private String cowBreed;
    private int cowAgeYear;
    private int cowAgeMonth;

    Cow(int code,String breed,int ageYear,int ageMonth){
        cowCode = code;
        cowBreed = breed;
        cowAgeYear = ageYear;
        cowAgeYear = ageMonth;
    }

    public int getCowCode() {
        return cowCode;
    }
    public void setCowCode(int cowCode) {
        this.cowCode = cowCode;
    }
    public String getCowBreed() {
        return cowBreed;
    }
    public void setCowBreed(String cowBreed) {
        this.cowBreed = cowBreed;
    }

    public int getCowAgeYear() {
        return cowAgeYear;
    }

    public void setCowAgeYear(int cowAgeYear) {
        this.cowAgeYear = cowAgeYear;
    }

    public int getCowAgeMonth() {
        return cowAgeMonth;
    }

    public void setCowAgeMonth(int cowAgeMonth) {
        this.cowAgeMonth = cowAgeMonth;
    }
    
}
