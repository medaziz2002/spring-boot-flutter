package net.ahmed.universitymanagement.repositories;

import net.ahmed.universitymanagement.entities.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, String> {
}
