import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import java.util.concurrent.*;
import com.zeroc.Ice.Current;



package Demo;

import com.zeroc.Ice.Current;
import java.util.*;
import Demo.SubscriberPrx;
import Demo.ClientCallbackPrx;

/**
 * Implementación del servicio Publisher definido en App.ice
 */
public class PublisherI implements Publisher {
    // Mapa para llevar a los suscriptores registrados
    private final Map<Integer, SubscriberPrx> subscribers = new HashMap<>();
    private int nextId = 1;

    /**
     * Añade un nuevo suscriptor y devuelve su ID
     */
    @Override
    public int addSubscriber(SubscriberPrx o, Current __current) {
        int id = nextId++;
        subscribers.put(id, o);
        System.out.println("Subscriber added with id " + id);
        return id;
    }

    /**
     * Devuelve el número actual de suscriptores
     */
    @Override
    public int getNumSubs(Current __current) {
        return subscribers.size();
    }

    /**
     * Elimina al suscriptor con el ID dado
     */
    @Override
    public void removeSubscriber(int id, Current __current) {
        subscribers.remove(id);
        System.out.println("Subscriber removed: id=" + id);
    }

    /**
     * Distribuye el trabajo entre n workers y reúne los resultados
     */
    @Override
    public int[] beginSearch(int numWrks, int minN, int maxN, Current __current) {
        // Aquí deberías invocar a tus Workers, por ejemplo:
        // WorkerPrx worker = ... obtener proxy
        // int[] parcial = worker.searchRange(min, max);
        // y luego combinar los arrays
        // Para demo, devolvemos un array vacío:
        return new int[0];
    }

    /**
     * Solicita el cálculo de números perfectos y notifica vía callback
     */
    @Override
    public void requestPN(int minN, int maxN, ClientCallbackPrx clientCB, Current __current) {
        long start = System.currentTimeMillis();
        // Lógica de cálculo de perfectNumbers...
        int[] perfects = new int[]{ /* ...*/ };
        long elapsed = System.currentTimeMillis() - start;

        // Invoca la callback oneway
        clientCB.perfectNumbersFound(perfects, elapsed);
    }
}
