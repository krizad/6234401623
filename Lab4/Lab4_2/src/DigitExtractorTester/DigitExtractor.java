
package DigitExtractorTester;
public class DigitExtractor{
private int number;
//Constructor รับเลขจำนวนเต็มที่ต้องการจะแยกออกทีละหลัก
public DigitExtractor(int anInteger) {
    number = anInteger;
}
// คืนเลขหลักถัดไปที่ต้องการแยกออกมา
public int nextDigit() {
    int digit = number%10;
    number = number/10;
    return digit;
}
}