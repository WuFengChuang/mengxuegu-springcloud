package com.mengxuegu.springcloud;

import org.bouncycastle.util.encoders.Base64;

public class Demo {
    public static void main(String[] args) {
//        String str = "123\n45612\n3123123\n";
//        System.out.println(str);
//        System.out.println(str.replace("\n",""));
        String code = "61149e7fe58e8167544a6292486b79e531482e797e560ced6fe3f70b26f3716c";
        System.out.println(Base64.decode(code.getBytes()).toString());
        String s = "NjExNDllN2ZlNThlODE2NzU0NGE2MjkyNDg2Yjc5ZTUzMTQ4MmU3OTdlNTYwY2VkNmZlM2Y3MGIyNmYzNzE2Yw==";
        System.out.println(new String(Base64.encode(s.getBytes()).toString()));
        System.out.println(new String(Base64.decode(s.getBytes()).toString()));
    }
}
