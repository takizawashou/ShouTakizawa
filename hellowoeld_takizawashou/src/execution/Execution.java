package execution;

import java.text.SimpleDateFormat;
import java.util.Date;

import process.Process;


public class Execution {

    public static void main(String[] args) {

       Process msg = new Process("こんにちは！", "日本", "寿司", "和食");
    	
    	
       System.out.print( msg.greeting + "ここは" + msg.place + "です！");
       System.out.println("この" + msg.food + "はうまい");
       System.out.println(msg.food + "は" + msg.type + "です");
       Date nowDate = new Date();
       SimpleDateFormat sdf
   	   = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
   	   String formatNowDate = sdf.format(nowDate);
   	   System.out.println("今の現在時刻は" + formatNowDate + "です");
    }
}



