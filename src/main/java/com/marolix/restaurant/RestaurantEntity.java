package com.marolix.restaurant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RestaurantEntity {
    @Id	
    private Integer id;
    private String user_Name;
    private String mobileNumber;
    private String restaurantname;
    private String reservationStatus;

    public RestaurantEntity() {
        super();
    }

    public RestaurantEntity(String user_Name, String mobileNumber, Integer id, String restaurantname,
            String reservationStatus) {
        super();
        this.user_Name = user_Name;
        this.mobileNumber = mobileNumber;
        this.id = id; 
        this.restaurantname = restaurantname;
        this.reservationStatus = reservationStatus;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getRestaurantname() {
        return restaurantname;
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return "RestaurantEntity [user_Name=" + user_Name + ", mobileNumber=" + mobileNumber + ", id=" + id
                + ", restaurantname=" + restaurantname + ", reservationStatus=" + reservationStatus + "]";
    }
}
