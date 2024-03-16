package PZN.Generic.Application;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(2l);

//        NumberData<String> stringNumberData = new NumberData<String>("Kiss"); Error karena NumberData di khususkan untuk number

    }

    public static class NumberData<T extends  Number > {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }
        public T getData() {
            return data;
        }
        public void setData(T data) {
            this.data = data;
        }



    }
}
