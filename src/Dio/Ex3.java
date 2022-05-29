package Dio;

public class Ex3 {

    public class SingletonLazyHolder {


        private static class Holder {
            private static SingletonLazyHolder instancia = new SingletonLazyHolder();
        }
        private SingletonLazyHolder() {
            super();
        }

        public static SingletonLazyHolder getInstancia() {
            return instancia;
        }
    }
}
