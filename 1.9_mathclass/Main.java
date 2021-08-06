class Main {
  public static void main(String[] args) {
    int result = Math.round(1.6F);// 1
    int result1 = (int) Math.ceil(1.1F);// 2
    int result2 = (int) Math.floor(1.6F);// 2
    int result3 = (int) Math.max(1, 2);// 2
    int result4 = (int) Math.min(1, 2);//1
    int result5 = (int) (Math.random()*100);
    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
  }
}