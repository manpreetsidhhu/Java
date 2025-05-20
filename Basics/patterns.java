public class patterns {
    public static void main(String[] args) {
        //1st pattern 
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        System.out.println("Rectangular pattern:");
        int a = 4, b = 6;
        for(int i = 0; i < a; i++){
            for(int j = 0; j<b;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd pattern 
        // * * * * *
        // *       *
        // *       *
        // * * * * *
        System.out.println("Hollow Rectangle:");
        a = 4; b = 6;
        for(int i = 0; i < a; i++){
            for(int j = 0; j<b;j++){
                if(i == 0 || j==0 || i == a-1 || j==b-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //3rd pattern 
        // * 
        // * *
        // * * *
        // * * * * 
        // * * * * *
        System.out.println("Half Pyramid:");
        a = 5;
        for(int i = 0; i < a; i++){
            for(int j = 0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //4th pattern 
        //       * 
        //     * * * 
        //   * * * * * 
        // * * * * * * * 
        System.out.println("Pyramid:");
        a = 4;
        int sum = 1;
        for(int i = 0; i < a; i++){
            for(int k = a-i; k>1 ; k--){
                System.out.print("  ");
            }
            for(int j = 0; j<sum;j++){
                System.out.print("* ");
            }
            sum+=2;
            System.out.println();
        }
        //5th pattern 
        //       * 
        //     * *
        //   * * *
        // * * * *
        System.out.println("Mirrored Half Pyramid:");
        a = 4;
        for(int i = 0; i < a; i++){
            for(int k = a-i; k>1;k--){
                System.out.print("  ");
            } for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //6th pattern
        // * * * * 
        // * * * 
        // * * 
        // * 
        System.out.println("Inverted half Pyramid:");
        a = 4;
        for(int i = 0; i < a; i++){
            for(int j =a-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        //7th pattern
        // * * * * 
        //   * * * 
        //     * * 
        //       * 
        System.out.println("Inverted Mirrored half pyramid:");
        a = 4;
        for(int i = 0; i < a; i++){
            for(int k =0;k<i;k++){
                System.out.print("  ");
            } for(int j=a-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        //8th pattern
        // * * * *
        // *     * 
        // * * * * 
        // *     *
        // *     *
        System.out.println("Alphabet A:");
        a = 4;
        for(int i = 0; i < a+1; i++){
            for(int j=0;j<a;j++){
                if(i== 0 || j==0 || j==a-1){
                    System.out.print("* ");
                } else if(i==a/2){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}