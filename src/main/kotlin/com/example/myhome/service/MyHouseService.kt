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

    private var searchParameters: SearchParameters = SearchParameters()

    fun updateSearchParameters(
        priceMin: Long?,
        priceMax: Long?,
        areaMin: Int?,
        areaMax: Int?
        // 다른 필드도 필요에 따라 추가
    ) {
        priceMax?.let { searchParameters.priceMax = it }
        priceMin?.let { searchParameters.priceMin = it }
        areaMax?.let { searchParameters.areaMax = it }
        areaMin?.let { searchParameters.areaMin = it }

    }

    fun findHouses(): List<House> {
        val parameters = searchParameters.toMap()

        val apiResponse = httpClient.callExternalGet(naverLandUrl, parameters)
        val gson = Gson()

        val houseListType = object : TypeToken<ArrayList<House>>() {}.type

        return gson.fromJson<java.util.ArrayList<House>>(apiResponse, houseListType);
    }
}