module Demo {
    // Alias para la secuencia de enteros
    sequence<int> IntSeq;

    interface Subscriber {
        // El Worker calcula los perfect numbers y los devuelve directamente
        IntSeq calculatePerfectNum(int minN, int maxN);

        // El Cliente recibe mensajes de estado (no necesita oneway)
        void onUpdate(string msg);

        // El Cliente pide un rango al Master
        void requestRange(int start, int end);

        // El Master devuelve los resultados al Cliente
        void displayResults(IntSeq numbers);
    };

    interface ClientCallback {
        // oneway solo en metodos que devuelven void
        oneway void perfectNumbersFound(IntSeq perfects, long timeMs);
    };

    interface Publisher {
        // Gestion de suscriptores
        int addSubscriber(Subscriber* o);
        int getNumSubs();
        void removeSubscriber(int id);

        // Divide el trabajo y devuelve un arreglo de int
        IntSeq beginSearch(int numWrks, int minN, int maxN);

        // Esta operacion es oneway y no devuelve nada
        oneway void requestPN(int minN, int maxN, ClientCallback* clientCB);
    };
};
