package com.viktoriia_abakumova.task11.xml;

import lombok.Getter;
import lombok.Setter;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "timeSlot"
})
@XmlRootElement(name = "searchFreeTimeSlotResponse")
public class SearchFreeTimeSlotResponse {

    @XmlElement(required = true)
    protected String timeSlot;
}