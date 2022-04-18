package com.example.mkk

class PhoneNumberValidator {

    fun validate(phoneText: String): Int? = when {
//        phoneText.all { it.isDigit() } -> R.string.helper_enter_phone_number
        phoneText.matches(ALLOWED_CHARACTERS.toRegex()) -> R.string.helper_enter_phone_number
        phoneText.length != PHONE_LENGTH -> R.string.helper_enter_phone_number
        else -> null
    }

    companion object {
        const val PHONE_LENGTH = 12
        const val ALLOWED_CHARACTERS = ".*[0-9].*"
    }
}
