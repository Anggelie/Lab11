package com.uvg.lab11anggelie.domain.repository

import com.uvg.lab11anggelie.data.model.Location

interface LocationRepository {
    suspend fun getLocations(): List<Location>
    suspend fun getLocationById(id: Int): Location
}