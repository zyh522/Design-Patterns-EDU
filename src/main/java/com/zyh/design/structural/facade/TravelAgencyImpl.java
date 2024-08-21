package com.zyh.design.structural.facade;

/**
 * @author zhuyh
 * @version v1.0
 * @description 旅行社实现(外观实现类)
 * @date 2024/8/21
 **/
public class TravelAgencyImpl implements TravelAgency{

    private final HotelService hotelService;

    private final SightService sightService;

    private final TicketService ticketService;

    public TravelAgencyImpl() {
        hotelService = new HotelService();
        sightService = new SightService();
        ticketService = new TicketService();
    }

    @Override
    public void trip() {
        ticketService.buyTicket();
        hotelService.bookRoom();
        sightService.sight();
        System.out.println("准备好了！出发！");
    }
}
