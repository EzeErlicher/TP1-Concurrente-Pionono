public class Main<T> {
    public void main(String[] args){

        //Creación de los objetos del tipo Buffer
        Buffer bufferInicial = new Buffer();
        Buffer bufferValidados = new Buffer();

        int cantCreadores = 4, cantRevisores = 2, cantConsumidores = 2;

        //Creación de arreglos del tipo Thread en base a la cantidad de actores de cada tipo (Caso base: 4 creadores, 2 revisores y 2 consumidores)
        Thread [] creators  = new Thread[cantCreadores];
        Thread [] reviewers = new Thread[cantRevisores];
        Thread [] consumers = new Thread[cantConsumidores];

        //Creación, asignación de nombres y lanzamiento de threads
        for (int i = 0; i < cantCreadores; i++ ) {
            creators[i] = new Thread(new Creator(bufferInicial),"Creador " + i);
            creators[i].start();
        }
        for (int i = 0; i < cantRevisores; i++ ) {
            reviewers[i] = new Thread(new Reviewer(bufferInicial, bufferValidados),"Revisor " + i);
            reviewers[i].start();
        }
        for (int i = 0; i < cantCreadores; i++ ) {
            reviewers[i] = new Thread(new Consumer(bufferValidados),"Consumidor " + i);
            consumers[i].start();
        }



    }
}
