package com.globalexchange.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/diary/*")
public class DiaryController {

    // 일기 상세 페이지
    @GetMapping("/info")
    public void main(){

    }
    //새로운 교환일기 파트너 신청
    @GetMapping("/newDiaryPartnerSignup")
    public void newDiaryPartnerSignup(){

    }

}