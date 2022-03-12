package Encapsulation;

public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel>-1&&tonerLevel<100?tonerLevel:-1;
        this.pagesPrinted=0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount>0 && tonerAmount<100){
            if((tonerAmount+tonerLevel)<=100){
                return (tonerLevel+=tonerAmount);
            }
            return -1;
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint=pages;
        if(duplex) {
            pagesToPrint/=2;
            pagesToPrint+=pages%2==0?0:1;
        }
        pagesPrinted+=pagesToPrint;
        return  pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
