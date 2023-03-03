public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;

        double[] weight = {1.57, 7.654, 9.986};

        int[] redBox = new int[6];
        redBox[0] = 12;
        int books = redBox[0];
        redBox[1] = 1;
        int fails = redBox[1];
        redBox[2] = 22;
        int pens = redBox[2];
        redBox[3] = 43;
        int glass = redBox[3];
        redBox[4] = 4;
        int forms = redBox[4];
        redBox[5] = 222;
        int pencil = redBox[5];
    }


    public static void task2() {
        System.out.println("Задача 2");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + ", " );
        }
        System.out.println();

        double[] weight = {1.57, 7.654, 9.986};
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i] + ", " );
        }
        System.out.println();

        int[] redBox = new int[6];
        redBox[0] = 12;
        int books = redBox[0];
        redBox[1] = 1;
        int fails = redBox[1];
        redBox[2] = 22;
        int pens = redBox[2];
        redBox[3] = 43;
        int glass = redBox[3];
        redBox[4] = 4;
        int forms = redBox[4];
        redBox[5] = 222;
        int pencil = redBox[5];
        for (int i = 0; i < redBox.length; i++) {
            System.out.print(redBox[i] + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i =weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i] + ", " );
        }
        System.out.println();

        double[] weight = {1.57d, 7.654d, 9.986d};
        for (int i = weight.length -1; i >= 0; i--) {
            System.out.print(weight[i] + ", " );
        }
        System.out.println();

        int[] redBox = new int[6];
        redBox[0] = 12;
        int books = redBox[0];
        redBox[1] = 1;
        int fails = redBox[1];
        redBox[2] = 22;
        int pens = redBox[2];
        redBox[3] = 43;
        int glass = redBox[3];
        redBox[4] = 4;
        int forms = redBox[4];
        redBox[5] = 222;
        int pencil = redBox[5];
        for (int i = redBox.length -1; i >=0; i--) {
            System.out.print(redBox[i] + ", " );
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i =0; i < weights.length; i= i +1) {
            if(weights[i]%2==0)
            System.out.print(weights[i] + ", ");
        }
    }
}