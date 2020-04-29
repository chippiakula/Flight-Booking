package stepdefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flightsteps {
	public WebDriver driver;
	
	

@Given("user in mercury tours page")
public void user_in_mercury_tours_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
    String key="webdriver.chrome.driver";
    String value="D:\\chippiakula\\Flightbooking\\drivers\\chromedriver.exe";
    System.setProperty(key, value);
    driver=new ChromeDriver();
    driver.get("http://newtours.demoaut.com/index.php");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    
}

@When("user enteres username and password and click signin button")
public void user_enteres_username_and_password_and_click_signin_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mercury");
	driver.findElement(By.xpath("//input[@name='login']")).click();
}

@Then("user in flight finder page")
public void user_in_flight_finder_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("Find a Flight: Mercury Tours:"))
	{
		String string ="user on mercury page";
		System.out.println("pass ="+string);
	}
	else
	{
		String string = "user not in mercury page";
		System.out.println("fail ="+string);
	}
}

@Then("enter Flight details")
public void enter_Flight_details() throws InterruptedException
{
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	driver.findElement(By.xpath("//input[@value='oneway']")).click();
	WebElement passengersdrop = driver.findElement(By.xpath("//select[@name='passCount']"));
	Select s=new Select(passengersdrop);
	s.selectByValue("2");
	WebElement departingdrop = driver.findElement(By.xpath("//select[@name='fromPort']"));
	Select s1=new Select(departingdrop);
	s1.selectByValue("Frankfurt");
	Thread.sleep(5000);
	//WebElement frommonthdrop = driver.findElement(By.xpath("//select[@name='fromMonth']"));
	
	//Select s2=new Select(frommonthdrop);
	//s2.selectByValue("February");
	WebElement fromdate = driver.findElement(By.xpath("//select[@name='fromDay']"));
	Select s3=new Select(fromdate);
	s3.selectByValue("16");
	WebElement arrivingdrop = driver.findElement(By.xpath("//select[@name='toPort']"));
	Select s4=new Select(arrivingdrop);
	s4.selectByValue("London");
/*	WebElement tomonthdrop = driver.findElement(By.xpath("//select[@name='toMonth']"));
	Select s5=new Select(tomonthdrop);
	s5.selectByValue("January");*/
	WebElement dte = driver.findElement(By.xpath("//select[@name='toDay']"));
	Select s6=new Select(dte);
	s6.selectByValue("5");
	
	
	
	
	
}

@Then("enter Preferences details and click continue")
public void enter_Preferences_details_and_click_continue() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	driver.findElement(By.xpath("(//input[@name='servClass'])[2]")).click();
	Thread.sleep(5000);
/*	WebElement arilinedrop = driver.findElement(By.xpath("//select[@name='airline']"));
	Select s7=new Select(arilinedrop);
	s7.selectByValue("Unified Airlines");*/
	driver.findElement(By.xpath("//input[@name='findFlights']")).click();
}

@Then("user in Select flight page")
public void user_in_Select_flight_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	String string = driver.getTitle();
	System.out.println(string);
	String Expected="Select a Flight: Mercury Tours";
	if(string.equals(Expected))
	{
		String string1 ="user on mercury Tours";
		System.out.println("pass ="+string1);
	}
	else
	{
		String string2 = "user not in mercury Tours";
		System.out.println("fail ="+string2);
	}
}

@Then("select flight departs and click continue")
public void select_flight_departs_and_click_continue() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@name='outFlight'])[3]")).click();
//	driver.findElement(By.xpath("((//input[@name='inFlight'])[4]")).click();
	driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	
}

@Then("user on Book a flight page")
public void user_on_Book_a_flight_page() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	String title = driver.getTitle();
	System.out.println(title);
	String Expected = "Book a Flight: Mercury Tours";
	if(title.equals(Expected))
	{
		String string1 ="user on Book a Flight";
		System.out.println("pass ="+string1);
	}
	else
	{
		String string1 ="user not in Book a Flight";
		System.out.println("fail ="+string1);
	}
}

@Then("enter passengers all details")
public void enter_passengers_all_details() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   //throw new io.cucumber.java.PendingException();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("chipi");
	driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("akula");
	WebElement mealdrop = driver.findElement(By.xpath("//select[@name='pass.0.meal']"));
	Select meal=new Select(mealdrop);
	meal.selectByVisibleText("Hindu");
	
}

@Then("enter Credit card details")
public void enter_Credit_card_details() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	Thread.sleep(5000);
	WebElement creditdrop = driver.findElement(By.xpath("//select[@name='creditCard']"));
	Select s=new Select(creditdrop);
	s.selectByVisibleText("Diners Club");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12354646464454");
	driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("chippi");
	driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("akula");
	driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("akula");
}

