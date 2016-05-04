package google;


import org.junit.Test;


public class GoogleTest extends Firefox {
    @Test
    public void connecting() throws  InterruptedException{
       MainPage mainpage = new  MainPage(driver);
        mainpage.searchInputLocator();
        mainpage.searchButtonLocator();
        mainpage.size();



    }
}
