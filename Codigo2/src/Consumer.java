public class Consumer implements Runnable {

    public Buffer bufferInitial;
    public Buffer bufferValidated;

    /**Constructor**/
    public Consumer(Buffer bufferInitial, Buffer bufferValidated){
        this.bufferInitial=bufferInitial;
        this.bufferValidated=bufferValidated;
    }

    @Override
    public void run(){
        while(true){
            try {
                bufferInitial.removeDataDuplicated(bufferValidated.removeDataValidated());
            } catch (Exception e){
                //System.out.println("Vacio - nada para consumir");
            }
        }
    }
}
