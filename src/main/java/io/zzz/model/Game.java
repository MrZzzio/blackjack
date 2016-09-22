package io.zzz.model;

import java.util.Date;

/**
 * Created by dmitry on 21.09.16.
 */

public class Game {
    private Date startDate;

    public Game(Date date) {
        this.startDate = date;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
