package com.Template.helper;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Helper {
    public static String formatLocalDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id"));
        return date.format(formatter);
    }

    public static String formatCurrency(BigDecimal amount) {
        DecimalFormat formatter = new DecimalFormat("#,###.##");

        String formattedAmount = formatter.format(amount);

        return "Rp. " + formattedAmount;
    }
}
