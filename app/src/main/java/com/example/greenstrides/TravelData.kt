package com.example.greenstrides

import java.util.*

class TravelData {
    var distance: Number? =null
    var activityType: String? = null
    var confidence: String? = null
    var timestamp: Date? = null
    var co2: Number? = null
    var averagePersonEmit: Number? = null
    var personalGoal: Number? = null

    constructor() : super() {}

    constructor(distance: Number,
                activityType: String,
                confidence: String,
                timestamp: Date,
                co2: Number,
                averagePersonEmit: Number,
                personalGoal: Number) : super() {
        this.distance = distance
        this.activityType = activityType
        this.confidence = confidence
        this.timestamp = timestamp
        this.co2 = co2
        this.averagePersonEmit = averagePersonEmit
        this.personalGoal = personalGoal
    }
}