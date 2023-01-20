package com.example.demo.services;
import com.example.demo.entitites.Flight;
import com.example.demo.entitites.User;
import com.example.demo.repositories.FlightsRepository;
import com.example.demo.repositories.UserRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private UserRepository userRepository;
    private FlightsRepository flightRepository;
    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static Pattern pattern;
    private Matcher matcher;

    public Validation() {
        pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
    }

    public boolean validateEmail(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean uniqueEmail(String email){
        List<User> list= userRepository.findAll();
        for(User user : list){
            if(user.getMail()==email)
                return false;
        }
        return true;
    }

    public boolean uniqueUsername(String username){
        List<User> list= userRepository.findAll();
        for(User user : list){
            if(user.getUserName()==username)
                return false;
        }
        return true;
    }

    private static final String PHONE_REGEX = "^+\\d[0-9]{10}$";

    public static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public boolean validateReservation(UUID id_flight,UUID id_client) {
        int ok = 0;
        List<User> list = userRepository.findAll();
        List<Flight> list2 = flightRepository.findAll();
        for (User user : list) {
            if (user.getID() == id_client)
                ok = ok + 1;
        }
        for (Flight flight : list2) {
            if (flight.getID() == id_flight)
                ok = ok + 1;
        }
        if (ok != 2) return false;
        return true;
    }
    public static boolean isValidTime(String time)
    {
        String regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";

        Pattern p = Pattern.compile(regex);

        if (time == null) {
            return false;
        }
        Matcher m = p.matcher(time);
        return m.matches();
    }

    public static boolean validateJavaDate(String strDate)
    {
        if (strDate.trim().equals(""))
        {
            return true;
        }
        else
        {
            SimpleDateFormat sdfrmt = new SimpleDateFormat("dd.MM.yyyy");
            sdfrmt.setLenient(false);

            try
            {
                Date javaDate = sdfrmt.parse(strDate);
            }
            catch (ParseException e)
            {
                return false;
            }
            return true;
        }
    }
}
