package com.example.myhome.model

data class House(
    val markerId: String,
    val markerType: String,
    val latitude: Double,
    val longitude: Double,
    val complexName: String,
    val realEstateTypeCode: String,
    val realEstateTypeName: String,
    val completionYearMonth: String,
    val totalDongCount: Int,
    val totalHouseholdCount: Int,
    val floorAreaRatio: Int,
    val minDealUnitPrice: Int,
    val maxDealUnitPrice: Int,
    val minLeaseUnitPrice: Int,
    val maxLeaseUnitPrice: Int,
    val minLeaseRate: Int,
    val maxLeaseRate: Int,
    val minArea: String,
    val maxArea: String,
    val minDealPrice: Int,
    val maxDealPrice: Int,
    val minLeasePrice: Int,
    val maxLeasePrice: Int,
    val minRentPrice: Int,
    val maxRentPrice: Int,
    val minShortTermRentPrice: Int,
    val maxShortTermRentPrice: Int,
    val isDealShown: Boolean,
    val priceCount: Int,
    val representativeArea: Double,
    val medianDealUnitPrice: Int,
    val medianDealPrice: Int,
    val isPresales: Boolean,
    val representativePhoto: String,
    val photoCount: Int,
    val dealCount: Int,
    val leaseCount: Int,
    val rentCount: Int,
    val shortTermRentCount: Int,
    val totalArticleCount: Int,
    val existPriceTab: Boolean
)