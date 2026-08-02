package com.mohcine.pcmanager.core.system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeInfo {

    public String getCurrentDateTime() {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return now.format(formatter);

    }

}