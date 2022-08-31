public class mainclass {
        public static void main(String[] args) {
                CreditCard[] wallet = new CreditCard[3];

                wallet[0] = new CreditCard("John Bowman", "California Savings",
                                "5391 0375 9387 5309", 5000);
                wallet[1] = new CreditCard("John Bowman", "California Federal",
                                "3485 0399 3395 1954", 3500);
                wallet[2] = new CreditCard("John Bowman", "California Finance",
                                "5391 0375 9387 5309", 2500, 300);

                for (CreditCard card : wallet) {
                        CreditCard.printSummary(card);
                        System.out.println('\n');
                }

        }
}