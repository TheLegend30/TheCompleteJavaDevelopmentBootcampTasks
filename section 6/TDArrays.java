public class TDArrays {
    public static void main(String[] args) {
        int[][] grades = new int[3][4];
        grades[0] = new int[] { 72, 74, 78, 76 };
        grades[1] = new int[] { 69, 34, 420, 80085 };
        grades[2] = new int[] { 228, 777, 666, 1488 };

        for (int i = 0; i < grades.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("\tHarry: ");
                    break;
                case 1:
                    System.out.print("\tRon: ");
                    break;
                case 2:
                    System.out.print("\tHermione: ");
                    break;
            }
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
