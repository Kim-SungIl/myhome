package com.example.myhome.component

import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder

@Component
class HttpClient (val restTemplate: RestTemplate){
    fun callExternalGet(apiUrl:String, parameters:Map<String, Any>): String {
        // 매개변수를 포함한 URI를 빌드
        val uri = UriComponentsBuilder.fromUriString(apiUrl)
            .apply {
                parameters.forEach { (key, value) -> queryParam(key, value) }
            }
            .build()
            .toUriString()

        // API 호출
        val response = restTemplate.getForObject(uri, String::class.java)

        // response 처리
        // 이거를 ArrayList<House>로 변환해야함
        return response ?: "Error!!!!!"
    }
}

fun main() {
    // Create an instance of RestTemplate
    val restTemplate = RestTemplate()

    // Create an instance of HttpClient
    val httpClient = HttpClient(restTemplate)

    // Define API URL and parameters
    val apiUrl = "https://new.land.naver.com/api/complexes/single-markers/2.0"
    val parameters = mapOf(
        "cortarNo" to "4113511100",
        "zoom" to "16",
        "priceType" to "RETAIL",
        "markerId" to "",
        "markerType" to "",
        "selectedComplexNo" to "",
        "selectedComplexBuildingNo" to "",
        "fakeComplexMarker" to "",
        "realEstateType" to "APT:ABYG:JGC:PRE",
        "tradeType" to "A1",
        "rentPriceMin" to "0",
        "rentPriceMax" to "900000000",
        "priceMin" to "100000",
        "priceMax" to "120000",
        "areaMin" to "0",
        "areaMax" to "900000000",
        "oldBuildYears" to "",
        "recentlyBuildYears" to "",
        "minHouseHoldCount" to "",
        "maxHouseHoldCount" to "",
        "showArticle" to "false",
        "sameAddressGroup" to "false",
        "minMaintenanceCost" to "",
        "maxMaintenanceCost" to "",
        "directions" to "",
        "leftLon" to "127.0881899",
        "rightLon" to "127.1242388",
        "topLat" to "37.3612162",
        "bottomLat" to "37.347588",
        "isPresale" to "true"
    )

    // Call the external API
    val response = httpClient.callExternalGet(apiUrl, parameters)

    // Process the response as needed
    println("Response from the external API: $response")
}
