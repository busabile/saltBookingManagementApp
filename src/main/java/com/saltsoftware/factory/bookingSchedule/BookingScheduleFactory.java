package com.saltsoftware.factory.bookingSchedule;

import com.saltsoftware.entity.bookingSchedule.BookingSchedule;
import com.saltsoftware.util.GenericHelper;

/**
 * Created by :Craig Carr AKA Fish84
 * Student no: 204111307
 * Desc: Create BookingSchedule Factory
 */

public class  BookingScheduleFactory {
    //BuildBookingSchedule with parameter
    public static BookingSchedule buildBookingSchedule(String empID) {

        String bookingID = GenericHelper.generateID();

        BookingSchedule bookingSchedule = new BookingSchedule.Builder()
                .setBookingID(bookingID)
                .build();
        return bookingSchedule;
    }


    //CreateBookingSchedule without parameter
    public static BookingSchedule createBookingSchedule(){

        //Making use of generic helper utility
        String bookingID = GenericHelper.generateBookingID();

        // Check bookingId
        BookingSchedule bookingSchedule = new BookingSchedule.Builder()
                .setBookingID(bookingID)
                .build();

        return bookingSchedule;
    }
    }

