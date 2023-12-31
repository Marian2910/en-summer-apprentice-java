package com.Endava.EventTix.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrdersDTOInput {
    private int eventID;
    private int ticketCategoryId;
    private int numberOfTickets;
}
