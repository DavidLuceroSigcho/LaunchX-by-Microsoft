package SemanaTwoJava.Miercoles;

public class HilosT extends Thread
{
    //Runnable
    @Override
    public void run() {
        System.out.println("El primer hilo se esta ejecutando");
    }
    /*
    public void start(){
        Iniciar la ejecucion de un hilo
        La JVM llamar al metodo run() del hilo}

    isAlive - Si esta Vivo
    getName - Nombre del Hilo
    getId - Regresa el id del hilo
    getPriority - Regresa la prioridad de hilo
    setPriority - Establecer la prioidad de hilo
    threa.State getState - Regresa el state del hilo
    join() - Espera a que el hilo se muera para entrar
    currentThread - Referencia al que se esta ejecutando
    sleep - Detiene de manera Temporal el numero especificado

    public static void main(String[] args)
    {
    //Entra al state new
        HilosT hilo1 = new HilosT();
        hilo1.start();
    }
    */
}

class HilosR implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("El hilo de runnable esta corriendo");
    }

    public static void main(String[] args)
    {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }
}