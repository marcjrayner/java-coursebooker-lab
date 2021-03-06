package com.codeclan.example.coursebooker.repository;

import com.codeclan.example.coursebooker.models.Booking;
import com.codeclan.example.coursebooker.projections.EmbedCustomersAndCourseForBookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCustomersAndCourseForBookings.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingsByDate(String date);
}
