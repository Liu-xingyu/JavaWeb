package yerenpeng.download;

/**
 * 测试多线程下载
 * Created by YRP-Laptop on 2018/6/4.
 */
public class TestDownLoad {

    public static final String FILE_PATH = "http://192.168.239.130:8080/vedio.flv";
    public static final String SAVE_PATH = "D:\\";
    public static final Integer THREAD_NUM = 4;

    public static void main(String[] args) throws Exception {

        MutilThreadDownload download = new MutilThreadDownload(FILE_PATH, SAVE_PATH, THREAD_NUM);
        download.download();
    }

}
