package class26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\Patrick Udo\\IdeaProjects\\NewSdetBatch18\\Files\\HRMSTestData.xlsx";
        String sheetName="Sheet1";
        List<Map<String,String>> testData= ExcelReader.read(path,sheetName);
        System.out.println(testData);
        //Break till 1:45

        String url= ConfigReader.read("url");
        String userName=ConfigReader.read("userName");
        String password=ConfigReader.read("password");
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
        WebElement userNameWE=webDriver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement passwordWE=webDriver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement enterBtn=webDriver.findElement(By.xpath("//input[@id='btnLogin']"));
        userNameWE.sendKeys(userName);
        passwordWE.sendKeys(password);
        enterBtn.click();


        testData.forEach(x->{
            webDriver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
            webDriver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
            webDriver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(x.get("FirstName"));
            webDriver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(x.get("MiddleName"));
            webDriver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(x.get("LastName"));
            webDriver.findElement(By.xpath("//input[@id='employeeId']")).clear();
            webDriver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys(x.get("EmployeeId"));
            webDriver.findElement(By.xpath("//input[@id='btnSave']")).click();

            webDriver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();

            List<WebElement> staffid = webDriver.findElements(By.xpath("//table/tbody/tr/td[2]"));

            int idnum = 1;

            for (WebElement findId : staffid){
                String id = findId.getText();
                if (id.equals("103250A")){
                    System.out.println(idnum);
                    WebElement getid = webDriver.findElement(By.xpath("//table/tbody/tr[" + (idnum) + "]/td[1]"));
                    getid.click();



                    webDriver.findElement(By.xpath("//table/tbody/tr[10]/td[2]")).click();
                    webDriver.findElement(By.xpath("//input[@id='btnSave']")).click();
                    webDriver.findElement(By.xpath("//input[@name='personal[txtLicenNo]']")).sendKeys(x.get("Driver'sLicenseNumber"));
                    webDriver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).clear();
                    webDriver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).sendKeys(x.get("Driver'sLicenseNumberLicenseExpiryDate"));
                    webDriver.findElement(By.xpath("//input[@name='personal[txtNICNo]']")).sendKeys(x.get("SSNNumber"));
                    webDriver.findElement(By.xpath("//input[@id='personal_txtSINNo']")).sendKeys(x.get("SINNumber"));
                    webDriver.findElement(By.xpath("//input[@name='personal[optGender]']")).click();
                    webDriver.findElement(By.xpath("//select/option[2]")).click();
                    webDriver.findElement(By.xpath("//select/option[137]")).click();
                    webDriver.findElement(By.xpath("//input[@id='personal_DOB']")).clear();
                    webDriver.findElement(By.xpath("//input[@id='personal_DOB']")).sendKeys(x.get("DateofBirth"));

                    webDriver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']")).sendKeys(x.get("NickName"));

                    webDriver.findElement(By.xpath("//input[@type='checkbox']")).click();


                    webDriver.findElement(By.xpath("//input[@id='personal_txtMilitarySer']")).sendKeys(x.get("MilitaryService"));
                    webDriver.findElement(By.xpath("//input[@value='Save']")).click();
                    break;
                }
                idnum++;
            }


        });


    }
}
