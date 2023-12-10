package com.example.myhome.controller

import com.example.myhome.model.House
import com.example.myhome.service.MyHouseService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/house")
class MyHouseController(private val myHouseService: MyHouseService) {

    /**
     * 파라미터를 입력 안하면 defalut value를 가지고옴
     */
    @PostMapping("/updateParameters")
    fun updateSearchParameters(
        @RequestParam(required = false, defaultValue = "80000") priceMin: Long?,
        @RequestParam(required = false, defaultValue = "140000") priceMax: Long?,
        @RequestParam(required = false, defaultValue = "99") areaMin: Int?,
        @RequestParam(required = false, defaultValue = "132") areaMax: Int?
        // 다른 필드도 필요에 따라 추가
    ): ResponseEntity<String> {
        myHouseService.updateSearchParameters(priceMin, priceMax, areaMin, areaMax)

        return ResponseEntity.ok("Search parameters updated successfully.")
    }


    @GetMapping("/find")
    fun findHouses(): ResponseEntity<List<House>> {
        val houses = myHouseService.findHouses()
        return ResponseEntity.ok(houses)
    }

}