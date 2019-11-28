package org.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndImages {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat\\eclipse-workspace\\gree1\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("img"));
		int size = links.size();
		System.out.println("Number of links: " + size);
		int count = 0;

		for (WebElement l : links) {
			String linkname = l.getAttribute("src");

			if (!(linkname == null)) {

				URL url = new URL(linkname);
				URLConnection o = url.openConnection();
				HttpsURLConnection h = (HttpsURLConnection) o;
				int responseCode = h.getResponseCode();

				if (!(responseCode == 200)) {
					count++;
					System.out.println(linkname);
					System.out.println(responseCode);

				}

			}

		}

		System.out.println(count);

	}

}
