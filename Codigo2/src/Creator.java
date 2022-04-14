import java.util.Random;

public class Creator implements Runnable{

    public Buffer bufferInitial;

    /**Constructor**/
    public Creator(Buffer bufferInitial){
        this.bufferInitial=bufferInitial;
    }

    private String generateRandomString() {

        int leftLimit = 97; // 'a'
        int rightLimit = 122; // 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    @Override
    public void run(){
        while(true){
            System.out.printf(Thread.currentThread().getName()+" creating data \n");
            bufferInitial.addData(new Data(this.generateRandomString()));
        }
    }
}
