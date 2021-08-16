package com.capriproxy.nounnotetake

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        intializeNotes()
    }

    private fun intializeNotes() {
        TODO("Not yet implemented")
    }

    private fun initializeCourses() {
        var course = CourseInfo("GST101", "General Studies")
        courses[course.courseId] = course

        course = CourseInfo(title = "Computer Language Introduction", courseId = "CIT101")
        courses[course.courseId] = course

        course = CourseInfo("MTH101", "Mathematics Introduction")
        courses[course.courseId] = course

        course = CourseInfo("CHM101", "Introduction to Chemistry")
        courses[course.courseId] = course

        course = CourseInfo("BIO101", "Introduction to Biology")
        courses[course.courseId] = course
    }

}