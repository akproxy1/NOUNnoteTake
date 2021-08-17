package com.capriproxy.nounnotetake

data class CourseInfo(val courseId: String, val title: String) {

    override fun toString(): String {
        return "$courseId-$title"
    }
}

data class NoteInfo(var course: CourseInfo, var title: String, var text: String)