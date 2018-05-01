public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return this.paper;
    }


    public int getToner() {
        return this.toner;
    }

    public int paperNeeded(int pages, int copies) {
        return pages * copies;
    }

    public boolean enoughPaperInPrinter(int pages_needed) {
        if (this.paper > pages_needed)
            {return true;}
        else {return false;}
    }

    public boolean enoughTonerInPrinter(int pages_needed){
        if (this.toner > pages_needed)
            {return true;}
        else
            {return false;}
    }

    public void print(int pages_needed){
        this.paper -= pages_needed;
        this.toner -= pages_needed;

    }

    public void checkIfCanPrint(int pages_needed){
        if (enoughPaperInPrinter(pages_needed) && enoughTonerInPrinter(pages_needed))
        {print(pages_needed);}

    }

    public void fillPaper(){
         this.paper = 100;
    }


}
