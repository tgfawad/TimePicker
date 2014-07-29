package nl.tudleft.kiiwii.timepicker;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Created by fawadkhan on 7/24/14.
 */

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(),this, hour, minute, true);
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute){

        System.out.println(" Time is : " +  hourOfDay + " " + minute);
        // here is the time that will get back after choosing.
    }
}
