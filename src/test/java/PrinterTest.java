import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    private Printer testprinter;

    @Before
    public void before(){
        testprinter = new Printer(50, 100);
    }

    @Test
    public void testPaperAmount() {
        assertEquals(50, testprinter.getPaper());
    }

    @Test
    public void testTonerAmount() {
        assertEquals(100, testprinter.getToner());
    }

    @Test
    public void testAmountOfPaperNeededPerPrintJob() {
        assertEquals(20, testprinter.paperNeeded(4, 5));
    }

    @Test
    public void testEnoughPaperInPrinterReturnsTrue() {
        assertEquals(true, testprinter.enoughPaperInPrinter(testprinter.paperNeeded(4,5)));
    }


    @Test
    public void testEnoughPaperInPrinterReturnsfalse() {
        assertEquals(false, testprinter.enoughPaperInPrinter(testprinter.paperNeeded(10,6)));
    }

    @Test
    public void testPaperAfterPrintJob(){
        testprinter.checkIfCanPrint(testprinter.paperNeeded(4,5));
        assertEquals(30, testprinter.getPaper());
    }

    @Test
    public void testPaperHasBeenRefilled(){
        testprinter.fillPaper();
        assertEquals(100, testprinter.getPaper());
    }

    @Test
    public void testEnoughTonerToPrintReturnsFalse(){
        assertEquals(true, testprinter.enoughTonerInPrinter(testprinter.paperNeeded(10,6)));
    }

    @Test
    public void testEnoughTonerToPrintReturnsTrue(){
        assertEquals(false, testprinter.enoughTonerInPrinter(testprinter.paperNeeded(100,6)));
    }

    @Test
    public void testTonerAfterPrintJob(){
        testprinter.checkIfCanPrint(testprinter.paperNeeded(4,5));
        assertEquals(80, testprinter.getToner());
    }

}


