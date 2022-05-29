package Dio;

public class Ex2 {
    public class SingletonEager {

        private static SingletonEager instancia = new SingletonEager();

        private SingletonEager() {
            super();
        }

        public static SingletonEager getInstancia() {

            return instancia;
        }
    }
}
