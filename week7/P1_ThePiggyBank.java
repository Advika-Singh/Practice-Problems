public class P1_ThePiggyBank {

    static class PiggyBank {
        private final String id;
        private int savings;

        public PiggyBank(String id) {
            this.id = id;
            this.savings = 0;
        }

        public void deposit(int amount) {
            if (amount <= 0) {
                System.out.println("Deposit rejected: amount must be positive");
                return;
            }
            savings += amount;
        }

        public void withdraw(int amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal rejected: amount must be positive");
                return;
            }
            if (amount > savings) {
                System.out.println("Withdrawal rejected: insufficient savings");
                return;
            }
            savings -= amount;
        }

        public int getSavings() {
            return savings;
        }

        public String getId() {
            return id;
        }
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        System.out.println(pb.getId() + " starts with savings = " + pb.getSavings());

        pb.deposit(100);
        System.out.println("deposit(100) -> savings = " + pb.getSavings());

        pb.withdraw(30);
        System.out.println("withdraw(30) -> savings = " + pb.getSavings());

        pb.withdraw(500);
        System.out.println("withdraw(500) -> savings stays " + pb.getSavings());
    }
}
