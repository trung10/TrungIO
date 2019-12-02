package com.example.model

import com.example.model.userdata.UserEvent

/**
 * Data
 */
data class User(
    /**
     *
     */
    val uid: String,

    /**
     *
     */
    val fcmIds: List<String>,

    /**
     *
     */
    val isRegistered: Boolean,

    /**
     *
     */
    val events: List<UserEvent>
) {
    inline fun <reified T : Enum<T>> safeValueOf(type: String?): T? {
        return java.lang.Enum.valueOf(T::class.java, type)
    }
}