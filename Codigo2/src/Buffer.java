import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;
import static java.lang.Thread.sleep;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Buffer{
    private LinkedList<Data> queue;
    private ReadWriteLock lock1;

    public Buffer(){
        this.lock1=new ReentrantReadWriteLock();
        this.queue= new LinkedList<Data>();
    }

    public void addData(Data data){
        Long duration=(long)(Math.random()*10);
        try{
            sleep(duration);
        }catch (InterruptedException e){}
        if(hasSpace()){
            queue.add(data);
        }
    }

    /**Elimino la cabeza y la devuelvo (para usar en la lista de validados)**/
    public Data removeDataValidated(){
        Long duration1=(long)(Math.random()*10);
        try{
            sleep(duration1);
        }catch (InterruptedException e){}
        return queue.poll();
    }

    /**Elimino el dato específico que paso (para usar en la lista incial)**/
    public void removeDataDuplicated(Data data){
        Long duration2=(long)(Math.random()*10);
        try{
            sleep(duration2);
        }catch (InterruptedException e){}
        queue.remove(data);
    }

    public void validateData(Data data){
        Long duration3=(long)(Math.random()*10);
        try{
            sleep(duration3);
        }catch (InterruptedException e){}
        data.increaseReviews();
    }

    public boolean hasSpace(){
        try{
            return(queue.size()<100);
        } catch(NullPointerException e){
            return true;
        }

    }
}
