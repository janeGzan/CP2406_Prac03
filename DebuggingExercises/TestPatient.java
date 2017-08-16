public class TestPatient {

    public static void main(String args[])
    {
        Patient Annie = new Patient();
        Patient Bob = new Patient(1, 20, "AB");

        Annie.showRecord();
        Bob.showRecord();
    }
}
