package leetcode1169;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyw
 * @date 2019/12/11
 */
public class SolutionOne {
    private static List<String> invalidTransactions(String[] transactions) {
        List<String> res = new ArrayList<>();
        List<Transaction> tranList = new ArrayList<>();
        for (String transaction : transactions) {
            tranList.add(new Transaction(transaction));
        }

        for (Transaction tran : tranList) {
            if (!tran.invalid) {
                for (Transaction other : tranList) {
                    tran.isInvalid(other);
                }
            }
        }

        for (Transaction transaction : tranList) {
            if (transaction.invalid) {
                res.add(transaction.tran);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] s = {"alice,20,800,mtv", "alice,50,1200,mtv"};
        System.out.println(invalidTransactions(s));
    }

    private static class Transaction {
        private final int MAX_PRICE = 1000;
        private final String tran;
        private final String name;
        private final int time;
        private final int price;
        private final String city;
        boolean invalid;

        Transaction(String tran) {
            this.tran = tran;
            String[] split = tran.split(",");
            this.name = split[0];
            this.time = Integer.parseInt(split[1]);
            this.price = Integer.parseInt(split[2]);
            this.city = split[3];
            if (price > MAX_PRICE) {
                invalid = true;
            }
        }

        private void isInvalid(Transaction that) {
            if (that.equals(this)) {
                return;
            }
            final int maxTime = 60;
            if (that.name.equals(this.name) && (!that.city.equals(this.city))) {
                if (Math.abs(that.time - this.time) <= maxTime) {
                    that.invalid = true;
                    this.invalid = true;
                }
            }
        }
    }
}



