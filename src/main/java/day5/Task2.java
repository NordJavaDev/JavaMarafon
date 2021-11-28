package day5;


public class Task2 {
    public static void main(String[] args) {
        Motobike bike = new Motobike("R1", "yellow", 2015);
        bike.getInfoMoto();
    }

    static class Motobike {
        private String model;
        private String color;
        private int year;

        public Motobike(String model, String color, int year) {
            this.model = model;
            this.color = color;
            this.year = year;
        }

        public void getInfoMoto() {
            System.out.println("Характеристики мото: " + model + ", " + color + ", " + year);
        }
    }
}
