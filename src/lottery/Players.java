package lottery;

public class Players {

    public int[] tickets;
    public String name;
    public int cash;

    public Players(String name, int cash, int[] tickets) {
        this.name = name;
        this.cash = cash;
        this.tickets = tickets;
    }
}
