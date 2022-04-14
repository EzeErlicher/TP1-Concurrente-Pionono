/*
@Clase: Buffer
Modela el comportamiento de un Buffer de capacidad 100
 */
import java.util.ArrayList;

public class Buffer {
    private static ArrayList<Data> datos= new ArrayList<>(100);
    private boolean available = false;
    public Buffer(){

    }

    public void addData(Data data){
        datos.add((data));
    }

    public void removeData(int index){
        datos.remove(index);
    }

    public Data getData(int index){
        return datos.get(index);
    }

    public int getCurrentSize(){
        return datos.size();
    }
    public boolean hasSpace(){
        if(datos.size()<100){
            return true;
        }
        else {
            return false;
        }
    }

}
