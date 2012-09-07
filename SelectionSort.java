class SelectionSort {

   public static void main(String[] args) {

      int[] a = new int[10];

      a[0] = 8;
      a[1] = 4;
      a[2] = 1;
      a[3] = 9;
      a[4] = 10;
      a[5] = 2;
      a[6] = 7;
      a[7] = 3;
      a[8] = 5;
      a[9] = 6;      

      for(int i = 0; i < a.length; i++) {
         int min = 0;

         for(int j = i + 1; j < a.length; j++) {
            if(a[i] > a[j]) {
               min = a[i];
               a[i] = a[j];
               a[j] = min;
            }
         }
      System.out.println(a[i]);
      }
   }
}

