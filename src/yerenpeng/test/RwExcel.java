package yerenpeng.test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.junit.Test;

import java.io.File;

/**
 * 操作Excel 使用JXL POI
 * Created by YRP-Laptop on 2018/1/2.
 */
public class RwExcel {

    public void writeJxlExcel(int rows, int cols) throws Exception {
        File file = new File("D:\\TestJxl.xls");
        WritableWorkbook workbook = Workbook.createWorkbook(file);
        WritableSheet sheet = workbook.createSheet("测试JXL的Excel", 0);
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                sheet.addCell(new Label(col, row, "第" + row + "行，第" + col + "列"));
            }
        }
        workbook.write();
        workbook.close();
        System.out.println("JXL创建Excel成功！");
    }

    public void readJxlExcel(File file) throws Exception{
        Workbook workbook = Workbook.getWorkbook(file);
        Sheet[] sheets = workbook.getSheets();
        for (Sheet sheet:sheets) {
            int cols = sheet.getColumns();
            int rows = sheet.getRows();
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    Cell cell = sheet.getCell(col,row);
                    System.out.println(cell.getContents());
                }
            }
        }
        workbook.close();
    }

    @Test
    public void testWriteExcel() throws Exception{
        writeJxlExcel(8,10);
    }

    @Test
    public void testReadExcel() throws Exception{
        readJxlExcel(new File("D:\\TestJxl.xls"));
    }

}
