package com.zyh.design.structural.facade.example;

import com.zyh.design.structural.facade.TravelAgency;
import com.zyh.design.structural.facade.TravelAgencyImpl;

/**
 * @author zhuyh
 * @version v1.0
 * @description 外观模式:
 *                  外观模式（门面模式）是一种结构型设计模式。它提供一个统一的接口，用于访问子系统中的一组接口，隐藏了系统的复杂性。
 *      案例：
 *          旅行社：我们计划去旅行时，可以选择找一家旅行社来帮助我们安排旅行的各种事，
 *                如订机票、预定酒店、预定门票等。这些复杂的事情都不需要我们来关心。
 *          旅行社可以看作是一个外观对象，它为客户提供了一个统一的接口，
 *          隐藏了许多复杂的流程和细节，并与各个供应商进行协调
 * @date 2024/8/21
 **/
public class FacadeExample {

    public static void main(String[] args) {

        TravelAgency travelAgency = new TravelAgencyImpl();

        travelAgency.trip();

    }
}
