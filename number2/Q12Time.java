/**
 * Name : Irsyad Fikriansyah Ramadhan
 * NRP  : 5025211149
 * Class: IF184301 Object Oriented Programming (E)
 */
 
// File: Q12Time.java
public class Q12Time {
  /**
   * properties hour and minute stored as int
   * angle() funtion will getting the angle (from hour hand to minute hand
   * counter clokwise) with hour and minute  inputs
   * 
   * how to calculate the angle?
   * The minute hand moves 360 degrees in 60 minute(or 6 degrees in one minute)
   * and hour hand moves 360 degrees in 12 hours(or 0.5 degrees in 1 minute). 
   * In h hours and m minutes (from 12:00), the minute hand would move m * 6 and 
   * hour hand would move (h * 60 + m) * 0.5. 
   * 
   * how to know if the angle is from hour hand counter clockwise?
   * if the minute pass the hour hand, than the angle is the bigger one
   * if the hour pass the minute hand, than the angle is the smaller one
   * this can be checked by using method above:
   * hour location = (h * 60 + m) * 0.5, minute location = m * 6
   * if hour location > minute location, then it's the smaller angle
   */

  // properties/fields
  private int hour;
  private int minute;

  // constructor
  public Q12Time(int hour, int minute) {
    this.hour = hour;
    this.minute = minute;
  }

  // function for getting the angle
  public static int angle(int hour, int minute) {
    hour %= 12; // to convert hour to 12 base
    if (minute == 60) {
      hour++;
      minute = 0;
    }

    // calculating angle
    int hourAngle = (int) (0.5 * (hour * 60 + minute));
    int minuteAngle = minute * 6;

    int angle = Math.abs(hourAngle - minuteAngle);

    // checking if the angle is from hour hand clockwise
    if (0.5 * (hour * 60 + minute) < minute * 6) {
      angle = 360 - angle;
    }

    return angle;
  }

  public static void main(String[] args) {
    /**
     * testing the calss with:
     * 9:00, 3:00, 18:00, 1:00, 2:30, and 4:41
     * (with results 270˚, 90˚, 180˚, 30˚, 255˚, and 254˚, respectively).
     */

    // making & testing 09:00
    Q12Time time = new Q12Time(9, 0);
    System.out.printf("%d˚\n", angle(time.hour, time.minute));

    // making & testing 03:00
    time = new Q12Time(3, 0);
    System.out.printf("%d˚\n", angle(time.hour, time.minute));

    // making & testing 18:00
    time = new Q12Time(18, 0);
    System.out.printf("%d˚\n", angle(time.hour, time.minute));

    // making & testing 01:00
    time = new Q12Time(1, 0);
    System.out.printf("%d˚\n", angle(time.hour, time.minute));

    // making & testing 02:30
    time = new Q12Time(2, 30);
    System.out.printf("%d˚\n", angle(time.hour, time.minute));

    // making & testing 04:41
    time = new Q12Time(4, 41);
    System.out.printf("%d˚\n", angle(time.hour, time.minute));

  }
}