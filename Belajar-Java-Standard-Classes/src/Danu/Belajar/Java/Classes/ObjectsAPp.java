package Danu.Belajar.Java.Classes;

import java.util.Objects;

public class ObjectsAPp {
    public static class Data{
        private String data;

        public Data(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data data1 = (Data) o;

            return Objects.equals(data, data1.data);
        }

        @Override
        public int hashCode() {
            return data != null ? data.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        excecute(new Data("elo"));
    }

    public static void excecute(Data data){

            System.out.println(Objects.toString(data));
            System.out.println(Objects.hashCode(data));


    }
}
