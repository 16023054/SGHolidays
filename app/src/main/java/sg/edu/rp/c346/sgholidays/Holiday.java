package sg.edu.rp.c346.sgholidays;

import java.util.Date;

/**
 * Created by 16023054 on 23/4/2018.
 */

public class Holiday {
    private String name;
    private Date date;
    private String image;
    public Holiday(String name, Date date, String image){
        this.name = name;
        this.date = date;
        this.image = image;
    }
    public String getName() {
        return name;}
    public Date getDate(){
        return date;
    }
    public String image(){
        return image;
    }

}
