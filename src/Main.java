/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Stampa i risultati sulla console
Crea dei test per questo esercizio
*/

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {

    public static int getDateYear (String input) {
        return OffsetDateTime.parse(input).getYear();
    }

    public static Month getDateMonth (String input) {
        return OffsetDateTime.parse(input).getMonth();
    }

    public static int getDateDay (String input) {
        return OffsetDateTime.parse(input).getDayOfMonth();
    }

    public static DayOfWeek getDateDayOfWeek (String input) {
        return OffsetDateTime.parse(input).getDayOfWeek();
    }
}