import java.util.BitSet;

public class BitSetExample {
    public static void main(String[] args) {
        BitSet bitSet1 = new BitSet();
        BitSet bitSet2 = new BitSet();

        bitSet1.set(0);
        bitSet1.set(2);
        bitSet1.set(4);

        bitSet2.set(1);
        bitSet2.set(2);
        bitSet2.set(3);

        System.out.println("BitSet 1: " + bitSet1);
        System.out.println("BitSet 2: " + bitSet2);

        BitSet andResult = (BitSet) bitSet1.clone();
        andResult.and(bitSet2);
        System.out.println("AND Result: " + andResult);

        BitSet orResult = (BitSet) bitSet1.clone();
        orResult.or(bitSet2);
        System.out.println("OR Result: " + orResult);

        BitSet xorResult = (BitSet) bitSet1.clone();
        xorResult.xor(bitSet2);
        System.out.println("XOR Result: " + xorResult);
    }
}
