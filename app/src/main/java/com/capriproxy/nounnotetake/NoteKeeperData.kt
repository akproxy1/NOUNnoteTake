package com.capriproxy.nounnotetake

class CourseInfo(val courseId: String, val title: String) {
    override fun toString(): String {
        return "$courseId-$title"
    }
}

class NoteInfo(var course: CourseInfo, var title: String, var text: String)