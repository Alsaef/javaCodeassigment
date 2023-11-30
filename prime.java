public static void main(String[] args){
  int i,n,temp;
  boolean isPrime=true;
 Scanner sc= new Scanner(System.in) ;
  
// System.out.print("enter number");
 
 n= sc.nextInt();
 for (i=2;i<=n/2 ;i++ ) {
   
   temp = n%i;
   
   if (temp == 0){
     isPrime=false;
     break;
   } 
   
 }
 if(isPrime){
   System.out.println("prime number "+n);
 }
 else{
    System.out.println("not prime number");
 }
 
}

}
