package yerenpeng.stream;

import org.junit.Test;

import java.io.*;

public class TestStream {

    private transient String pattern = "Out";

    private static final int STREAM_MODE = 1;

//    private static final String PATH_NAME = "D:\\test.sql";

    private static final String PATH_NAME = "D:\\test001.sql";

    private long startTime, entTime, intervalTime;

    // 测试输出流
    @Test
    public void testOutStream() throws IOException {
        startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        File file = new File(PATH_NAME);
        FileWriter writer = new FileWriter(file);
        writer.flush();
        // 大小16M
        for (int i = 0; i < (1 << 6); i++) {
            buffer.append(i + 1);
            if ((i + 1) % 100 == 0) {
                buffer.append("\r\n");
            } else {
                buffer.append(",");
            }
        }
        writer.write(buffer.toString());
        writer.close();
        entTime = System.currentTimeMillis();
        intervalTime = entTime - startTime;
        System.out.println("文件写入成功！" + "\n总共用时：" + intervalTime + "ms");
    }

    @Test
    public void testReadStream() throws IOException {
        startTime = System.currentTimeMillis();

        // buffer
        readFileBuffer();

        // no-buffer
        readFileNoBuffer();

        entTime = System.currentTimeMillis();
        intervalTime = entTime - startTime;
        System.out.println("文件读取完毕！" + "\n总共用时：" + intervalTime + "ms");
    }

    // 使用Buffer读取文件
    public void readFileBuffer() throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(PATH_NAME));
        byte[] bytes = new byte[1024 * 2];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.write(bytes, 0, len);
        }
        inputStream.close();
    }

    // 不使用Buffer读取文件
    public void readFileNoBuffer() throws IOException {
        File file = new File(PATH_NAME);
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            System.out.write(bytes, 0, len);
        }
        fis.close();
    }

    @Test
    public void touchFiles(){
        File file1 = new File(PATH_NAME);

    }
}
