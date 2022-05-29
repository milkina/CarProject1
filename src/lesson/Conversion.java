package lesson;

public class Conversion {
    public static void main(String[] args) {
        System.out.println(fromByteToByte((byte) 12));
        System.out.println(fromByteToShort((byte) 1));
        System.out.println(fromByteToChar((byte) 10));
        System.out.println(fromByteToInt((byte) 30));
        System.out.println(fromByteToLong((byte) 10));
        System.out.println(fromByteToFloat((byte) 7));
        System.out.println(fromByteToDouble((byte) 15));

        System.out.println(fromShortToByte((short)3));
        System.out.println(fromShortToShort((short)33));
        System.out.println(fromShortToChar((short)200));
        System.out.println(fromShortToInt((short)5));
        System.out.println(fromShortToLong((short)100));
        System.out.println(fromShortToFloat((short)8));
        System.out.println(fromShortToDouble((short)9));

        System.out.println(fromCharToByte('a'));
        System.out.println(fromCharToShort('n'));
        System.out.println(fromCharToChar('v'));
        System.out.println(fromCharToInt('g'));
        System.out.println(fromCharToLong('m'));
        System.out.println(fromCharToFloat('2'));
        System.out.println(fromCharToDouble('p'));

        System.out.println(fromIntToByte(7));
        System.out.println(fromIntToShort(89));
        System.out.println(fromIntToChar(6));
        System.out.println(fromIntToInt(8));
        System.out.println(fromIntToLong(67));
        System.out.println(fromIntToFloat(100));
        System.out.println(fromIntToDouble(455));

        System.out.println(fromLongToByte(3L));
        System.out.println(fromLongToShort(6L));
        System.out.println(fromLongToChar(9L));
        System.out.println(fromLongToInt(8L));
        System.out.println(fromLongToLong(67L));
        System.out.println(fromLongToFloat(100L));
        System.out.println(fromLongToDouble(455L));

        System.out.println(fromFloatToByte(3.8f));
        System.out.println(fromFloatToShort(6f));
        System.out.println(fromFloatToChar(77.6f));
        System.out.println(fromFloatToInt(8f));
        System.out.println(fromFloatToLong(67f));
        System.out.println(fromFloatToFloat(100f));
        System.out.println(fromFloatToDouble(455.0F));

        System.out.println(fromDoubleToByte(3.807d));
        System.out.println(fromDoubleToShort(6.0));
        System.out.println(fromDoubleToChar(77.6D));
        System.out.println(fromDoubleToInt(8d));
        System.out.println(fromDoubleToLong(67d));
        System.out.println(fromDoubleToFloat(100.06d));
        System.out.println(fromDoubleToDouble(455.0d));
    }

    //from byte
    static byte fromByteToByte(byte b) {
        return b;
    }

    static short fromByteToShort(byte b) {
        return b;
    }

    static char fromByteToChar(byte b) {
        return (char) b;
    }

    static int fromByteToInt(byte b) {
        return b;
    }

    static long fromByteToLong(byte b) {
        return b;
    }

    static float fromByteToFloat(byte b) {
        return b;
    }

    static double fromByteToDouble(byte b) {
        return b;
    }

    // from short
    static byte fromShortToByte(short b) {
        return (byte) b;
    }

    static short fromShortToShort(short b) {
        return b;
    }

    static char fromShortToChar(short b) {
        return (char) b;
    }

    static int fromShortToInt(short b) {
        return b;
    }

    static long fromShortToLong(short b) {
        return b;
    }

    static float fromShortToFloat(short b) {
        return b;
    }

    static double fromShortToDouble(short b) {
        return b;
    }

    //from char
    static byte fromCharToByte(char b) {
        return (byte) b;
    }

    static short fromCharToShort(char b) {
        return (short) b;
    }

    static char fromCharToChar(char b) {
        return b;
    }

    static int fromCharToInt(char b) {
        return b;
    }

    static long fromCharToLong(char b) {
        return b;
    }

    static float fromCharToFloat(char b) {
        return b;
    }

    static double fromCharToDouble(char b) {
        return b;
    }

    //from int
    static byte fromIntToByte(int b) {
        return (byte) b;
    }

    static short fromIntToShort(int b) {
        return (short) b;
    }

    static char fromIntToChar(int b) {
        return (char) b;
    }

    static int fromIntToInt(int b) {
        return b;
    }

    static long fromIntToLong(int b) {
        return b;
    }

    static float fromIntToFloat(int b) {
        return b;
    }

    static double fromIntToDouble(int b) {
        return b;
    }

    //from long
    static byte fromLongToByte(long b) {
        return (byte) b;
    }

    static short fromLongToShort(long b) {
        return (short) b;
    }

    static char fromLongToChar(long b) {
        return (char) b;
    }

    static int fromLongToInt(long b) {
        return (int) b;
    }

    static long fromLongToLong(long b) {
        return b;
    }

    static float fromLongToFloat(long b) {
        return b;
    }

    static double fromLongToDouble(long b) {
        return b;
    }

    //from float
    static byte fromFloatToByte(float b) {
        return (byte) b;
    }

    static short fromFloatToShort(float b) {
        return (short) b;
    }

    static char fromFloatToChar(float b) {
        return (char) b;
    }

    static int fromFloatToInt(float b) {
        return (int) b;
    }

    static long fromFloatToLong(float b) {
        return (long) b;
    }

    static float fromFloatToFloat(float b) {
        return b;
    }

    static double fromFloatToDouble(float b) {
        return b;
    }

    // from double
    static byte fromDoubleToByte(double b) {
        return (byte) b;
    }

    static short fromDoubleToShort(double b) {
        return (short) b;
    }

    static char fromDoubleToChar(double b) {
        return (char) b;
    }

    static int fromDoubleToInt(double b) {
        return (int) b;
    }

    static long fromDoubleToLong(double b) {
        return (long) b;
    }

    static float fromDoubleToFloat(double b) {
        return (float) b;
    }

    static double fromDoubleToDouble(double b) {
        return b;
    }
}
