package com.example.myhome.model

data class SearchParameters(
    val cortarNo: String = "4113511100",
    val zoom: String = "16",
    val priceType: String = "RETAIL",
    val markerId: String = "",
    val markerType: String = "",
    val selectedComplexNo: String = "",
    val selectedComplexBuildingNo: String = "",
    val fakeComplexMarker: String = "",
    val realEstateType: String = "APT:ABYG:JGC:PRE",
    val tradeType: String = "A1",
    val rentPriceMin: Long = 0,
    val rentPriceMax: Long = 900000000,
    var priceMin: Long = 80000,
    var priceMax: Long = 140000,
    var areaMin: Int = 99,
    var areaMax: Int = 132,
    val oldBuildYears: String = "",
    val recentlyBuildYears: String = "",
    val minHouseHoldCount: String = "",
    val maxHouseHoldCount: String = "",
    val showArticle: Boolean = false,
    val sameAddressGroup: Boolean = false,
    val minMaintenanceCost: String = "",
    val maxMaintenanceCost: String = "",
    val directions: String = "",
    val leftLon: String = "127.091919",
    val rightLon: String = "127.1640167",
    val topLat: String = "37.3734932",
    val bottomLat: String = "37.3462386",
    val isPresale: Boolean = true
)

fun SearchParameters.toMap(): Map<String, Any> {
    return mapOf(
        "cortarNo" to cortarNo,
        "zoom" to zoom,
        "priceType" to priceType,
        "markerId" to markerId,
        "markerType" to markerType,
        "selectedComplexNo" to selectedComplexNo,
        "selectedComplexBuildingNo" to selectedComplexBuildingNo,
        "fakeComplexMarker" to fakeComplexMarker,
        "realEstateType" to realEstateType,
        "tradeType" to tradeType,
        "rentPriceMin" to rentPriceMin,
        "rentPriceMax" to rentPriceMax,
        "priceMin" to priceMin,
        "priceMax" to priceMax,
        "areaMin" to areaMin,
        "areaMax" to areaMax,
        "oldBuildYears" to oldBuildYears,
        "recentlyBuildYears" to recentlyBuildYears,
        "minHouseHoldCount" to minHouseHoldCount,
        "maxHouseHoldCount" to maxHouseHoldCount,
        "showArticle" to showArticle,
        "sameAddressGroup" to sameAddressGroup,
        "minMaintenanceCost" to minMaintenanceCost,
        "maxMaintenanceCost" to maxMaintenanceCost,
        "directions" to directions,
        "leftLon" to leftLon,
        "rightLon" to rightLon,
        "topLat" to topLat,
        "bottomLat" to bottomLat,
        "isPresale" to isPresale
    )
}