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