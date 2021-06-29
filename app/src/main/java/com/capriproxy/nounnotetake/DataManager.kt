package com.capriproxy.nounnotetake

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("GST101", "General Studies")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Computer Language Introduction", courseId = "CIT101")
        courses.set(course.courseId, course)

        course = CourseInfo("MTH101", "Mathematics Introduction")
        courses.set(course.courseId, course)

        course = CourseInfo("CHM101", "Introduction to Chemistry")
        courses.set(course.courseId, course)
    }

}