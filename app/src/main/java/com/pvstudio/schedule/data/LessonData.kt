package com.pvstudio.schedule.data

import java.util.Date

data class LessonData(
    var id: Int,
    var lesName: String,
    var startPoint: Date,
    var duration: Int,
    var teacherName: String,
    var homeWork: String,
    var lessonNumber: Int,
    var lessonType: String,
    var teacherData: String,
    var isEnd: Boolean
)
