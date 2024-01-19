package class22;

public interface WebDriver {

    void OpenBrowser();
    void closeBrowser();
    void maximizeBrowser();
    void findElement();
}

class ChromeDriver implements WebDriver{
    @Override
    public void OpenBrowser() {
        System.out.println("Open Browser....");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close Browser.....");
    }

    @Override
    public void maximizeBrowser() {
        System.out.println("maximizeBrowser......");
    }

    @Override
    public void findElement() {
        System.out.println("findElement....");
    }
}

class FirefoxDrive implements WebDriver{

    @Override
    public void maximizeBrowser() {
        System.out.println("maximize Browsers.....");
    }

    @Override
    public void findElement() {
        System.out.println("find Elements......");
    }

    @Override
    public void OpenBrowser() {
        System.out.println("Open Browsers....");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close Browsers.....");
    }
}
