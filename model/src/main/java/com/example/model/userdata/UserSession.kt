package com.example.model.userdata

import com.example.model.Session
import com.example.model.SessionType

/**
 * Wrapper class to hold the [Session] and associating [UserEvent].
 */
data class UserSession(
    val session: Session,
    val userEvent: UserEvent
) {

    fun isPostSessionNotificationRequired(): Boolean {
        return userEvent.isReserved() &&
                !userEvent.isReviewed &&
                session.type == SessionType.SESSION
    }
}
