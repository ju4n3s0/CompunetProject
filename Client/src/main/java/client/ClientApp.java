package client;

import com.zeroc.Ice.Communicator;
import com.zeroc.Ice.Util;
import Demo.PublisherPrx;
import Demo.ClientCallbackPrx;
import com.zeroc.Ice.ObjectAdapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClientApp {
    public static void main(String[] args) {
        try (Communicator ic = Util.initialize(args, "client.cfg")) {
            ObjectAdapter adapter = ic.createObjectAdapter("");
            ClientCallbackImpl cbimpl = new ClientCallbackImpl();
            // registra el servant y obtiene su proxy
            ClientCallbackPrx cbPrx = ClientCallbackPrx.uncheckedCast(
                    adapter.add(cbimpl, Util.stringToIdentity("cb"))
            );
            adapter.activate();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Inicio: "); int start = Integer.parseInt(br.readLine());
            System.out.print("Fin:   ");   int end   = Integer.parseInt(br.readLine());

            PublisherPrx master = PublisherPrx.checkedCast(ic.propertyToProxy("publisher.proxy"));
            if (master == null) {
                System.err.println("No pude conectar con el maestro.");
                return;
            }

            // Lanza el job y espera el callback
            master.requestPN(start, end, cbPrx);

            // bloqueamos el main para no salir inmediatamente
            System.out.println("Esperando callback...");
            Thread.sleep(10_000);
            adapter.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
