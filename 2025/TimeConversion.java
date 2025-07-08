/*
 Given a time in -hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */

class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String period = s.substring(s.length()- 2);
        String[] timeParts = s.substring(0, 8).split(":");
        
        int hours = Integer.parseInt(timeParts[0]);
        String minutes = timeParts[1];
        String seconds = timeParts[2];
        
        if(period.equals("AM")) {
            if(hours == 12) {
                hours = 0;
            } 
        } else {
            if(hours != 12) {
                hours += 12;
            }
        }
        
        return String.format("%02d:%s:%s", hours, minutes, seconds);
    }

}

