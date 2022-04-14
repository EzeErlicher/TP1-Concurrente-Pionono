public class Reviewer implements Runnable{

    public Buffer bufferInitial;
    public Buffer bufferValidated;

    /**Constructor**/
    public Reviewer(Buffer bufferInitial, Buffer bufferValidated){
        this.bufferInitial=bufferInitial;
        this.bufferValidated=bufferValidated;
    }

    @Override
    public void run(){
        while(true){

        }
    }
}
