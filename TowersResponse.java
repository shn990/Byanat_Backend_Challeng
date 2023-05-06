package com.challenge.challenge;

public class TowersResponse {
    private Integer tower_id;
    private String operator;
    private String address;
    private Long height;
    private String tower_type;
    private Long latitude;
    private Long longtude;
    private String technology;

    public Integer getTower_id(){
        return tower_id;
    }
    public void setTower_id(Integer tower_id){
        this.tower_id = tower_id;
    }
    //operator
    public String getOperator(){
        return operator;
    }
    public void setOperator(String operator){
        this.operator = operator;
    }
    //address
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    //height
    public Long getHeight(){
        return height;
    }
    public void setHeight(Long height){
        this.height = height;
    }
    //tower_type
    public String getTower_type(){
        return tower_type;
    }
    public void setTower_type(String tower_type){
        this.tower_type = tower_type;
    }
    //latitude
    public Long getLatitude(){
        return latitude;
    }
    public void setLatitude(Long latitude){
        this.latitude = latitude;
    }
    //longtude
    public Long getLongtude(){
        return longtude;
    }
    public void setLongtude(Long longtude){
        this.longtude = longtude;
    }
    //technology
    public String getTechnology(){
        return technology;
    }
    public void setTechnology(String technology){
        this.technology = technology;
    }

    
}
