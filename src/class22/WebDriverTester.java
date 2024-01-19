package class22;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver [] arr = {new ChromeDriver(), new FirefoxDrive()};
        for (WebDriver r: arr){
            r.OpenBrowser();
            r.closeBrowser();
            r.maximizeBrowser();
            r.findElement();
        }


    }
}
