package queue_interface.hospital_triage_system;

import java.util.*;

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                // Higher severity patients are given priority (Descending order)
                return Integer.compare(p2.severity, p1.severity);
            }
        });

        // Adding patients to the queue
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Treating patients by priority
        while (!triageQueue.isEmpty()) {
            Patient nextPatient = triageQueue.poll();
            System.out.println("Treating: " + nextPatient);
        }
    }
}



