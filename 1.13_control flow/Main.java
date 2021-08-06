class Main {
  public static void main(String[] args) {
    // int x = 1;
    // int y = 1;
    // System.out.println(x == y);// equality operator//true
    // System.out.println(x != y);// inequality operator

    // logical operator
    // int temperature = 20;
    // boolean isWarm = temperature > 15 && temperature > 10;// true
    // System.out.println(isWarm);

    // boolean hasHighIncome = false;
    // boolean hasGoodCredit = true;
    // boolean hasCriminalRecord = false;
    // boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    // System.out.println(isEligible);

    // if statements
    // int temp = 35;
    // if (temp > 30) {
    // System.out.println("its too hot");
    // } else if (temp > 20) {
    // System.out.println("its beautiful day");
    // } else {
    // System.out.println("its a cold day");
    // }

    // simplifying if statement

    // int income = 120_000;
    // boolean hasHighIncome = (income > 100_000);
    // System.out.println(hasHighIncome);

    // ternary operator
    // int income = 120_000;
    // String className = income > 100_000 ? "First" : "Economy";
    // System.out.println(className);

    // switch statements
    String role = "moderator";
    switch (role) {
      case "admin":
        System.out.println("you are admin");
        break;
      case "moderator":
        System.out.println("you are user");
        break;
      default:
        System.out.println("you are guest");

    }
  }
}