
public class Account {

    private String name;
    private String no;
    private long balance;
    private Day date;

    Account(String n, String num, long z , Day d) {
        name = n;
        no = num;
        balance = z;
        date = d;
    }

    String getName() {
        return name;
    }

    String getNo() {
        return no;
    }

    long getBalance() {
        return balance;
    }

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }

    public String toString() {
		return String.format("%04d年%02d月%02d日", date.getYear(), date.getMonth(), date.getDay());
	}
}
