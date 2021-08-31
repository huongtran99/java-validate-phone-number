package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {

/*    Viết phương thức để kiểm tra tính hợp lệ của số điên thoại.
    Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
    x là ký tự số
    Không chứa các ký tự đặc biệt
    Ví dụ số điện thoại hợp lệ: (84)-(0978489648)
    Ví dụ tên lớp không hợp lệ: (a8)-(22222222)*/

    private static final String ACCOUNT_REGEX = "\\d{2}-\\d{9}";

    public ValidatePhoneNumber() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
