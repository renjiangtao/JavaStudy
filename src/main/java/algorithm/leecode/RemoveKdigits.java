package algorithm.leecode;

public class RemoveKdigits {
    /**
     * ����һ�����ַ�����ʾ�ķǸ�����?num���Ƴ�������е� k λ���֣�ʹ��ʣ�µ�������С��
     * <p>
     * ע��:
     * num �ĳ���С�� 10002 ��?�� k��
     * num ��������κ�ǰ���㡣
     * ʾ�� 1 :
     * ����: num = "1432219", k = 3
     * ���: "1219"
     * ����: �Ƴ����������� 4, 3, �� 2 �γ�һ���µ���С������ 1219��
     * ʾ�� 2 :
     * ����: num = "10200", k = 1
     * ���: "200"
     * ����: �Ƶ���λ�� 1 ʣ�µ�����Ϊ 200. ע������������κ�ǰ���㡣
     * ʾ�� 3 :
     * ����: num = "10", k = 2
     * ���: "0"
     * ����: ��ԭ�����Ƴ����е����֣�ʣ��Ϊ�վ���0��
     */

    public static void main(String[] args) {

    }


    public String removeKdigits(String num, int k) {
        char[] chars = num.toCharArray();
        if (k == 0) {
            return num;
        }

        if (k == chars.length) {
            return "0";
        }

        for (int i = 0; i < chars.length; i++) {

        }
        return "";
    }
}
