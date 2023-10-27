import org.junit.Test;

import java.util.Arrays;

public class StringTest {

    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    @Test
    public void test01() {
        //将字符串中的字符按照大小顺序排列
        String str = "helloworldjavaatguigu";
        char[] array = str.toCharArray();
        Arrays.sort(array);
        str = new String(array);
        System.out.println(str);
    }

    @Test
    public void test02() {
        //将首字母转为大写
        String str = "jack";
        str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        System.out.println(str);
    }

    @Test
    public void test03() {
        char[] data = {'h', 'e', 'l', 'l', 'o', 'j', 'a', 'v', 'a'};
        String s1 = String.copyValueOf(data);
        String s2 = String.copyValueOf(data, 0, 5);
        int num = 123456;
        String s3 = String.valueOf(num);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    @Test
    public void test4() {
        String name = "张三";
        System.out.println(name.startsWith("张"));
    }

    @Test
    public void test5() {
        String file = "Hello.txt";
        if (file.endsWith(".java")) {
            System.out.println("Java源文件");
        } else if (file.endsWith(".class")) {
            System.out.println("Java字节码文件");
        } else {
            System.out.println("其他文件");
        }
    }

    @Test
    public void test6() {
        String str1 = "hello244world.java;887";
        //把其中的非字母去掉
        str1 = str1.replaceAll("[^a-zA-Z]", "");
        System.out.println(str1);

        String str2 = "12hello34world5java7891mysql456";
        //把字符串中的数字替换成,，如果结果中开头和结尾有，的话去掉
        String string = str2.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
        System.out.println(string);

    }

    // 方式一：
    public String reverse1(String str, int start, int end) {// start:2,end:5
        if (str != null) {
            // 1.
            char[] charArray = str.toCharArray();
            // 2.
            for (int i = start, j = end; i < j; i++, j--) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
            // 3.
            return new String(charArray);

        }
        return null;

    }

    // 方式二：
    public String reverse2(String str, int start, int end) {
        // 1.
        String newStr = str.substring(0, start);// ab
        // 2.
        for (int i = end; i >= start; i--) {
            newStr += str.charAt(i);
        } // abfedc
        // 3.
        newStr += str.substring(end + 1);
        return newStr;
    }

    // 方式三：推荐 （相较于方式二做的改进）
    public String reverse3(String str, int start, int end) {// ArrayList list = new ArrayList(80);
        // 1.
        StringBuffer s = new StringBuffer(str.length());
        // 2.
        s.append(str.substring(0, start));// ab
        // 3.
        for (int i = end; i >= start; i--) {
            s.append(str.charAt(i));
        }

        // 4.
        s.append(str.substring(end + 1));

        // 5.
        return s.toString();

    }

    @Test
    public void testReverse() {
        String str = "abcdefg";
        String str1 = reverse3(str, 2, 5);
        System.out.println(str1);// abfedcg

    }


    // 第3题
    // 判断str2在str1中出现的次数
    public int getCount(String mainStr, String subStr) {
        if (mainStr.length() >= subStr.length()) {
            int count = 0;
            int index = 0;
            // while((index = mainStr.indexOf(subStr)) != -1){
            // count++;
            // mainStr = mainStr.substring(index + subStr.length());
            // }
            // 改进：
            // staring from index
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                System.out.println(index);
                System.out.println(subStr);
                index += subStr.length();
                count++;
            }

            return count;
        } else {
            return 0;
        }

    }

    @Test
    public void testGetCount() {
        String str1 = "cdabkkcadkabkebfkabkskab";
        String str2 = "ab";
        int count = getCount(str1, str2);
        System.out.println(count);
    }

    // 第4题
    // 如果只存在一个最大长度的相同子串
    public String getMaxSameSubString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String maxStr = (str1.length() > str2.length()) ? str1 : str2;
            String minStr = (str1.length() > str2.length()) ? str2 : str1;

            int len = minStr.length();

            for (int i = 0; i < len; i++) {// 0 1 2 3 4 此层循环决定要去几个字符

                for (int x = 0, y = len - i; y <= len; x++, y++) {

                    if (maxStr.contains(minStr.substring(x, y))) {

                        return minStr.substring(x, y);
                    }

                }

            }
        }
        return null;
    }

    // 如果存在多个长度相同的最大相同子串
    // 此时先返回String[]，后面可以用集合中的ArrayList替换，较方便
    public String[] getMaxSameSubString1(String str1, String str2) {
        if (str1 != null && str2 != null) {
            StringBuffer sBuffer = new StringBuffer();
            String maxString = (str1.length() > str2.length()) ? str1 : str2;
            String minString = (str1.length() > str2.length()) ? str2 : str1;

            int len = minString.length();
            for (int i = 0; i < len; i++) {
                for (int x = 0, y = len - i; y <= len; x++, y++) {
                    String subString = minString.substring(x, y);
                    if (maxString.contains(subString)) {
                        sBuffer.append(subString + ",");
                    }
                }
                System.out.println(sBuffer);
                if (sBuffer.length() != 0) {
                    break;
                }
            }
            String[] split = sBuffer.toString().replaceAll(",$", "").split("\\,");
            return split;
        }

        return null;
    }
    // 如果存在多个长度相同的最大相同子串：使用ArrayList
    //	public List<String> getMaxSameSubString1(String str1, String str2) {
    //		if (str1 != null && str2 != null) {
    //			List<String> list = new ArrayList<String>();
    //			String maxString = (str1.length() > str2.length()) ? str1 : str2;
    //			String minString = (str1.length() > str2.length()) ? str2 : str1;
    //
    //			int len = minString.length();
    //			for (int i = 0; i < len; i++) {
    //				for (int x = 0, y = len - i; y <= len; x++, y++) {
    //					String subString = minString.substring(x, y);
    //					if (maxString.contains(subString)) {
    //						list.add(subString);
    //					}
    //				}
    //				if (list.size() != 0) {
    //					break;
    //				}
    //			}
    //			return list;
    //		}
    //
    //		return null;
    //	}

    @Test
    public void testGetMaxSameSubString() {
        String str1 = "abcwerthelloyuiod123456ef";
        String str2 = "cvhellobnm123456iodef";
        String strs = getMaxSameSubString(str1, str2);
        System.out.println(strs);
    }

    // 第5题
    @Test
    public void testSort() {
        String str = "abcwerthelloyuiodef";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String newStr = new String(arr);
        System.out.println(newStr);
    }


}