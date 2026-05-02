class AssignNo4 {
    public static void main(String[] args) {
        // ======================== (MAGIC SQUARE) ======================== //
        
        int[][] A = {
            {2,7,6},
            {9,5,1},
            {4,3,8}
        };


        int n = A.length;
        int sum = 0;


        for (int j = 0; j < n; j++) sum += A[0][j];


        boolean IsMagic = true;


        for (int i = 0; i < n; i++) {
            int RowSum = 0;
            for (int j = 0; j < n; j++) RowSum += A[i][j];
            if (RowSum != sum) IsMagic = false;
        }


        for (int j = 0; j < n; j++) {
            int ColSum = 0;
            for (int i = 0; i < n; i++) ColSum += A[i][j];
            if (ColSum != sum) IsMagic = false;
        }


        int DiagonalSum = 0, ReverseDiaSum = 0;


        for (int i = 0; i < n; i++) {
            DiagonalSum += A[i][i];
            ReverseDiaSum += A[i][n - i - 1];
        }


        if (DiagonalSum != sum || ReverseDiaSum != sum)
            IsMagic = false;


        if (IsMagic)
            System.out.println("Magic Square Matrix");
        else
            System.out.println("Not Magic Square Matrix");
        
    }
}