package day5;

public class Task1 {
    public static void main(String[] args) {
        Car vw = new Car();
        vw.setModel("Touareg");
        vw.setColor("black");
        vw.setYear(2008);
        vw.autoCharacteristics();

    }

    static class Car {
        private String model;
        private String color;
        private int year;

        public void setModel(String myModel) {
            model = myModel;
        }

        public void setColor(String myColor) {
            color = myColor;
        }

        public void setYear(int myYear) {
            year = myYear;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getYear() {
            return year;
        }

        void autoCharacteristics() {
            System.out.println("Модель авто: " + model);
            System.out.println("Цвет авто: " + color);
            System.out.println("год выпуска авто: " + year);
        }
    }
}
