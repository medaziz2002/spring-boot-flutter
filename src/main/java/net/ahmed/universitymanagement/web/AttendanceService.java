package net.ahmed.universitymanagement.web;

import net.ahmed.universitymanagement.entities.Attendance;
import net.ahmed.universitymanagement.repositories.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    public Attendance createAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public List<Attendance> getAllAttendances() {
        return attendanceRepository.findAll();
    }

    public Optional<Attendance> getAttendanceById(String id) {
        return attendanceRepository.findById(id);
    }

    public Attendance updateAttendance(String id, Attendance attendance) {
        Attendance existingAttendance = attendanceRepository.findById(id).get();
        existingAttendance.setStudent(attendance.getStudent());
        existingAttendance.setSubject(attendance.getSubject());
        existingAttendance.setDate(attendance.getDate());
        existingAttendance.setPresent(attendance.isPresent());
        return attendanceRepository.save(existingAttendance);
    }

    public void deleteAttendance(String id) {
        attendanceRepository.deleteById(id);
    }
}

