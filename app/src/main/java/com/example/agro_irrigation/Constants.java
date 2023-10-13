package com.example.agro_irrigation;

import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Constants {

    public static final int CONNECT_TIMEOUT = 60 * 1000;

    public static final int READ_TIMEOUT = 60 * 1000;

    public static final int WRITE_TIMEOUT = 60 * 1000;

    public static final String MPESA_BASE_URL = "https://sandbox.safaricom.co.ke/";
    public static final String BUSINESS_SHORT_CODE = "174379";
    public static final String PASSKEY = "bfb279f9aa9bdbcf158e97dd71a467cd2e0c893059b10f78e6b72ada1ed2c919";
    public static final String TRANSACTION_TYPE = "CustomerPayBillOnline";
    public static final String PARTYB = "174379"; //same as business shortcode above

    public static String URL = "http://157.245.143.110:5000/";
    public static final String CALLBACKURL = URL+"app/payment/index.php";

    public static final String BASE_URL = URL+"app/" ;

    public static void setWelcomeMessage(TextView txt_welcome,String userName) {
        int hour = Calendar.getInstance(TimeZone.getTimeZone("Africa/Nairobi")).get(Calendar.HOUR_OF_DAY);
        if(hour >= 1 && hour <= 12)
            txt_welcome.setText(new StringBuilder("Good Morning,\n").append(userName).append("."));
        else if(hour >= 13 && hour <= 17)
            txt_welcome.setText(new StringBuilder("Good Afternoon,\n").append(userName).append("."));
        else
            txt_welcome.setText(new StringBuilder("Good Evening,\n").append(userName).append("."));
    }
}
