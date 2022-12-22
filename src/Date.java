import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Date {

    private static int _year;
    private static int _month;
    private static int _day;
    private static boolean _leapyear;
    private static String _weekDay;

    public static void main(String[] args) throws DateException {
        _setDate(29, 2,2000);
        _calculateWeekday();
        System.out.println(_toString());

    }

    public static void _setDate ( int _dd , int _mm , int _yyyy ) throws DateException {
    _year = _yyyy; _month = _mm; _day = _dd;

    _leapyear = _year % 4 == 0 && _year % 100 != 0;

        if ( 0 > _dd ^ _dd > 31)
        {
            throw new DateException("Invalid Date! (day)");
        }

        if ( 0 < _mm ^ 13 > _mm )
        {
            throw new DateException ("Invalid Date! (month)");
        }
        Integer[] _list = {1,3,5,7,8,10,12};
        List<Integer> _l = (List<Integer>) Arrays.asList(_list);
        ArrayList<Integer> _list31 =  new ArrayList<Integer>(_l);

        if ( !_list31.contains ( _mm ) )
        {
        if ( _day == 31 ){ throw new DateException("Invalid Date! (day) ");}
        }
        if ( _mm == 2)
        {
            if ( _day > 29 )
            {
                throw new DateException("Invalid Date! (february) ");
            }
            if ( _day > 28 && !_leapyear)
            {
                throw new DateException("Invalid Date! (february");
            }
        }

    _calculateWeekday();

    }

    public static void _calculateWeekday ( ) throws DateException {
        int _customMonth = _month;
        int _customDay = _day;
        int _customYear = _year;
        int x;

        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (_customMonth < 3)
            _customYear--;
        x =  (_customYear + _customYear / 4 - _customYear / 100 + _customYear / 400 + t[_customMonth - 1]
                + _customDay)
                % 7;

        switch ( x ) {
            case 1 -> _weekDay = "Monday";
            case 2 -> _weekDay = "Tuesday";
            case 3 -> _weekDay = "Wednesday";
            case 4 -> _weekDay = "Thursday";
            case 5 -> _weekDay = "Friday";
            case 6 -> _weekDay = "Saturday";
            case 0 -> _weekDay = "Sunday";
        }


    }

    public static String _toString ()
    {
        String _resultString;

        _resultString = _weekDay + ", the " + _day + "." + _month + "." + _year;

        return _resultString;
    }


}