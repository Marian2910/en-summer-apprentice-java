//package com.Endava.EventTix.Model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "EventType")
//public class EventType {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Integer eventTypeID;
//    String eventTypeName;
//
//    public EventType(Integer eventTypeID, String eventTypeName) {
//        this.eventTypeID = eventTypeID;
//        this.eventTypeName = eventTypeName;
//    }
//
//    public EventType() {}
//
//    public Integer getEventTypeID() {
//        return eventTypeID;
//    }
//
//    public void setEventTypeID(Integer eventTypeID) {
//        this.eventTypeID = eventTypeID;
//    }
//
//    public String getEventTypeName() {
//        return eventTypeName;
//    }
//
//    public void setEventTypeName(String eventTypeName) {
//        this.eventTypeName = eventTypeName;
//    }
//
//    @Override
//    public String toString() {
//        return "EventType{" +
//                "eventTypeID=" + eventTypeID +
//                ", eventTypeName='" + eventTypeName + '\'' +
//                '}';
//    }
//}
