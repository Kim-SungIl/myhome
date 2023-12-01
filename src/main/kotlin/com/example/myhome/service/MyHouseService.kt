package com.example.myhome.service

import com.example.myhome.component.HttpClient
import com.example.myhome.model.House
import org.springframework.stereotype.Service

@Service
class MyHouseService (private val httpClient:HttpClient){
    fun findHouses () :List<House>{
        return ArrayList<House>();
    }
}