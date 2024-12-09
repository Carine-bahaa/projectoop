import java.util.List;
import java.util.Scanner;
import filehandlingexample.FileHandling;
import static filehandlingexample.FileHandling.readFromFile;
import java.util.Arrays;


public class AppointmentReservation {
    private String day;  // Day of the week
    private String timeSlot; // Format: HH:MM
    private String patient;
    private  String doctor;
    public boolean is_booked;
    private static final String FILE_NAME = "appointments.txt";

    // Constructor


    public void BookAppointment(String day, String timeSlot, Doctor doctor, String patientName) {
        // Check if the doctor is available on the requested day
        boolean isAvailableDay = Arrays.asList(doctor.getAvailableDays()).contains(day);

        // Check if the time slot is within doctor's available hours
        boolean isAvailableTime = false;
        for (int[] hours : doctor.getAvailableHours()) {
            int start = hours[0];
            int end = hours[1];
            int requestedTime = Integer.parseInt(timeSlot); // Assume timeSlot is a single integer, e.g., "10"
            if (requestedTime >= start && requestedTime <= end) {
                isAvailableTime = true;
                break;
            }
        }

        // Attempt to book if both checks pass
        if (isAvailableDay && isAvailableTime && !this.is_booked) {
            this.is_booked = true;
            this.patient = patientName;
            this.doctor = doctor.getFirstName();
            System.out.println("Appointment booked successfully for " + patientName + " with Dr. " + doctor.getFirstName() +
                    " on " + day + " at " + timeSlot + ":00.");
        } else if (this.is_booked) {
            System.out.println("This slot is already booked.");
        } else {
            System.out.println("Doctor is unavailable at the requested time. Please try a different slot.");
        }
    }

    public void CancelAppointment ( String patientName)
    {
        if(this.is_booked)
        {
            is_booked=false;
            int size = data.Appointments.size();
            for(int i=0 ; i< size ; i++)
            {
               if(data.Appointments.get(i).getPatient().equals(patientName))
               {
                   data.Appointments.remove(i);
               }

            }
            System.out.println("Cancellation is done. ");
        }
        else
        {
            System.out.println("You haven't booked an Appointment yet !!!");
        }
    }

    // Getters and Setters
    public String getPatient() {
        return patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    // Display Appointment Details
    public void displayAppointmentDetails()
    {
        System.out.println("Appointment Details:");
        System.out.println("Day: " + day);
        System.out.println("Time Slot: " + timeSlot);

    }

    @Override
    public String toString() {
        return "AppointmentReservation{" +
                ", day='" + day + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                '}';
    }
}