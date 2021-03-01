import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Ornelas\\Desktop\\Semestre 21-1\\Gestion 2\\instaladores\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.mx/imghp?hl=es");

        WebElement Cam = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[3]/div[2]/span"));
        Cam.click();
       // xpath de la pestaña "Buscar por imagen"
        WebElement SearchByIm = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/form/div[1]/div/a"));
        SearchByIm.click();
        // id del elemento boton para subir el archivo
        WebElement FileUpload = driver.findElement(By.id("awyMjb"));

        // Obtenemos la ruta de nuestro archivo
        Path rutaArchivo = Paths.get("src", "test","upload-image-file.png");
        String rutaAbsoluta = rutaArchivo.toFile().getAbsolutePath();
        FileUpload.sendKeys(rutaAbsoluta);

        //driver.quit();

    }
}