public class Reviewer implements Runnable {

    private Buffer buffer0;
    private Buffer buffer1;

    public Reviewer(Buffer buffer0, Buffer buffer1){
        this.buffer0 = buffer0;
        this.buffer1 = buffer1;
    }

    public void verifyData(Data data)
    {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        data.increaseReviews();
    }
    @Override
    public void run() {

    }
}
