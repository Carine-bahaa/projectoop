import filehandlingexample.FileHandling;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import static filehandlingexample.FileHandling.readFromFile;
import static filehandlingexample.FileHandling.writeToFile;

public class Patient extends User {
    private int age;
    private String bloodType;
    private float weight;
    private float height;
    private String mobileNum;
    private String[] patientHistory;
    private String  gender;
    public Patient (String username, String password, String firstName, String lastName, String email, String mobileNum, String[] patientHistory,
                    int age,String gender ,String bloodType, float weight, float height) {
        super(username, password, firstName, lastName, email, mobileNum);
        this.patientHistory = patientHistory;
        this.age = age;
        this.gender = gender;
        this.bloodType = bloodType;
        this.weight = weight;
        this.height = height;
    }
    public static void changeWeight(float weight,float newWeight )
    {
        int size= data.Patients.size();
        for (int i = 0; i <size; i++)
        {
            if(data.Patients.get(i).getWeight() == weight)
            {
                data.Patients.get(i).setWeight(newWeight);
                break;
            }

        }
    }
    public static void changeHeight(float height,float newHeight )
    {
        int size= data.Patients.size();
        for (int i = 0; i <size; i++)
        {
            if(data.Patients.get(i).getHeight() == height)
            {
                data.Patients.get(i).setHeight(newHeight);
                break;
            }

        }
    }
    public static void changeEmail(String email,String newEmail )
    {
        int size= data.Patients.size();
        for (int i = 0; i <size; i++)
        {
            if(data.Patients.get(i).getEmail().equals (email))
            {
                data.Patients.get(i).setEmail(newEmail);
                break;
            }

        }
    }
    public static void changeMobileNum(String mobilenum,String newMobileNm )
    {
        int size= data.Patients.size();
        for (int i = 0; i <size; i++)
        {
            if(data.Patients.get(i).getMobileNum().equals (mobilenum))
            {
                data.Patients.get(i).setMobileNum(newMobileNm);
                break;
            }

        }
    }
    // Getters and Setters
    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String[] getPatientHistory() {return patientHistory;}

    public void setAvailableDays(String[] patientHistory) {
        this.patientHistory = patientHistory;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void getPatientHistory(String[] patientHistory) {
        this.patientHistory = patientHistory;
    }

    public String getGender() {
        return gender;
    }

    public void getGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "age=" + age +
                ", bloodType='" + bloodType + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", mobileNum='" + mobileNum + '\'' +
                ", User Info=" + super.toString() +
                '}';
    }
}