import java.util.concurrent.TimeUnit;
import java.util.Random;
public class Creator  implements Runnable{

    private Buffer buffer;

    /*
        Constructor
     */
    public Creator(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {


    }

    public Data createData(String valor) {
        //Demora de la creación de datos
        try {
            Thread.sleep((long) (Math.random() * 10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Data data = new Data(generateRandomString());
        return data;
    }

    public void storeData (Data data){ //almacena dato en el buffer solo si hay espacio disponible
        if(buffer.hasSpace())
        {
            buffer.addData(data);
        }
        else{}
    }

    public String generateRandomString() {

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
}
