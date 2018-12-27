package yerenpeng.othersyntax;

/**
 * 测试计算简单算法
 * Created by YRP-Laptop on 2018/1/13.
 */
public class TestSyntax {

    public int startNum;
    public int endNum;
    public int divNum;

    public TestSyntax() {
    }

    public TestSyntax(int startNum, int endNum, int divNum) {
        this.startNum = startNum;
        this.endNum = endNum;
        this.divNum = divNum;
    }

    public int completeNum() throws Exception {
        int total = 0;
        if (divNum == 0) {
            throw new Exception("除数不能为0！");
        } else if (divNum < 0) {
            throw new Exception("除数不小于0！");
        }
        if (startNum > endNum) {
            throw new Exception("起始数不能大于截至数！");
        }
        for (; startNum <= endNum; startNum++) {
            if (startNum % divNum == 0) {
                total += startNum;
            }
        }

        return total;
    }
}
