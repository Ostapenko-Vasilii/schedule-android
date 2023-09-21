package com.pvstudio.schedule.data

import java.util.Date

data class DayData(
    var date: Date,
    var dayOfTheWeek: Int,
    var status: Int,
    var lessonList: List<LessonData>
)
