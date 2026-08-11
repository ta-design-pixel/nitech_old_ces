// ・RangeAdd クラス
class RangeAdd {

    public static int add(int a, int b) throws NotNaturalNumber {
        if (a < 0) {
            throw new NotNaturalNumber(a);
        } else if (b < 0) {
            throw new NotNaturalNumber(b);
        } else {
            int start = Math.min(a, b);
            int end = Math.max(a, b);
            int count = end - start + 1;
            return (start + end) * count / 2;
        }
    }
}
