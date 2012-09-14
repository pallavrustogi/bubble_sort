class sort_task {

   public static void main(String[] args) {
       int a[] = new int[10];
       a[0] = 6;
       a[1] = 4;
       a[2] = 5;
       a[3] = 2;
       a[4] = 8;
       a[5] = 1;
       a[6] = 3;
       a[7] = 10;
       a[8] = 9;
       a[9] = 7;
  
       for(int i = 0; i <= a.length - 1; i++) {

          for(int j = a.length - 1; j > i; j--) {

             if(a[j-1] > a[j]) {
	        int tmp = a[j];
	        a[j] = a[j-1];
	        a[j-1] = tmp;
	     }
          }
       System.out.println(a[i]);
       }
   }
}

