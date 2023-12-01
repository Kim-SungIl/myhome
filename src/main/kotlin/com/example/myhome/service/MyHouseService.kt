package com.example.myhome.service

import com.example.myhome.component.HttpClient
import com.example.myhome.model.House
import com.example.myhome.model.SearchParameters
import com.example.myhome.model.toMap
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class MyHouseService(private val httpClient: HttpClient) {

    @Value("\${naver.land.url}")
    private lateinit var naverLandUrl: String

    // TODO: parameter 다음것들 받아서 변경해야함
    /*
    parameters.rentPriceMin = "50000"
    parameters.rentPriceMax = "800000000"
    parameters.priceMin = "80000"
    parameters.priceMax = "150000"
    parameters.areaMax = "700000000"
    parameters.leftLon = "126.9881899"
    parameters.rightLon = "127.2242388"
    parameters.topLat = "37.4612162"
    parameters.bottomLat = "37.297588"
     */
    fun findHouses(): List<House> {
        val parameters = SearchParameters().toMap()

        val apiResponse = httpClient.callExternalGet(naverLandUrl, parameters)
        val gson = Gson()

        val houseListType = object : TypeToken<ArrayList<House>>() {}.type

        return gson.fromJson<java.util.ArrayList<House>>(apiResponse, houseListType);
    }
}