package test;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @Package: test <br>
 * @description: 方法描述
 * @ClassName: Test03 <br>
 * @Author: zyw <br>
 * @CreateDate: 2021/4/1 13:04 <br>
 */
public class Test03 {

    private static int totalCount = 0;
    private int customerID;

    public Test03() {
        ++totalCount;
        customerID = totalCount;
        System.out.println("增加一个");
    }

    public String getCustomerID() {
        DecimalFormat decimalFormat = new DecimalFormat("00000000");
        return decimalFormat.format(customerID);
    }

    public static void main(String[] args) {
        String str = "15189366632";
        System.out.println(str.substring(5));
    }
}
