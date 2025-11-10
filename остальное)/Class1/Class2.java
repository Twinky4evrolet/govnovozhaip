public class Class2{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  int x = scanner.nextInt();
  int y = scanner.nextInt();
  int[] mass1 = new int[x];
  int[] mass2 = new int[y];
  for (int i = 0; i < x; i++){
   int newchislo = scanner.nextInt();
   mass1[i] = newchislo;
  }
  for (int i = 0; i < y; i++){
   int newchislo = scanner.nextInt();
   mass2[i] = newchislo;
  }
  if (mass1.length != mass2.length){
   System.out.println("не равно, ты лох");
  }else{
   for(int i = 0; i < mass1.length; i++){
    if (mass1[i] == mass2[i]){
     System.out.println("равны");
    } else {
     System.out.println("не равныы");
    }
   }
  }
 }
}
