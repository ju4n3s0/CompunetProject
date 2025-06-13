package client;

import Demo.ClientCallback;
import com.zeroc.Ice.Current;

import java.util.Arrays;

public class ClientCallbackImpl implements ClientCallback {
    @Override
    public void perfectNumbersFound(int[] perfects, long timeMs, Current __) {
        System.out.println("Callback perfectos=" + Arrays.toString(perfects)
                + " tiempo=" + timeMs + "ms");
    }
}
