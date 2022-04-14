public class Data  {
    private String value;
    private int reviews;

    //Constructor
    public Data (String value){
        this.reviews = 0;
        this.value = value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public void increaseReviews() {
        this.reviews = this.reviews++;
    }

    public String getValue() {
        return value;
    }

    public int getReviews() {
        return reviews;
    }
}