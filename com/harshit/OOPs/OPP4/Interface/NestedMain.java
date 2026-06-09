import com.harshit.OOPs.OPP4.Interface.Nested;

public static class NestedMain implements Nested.inner{
    @Override
    public boolean isOdd(int n) {
        return ((n&1)==1);
    }
}

static void main(String[] args) {
    NestedMain nm = new NestedMain();
    System.out.println( nm.isOdd(19));

}
