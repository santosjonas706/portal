package br.com.portalNoticia.Controller.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
<<<<<<< HEAD
=======
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f

public class Url {
    public static String decodeParam(String text) {
        try {
            return URLDecoder.decode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
<<<<<<< HEAD
}
=======

    public static Date convertStringToDate(String textDate, Date defaultValue) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            return sdf.parse(textDate);
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