@Then("enter Billing Address")
public void enter_Billing_Address() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys("akulavari street nuzvidu");
	driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys("nuzvidu");
	driver.findElement(By.xpath("//input[@name='billState']")).sendKeys("andhra pradesh");
	driver.findElement(By.xpath("//input[@name='billZip']")).sendKeys("1234567");
	WebElement countrydrop = driver.findElement(By.xpath("//select[@name='billCountry']"));
	Select s=new Select(countrydrop);
	s.selectByVisibleText("BELGIUM ");
}

@Then("enter delivery Address and click Secure purchase")
public void enter_delivery_Address_and_click_Secure_purchase() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
}

@Then("user on Flight confirmation page")
public void user_on_Flight_confirmation_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	String title = driver.getTitle();
	System.out.println(title);
	String Expected="Flight Confirmation: Mercury Tours";
	if(title.equals(Expected))
	{
		String string1 ="user on Flight confirmation";
		System.out.println("pass ="+string1);
	}else
	{
		String string1 ="user not in Flight confirmation";
		System.out.println("fail ="+string1);
	}
}
 
@Then("click logout button")
public void click_logout_button() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
	
	String string = driver.getTitle();
	System.out.println(string);
	String Expected="Sign-on: Mercury Tours";
	if(string.equals(Expected))
	{
		String string1 ="user on Sign-on: Mercury Tours";
		System.out.println("pass ="+string1);
	}
	else
	{
		String string1 ="user not in Sign-on: Mercury Tours";
		System.out.println("fail ="+string1);
	}
	driver.close();
}
@When("^user enteres \"([^\"]*)\" and \"([^\"]*)\" and click signin button$")
public void user_enteres_something_and_something_and_click_signin_button(String strArg1, String strArg2) throws Throwable 
{
   // throw new PendingException();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(strArg1);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(strArg2);
	driver.findElement(By.xpath("//input[@name='login']")).click();

	
	
	
}
@And("^enter following Flight details$")
public void enter_following_flight_details(DataTable data) throws Throwable
{
   // throw new PendingException();
	List<List<String>> obj = data.asLists();
	//System.out.println(obj.get(0).get(1));
	driver.findElement(By.xpath("//input[@value='oneway']")).click();
	WebElement passengersdrop = driver.findElement(By.xpath("//select[@name='passCount']"));
	Select s=new Select(passengersdrop);
	s.selectByValue(obj.get(0).get(0));
	WebElement departingdrop = driver.findElement(By.xpath("//select[@name='fromPort']"));
	Select s1=new Select(departingdrop);
	s1.selectByValue(obj.get(0).get(1));
	WebElement fromdate = driver.findElement(By.xpath("//select[@name='fromDay']"));
	Select s3=new Select(fromdate);
	s3.selectByValue(obj.get(0).get(3));
	WebElement arrivingdrop = driver.findElement(By.xpath("//select[@name='toPort']"));
	Select s4=new Select(arrivingdrop);
	s4.selectByValue(obj.get(0).get(4));
	WebElement dte = driver.findElement(By.xpath("//select[@name='toDay']"));
	Select s6=new Select(dte);
	s6.selectByValue(obj.get(0).get(6));
	
}
@And("^enter following passengers all details$")
public void enter_following_passengers_all_details(DataTable data) throws Throwable {
    //throw new PendingException();
    Thread.sleep(5000);
    List<List<String>> obj = data.asLists();
    
	driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys(obj.get(0).get(0));
	driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys(obj.get(0).get(1));
	WebElement mealdrop = driver.findElement(By.xpath("//select[@name='pass.0.meal']"));
	Select meal=new Select(mealdrop);
	meal.selectByVisibleText(obj.get(0).get(2));
    
}

@And("^enter Credit card details$")
public void enter_credit_card_details(DataTable data) throws Throwable {
   // throw new PendingException();
	Thread.sleep(5000);
	List<List<String>> obj = data.asLists();
	WebElement creditdrop = driver.findElement(By.xpath("//select[@name='creditCard']"));
	Select s=new Select(creditdrop);
	s.selectByVisibleText(obj.get(0).get(6));
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(obj.get(0).get(6));
	driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys(obj.get(0).get(6));
	driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys(obj.get(0).get(6));
	driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys(obj.get(0).get(6));
}

@And("^enter Billing Address$")
public void enter_billing_address(DataTable data) throws Throwable {
    //throw new PendingException();
	Thread.sleep(2000);
	List<List<String>> obj = data.asLists();
	driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys(obj.get(0).get(6));
	driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys(obj.get(0).get(6));
	driver.findElement(By.xpath("//input[@name='billState']")).sendKeys(obj.get(0).get(6));
	driver.findElement(By.xpath("//input[@name='billZip']")).sendKeys(obj.get(0).get(6));
	WebElement countrydrop = driver.findElement(By.xpath("//select[@name='billCountry']"));
	Select s=new Select(countrydrop);
	s.selectByVisibleText(obj.get(0).get(6));
}
	

}
