package course.javaprogramming;

public class Printer {
    private Toner toner;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(Toner toner, boolean isDuplex) {
        this.toner = toner;
        this.isDuplex = isDuplex;
    }

    public int printPages(int numberPgs){
        int pagesToPrint = 0;
        if(isDuplex()){
            System.out.println("printing in duplex...");
            pagesToPrint = (numberPgs / 2 ) + (numberPgs % 2);

        }else{
            System.out.println("normal printing...");
            pagesToPrint = numberPgs;
        }
            int inkLevel = 0;

            while (pagesToPrint > 0){
                inkLevel = toner.usedToner(1);
                if(inkLevel < 0 ){
                    System.out.println("not enough ink");
                    break;
                }
                pagesToPrint--;
                this.pagesPrinted++;
            }
            return pagesPrinted;

    }

    public Toner getToner() {
        return toner;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
