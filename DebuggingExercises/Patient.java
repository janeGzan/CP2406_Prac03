class Patient {

    private int idNumber;
    private int age;
    private String bloodData;

    Patient()
    {
        idNumber = 0;
        age = 0;
        bloodData = "O+";
    }
    Patient(int idNumber, int age, String bloodData)
    {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = bloodData;
    }

    void showRecord()
    {
        System.out.println(String.format("%s is %s and blood type is %s", idNumber, age, bloodData));
    }
}
