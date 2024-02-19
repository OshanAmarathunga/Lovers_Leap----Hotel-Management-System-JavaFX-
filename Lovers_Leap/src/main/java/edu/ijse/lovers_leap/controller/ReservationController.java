package edu.ijse.lovers_leap.controller;

import edu.ijse.lovers_leap.dto.ReservationDto;
import edu.ijse.lovers_leap.service.ServiceFactory;
import edu.ijse.lovers_leap.service.custom.ReservationService;

import java.util.ArrayList;

public class ReservationController {
    private ReservationService reservationService= (ReservationService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESERVATION);

    public String saveReservation(ReservationDto dto) throws Exception{
        return reservationService.saveReservation(dto);
    }

    public String updateReservation(ReservationDto dto) throws Exception{
        return reservationService.updateReservation(dto);
    }
    public String deleteReservation(int id) throws Exception{
        return reservationService.deleteReservation(id);
    }

    public ArrayList<ReservationDto> getAll() throws Exception{
        return reservationService.getAll();
    }


}