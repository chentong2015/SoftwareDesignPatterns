package spi.jdbc_driver;

import java.sql.Driver;
import java.sql.DriverAction;

public class MyDriverInfo {

    final Driver driver;
    DriverAction da;

    MyDriverInfo(Driver driver, DriverAction action) {
        this.driver = driver;
        da = action;
    }

    @Override
    public boolean equals(Object other) {
        return (other instanceof MyDriverInfo) && this.driver == ((MyDriverInfo) other).driver;
    }

    @Override
    public int hashCode() {
        return driver.hashCode();
    }

    @Override
    public String toString() {
        return ("driver[className=" + driver + "]");
    }

    DriverAction action() {
        return da;
    }
}
