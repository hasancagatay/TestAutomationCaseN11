import org.junit.Test;

/**
 * Created by apple01 on 23.02.2020.
 */
public class n11Test  {

    @Test
    public void testCasestart() throws InterruptedException {
        N11TestBase test = new N11TestBase();
        test.start();
        test.login(" ", " ");
        test.enterSearchBox("bilgisayar");
        test.openSearchPage(2);
        test.selectProduct();
        test.addBasket();
        test.finish();
    }

}
