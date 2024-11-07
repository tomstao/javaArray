//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] cars = {"Camaro", "Honda","Tesla"};
        System.out.println(cars[2]);
        String[] cars_2 = new String[4];
        cars_2[0] = "Camaro";
        cars_2[1] = "Honda";
        cars_2[2] = "Tesla";
        cars_2[3] = "Benz";
        for (String s : cars_2) {
            System.out.println(s);
        }

        System.out.println("**************************************");
        System.out.println("2D array");

        String[][] cars_3 = new String[3][3];
        cars_3[0][0] = "Camaro";
        cars_3[0][1] = "Corvette";
        cars_3[0][2] = "Silverado";
        cars_3[1][0] = "Mustang";
        cars_3[1][1] = "Ranger";
        cars_3[1][2] = "F-150";
        cars_3[2][0] = "Ferrari";
        cars_3[2][1] = "Lambo";
        cars_3[2][2] = "Tesla";
        for(int i = 0; i < cars_3.length; i++) {
            for(int j = 0; j < cars_3[i].length; j++) {
                System.out.println(cars_3[i][j] + " Coordinate: " + "[" + i + ", " + j + "]");
            }
        }

    }
}