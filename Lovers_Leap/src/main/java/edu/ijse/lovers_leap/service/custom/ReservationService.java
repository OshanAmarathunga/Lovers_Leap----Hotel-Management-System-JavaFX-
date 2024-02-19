package edu.ijse.lovers_leap.service.custom;

import edu.ijse.lovers_leap.dto.ReservationDto;
import edu.ijse.lovers_leap.service.SuperService;

import java.util.ArrayList;

public interface ReservationService extends SuperService {
    String saveReservation(ReservationDto dto) throws Exception;
    String updateReservation(ReservationDto dto) throws Exception;
    String deleteReservation(int id) throws Exception;
    ArrayList<ReservationDto> getAll() throws Exception;
}