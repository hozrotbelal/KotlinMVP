package com.example.testmvp.data.managers

import com.example.testmvp.data.network.Address
import javax.inject.Singleton

@Singleton
internal object LocationManager {

    internal var divisions: List<Address.Division>? = null
    internal var districts: List<Address.District>? = null
    internal var thanas: List<Address.Thana>? = null
    internal var unions: List<Address.Union>? = null
    internal var allunions: List<Address.Union>? = null
}