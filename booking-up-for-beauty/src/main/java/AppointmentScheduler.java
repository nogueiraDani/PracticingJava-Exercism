import java.time.LocalDate;
import java.time.LocalDateTime;
import static java.lang.Integer.parseInt;

class AppointmentScheduler {
    /*
    Outra forma de formatar as datas:
    private static final DateTimeFormatter APPOINTMENT_FORMATTER = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss");
    private static final DateTimeFormatter DESCRIPTION_FORMATTER = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");

     */


    public LocalDateTime schedule(String appointmentDateDescription) {
        String[] valuesAppointment =
                appointmentDateDescription.replace("/", "-").replace(" ",
                        "-").replace(":", "-").split("-");

        LocalDateTime localDateTime =
                LocalDateTime.of(parseInt(valuesAppointment[2]),
                        parseInt(valuesAppointment[0]),
                        parseInt(valuesAppointment[1]),
                        parseInt(valuesAppointment[3]),
                        parseInt(valuesAppointment[4]),
                        parseInt(valuesAppointment[5]));

        return localDateTime;

        /*
        return LocalDateTime.parse(appointmentText, APPOINTMENT_FORMATTER);
         */
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime localDateTimeToday = LocalDateTime.now();
        return localDateTimeToday.isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return (appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18);
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String dayOfWeek = appointmentDate.getDayOfWeek().name();
        String dayOfWeekWithUpper =
                dayOfWeek.substring(0, 1).toUpperCase() + dayOfWeek.substring(1).toLowerCase();


        String month = appointmentDate.getMonth().name();
        String monthWithUpper =
                month.substring(0, 1).toUpperCase() +
                        month.substring(1).toLowerCase();

        return "You have an appointment on %s, %s %d, %d, at %d:%s%s"
                .formatted(dayOfWeekWithUpper, monthWithUpper,
                        appointmentDate.getDayOfMonth(),
                        appointmentDate.getYear(),
                        appointmentDate.getHour() > 12 ? appointmentDate.getHour() - 12 : appointmentDate.getHour(),
                        appointmentDate.getMinute() < 10 ? "0" + appointmentDate.getMinute() : appointmentDate.getMinute(),
                        appointmentDate.getHour() >= 12 ? " PM." : " AM.");

        /*
        return "You have an appointment on " + DESCRIPTION_FORMATTER.format(appointmentDate) + ".";
         */
    }

    public LocalDate getAnniversaryDate() {
        LocalDate localDate = LocalDate.now();
        return LocalDate.of(localDate.getYear(), 9, 15);
    }
}
