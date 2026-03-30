public class Array {
    public static void main(String[] args) {
        int a = 100;
        int b = 60;

        int[] subjectwiseresult1 = {100, 60, 89, 50, 65};
        int subjectwiseresult2[] = {100, 60, 89, 50, 65};

        int[] subjectwiseresult3 = new int[5];

        // for(int i = 0; i<5; i++){
        //     System.out.println(subjectwiseresult1[i]);
        // }

        for(int mark : subjectwiseresult3){
            System.out.println(mark);
        }

        String[][] seats = {
            {"A1", "B1", "C1", "D1"},
            {"A2", "B2", "C2", "D2"}
        };

        for(String[] row : seats){
            for(String seat : row){
                System.out.println(seat);
            }
        }
    }
}
