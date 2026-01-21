package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo8 {

    @Test
    public void user() throws IOException {

        // Path of Excel file (inside project)
        String path = System.getProperty("user.dir") + "/testdata/Book1.xlsx";

        // File input stream
        FileInputStream fis = new FileInputStream(path);

        // Workbook
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        // Sheet
        XSSFSheet sheet = wb.getSheetAt(0);

        // Row count
        int rowCount = sheet.getLastRowNum();

        // Base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Loop through Excel rows
        for (int i = 1; i <= rowCount; i++) {

            int id = (int) sheet.getRow(i).getCell(0).getNumericCellValue();

            // GET request
            Response response = RestAssured.get("/posts/" + id);

            // Print response
            System.out.println("ID: " + id);
            System.out.println(response.getBody().asString());
            System.out.println("------------------------------------------------");
        }

        wb.close();
        fis.close();
    }
}
