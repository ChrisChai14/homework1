package com.train;

public class TesterDo {
    int otkn;
    int rtkn;
    public TesterDo (int otkn, int rtkn) {
        this.otkn = otkn;
        this.rtkn = rtkn;
    }

    public void print() {
        System.out.print("\tTotal tickets:" + otkn + "\tRound-trip:" + rtkn +
                "\tTotal：" + Math.round(totalPrice()));
        if (bookNum() < 0) {
            System.out.println("\tError！");
        }
    }
    public int bookNum() {
        return (otkn - rtkn);
    }
    public double totalPrice() {
        return ((bookNum() * 1000) + (rtkn * (2000 * 0.9)));
    }
}
