package main.java.week_7.practice_problems;

public class Locker {
    private final int lockerNumber;
    private String combinationCode;

    public Locker(int lockerNumber, String initialCode) {
        this.lockerNumber = lockerNumber;
        this.combinationCode = initialCode;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (!this.combinationCode.equals(currentCode)) {
            System.out.println("Change code rejected: incorrect current code");
            return false;
        }
        this.combinationCode = newCode;
        System.out.println("Locker " + lockerNumber + " code successfully updated");
        return true;
    }

    public int getLockerNumber() {
        return this.lockerNumber;
    }

    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
    }
}
