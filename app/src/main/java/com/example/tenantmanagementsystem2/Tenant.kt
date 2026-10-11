package com.example.tenantmanagementsystem2

data class Tenant(
    val name: String,
    val phone: String,
    val rent: String
) {
    fun summary(): String {
        // Challenge 2: Change summary to show "Rent paid"
        return "Tenant: $name\nPhone: $phone\nRent paid: KSh $rent"
    }
}