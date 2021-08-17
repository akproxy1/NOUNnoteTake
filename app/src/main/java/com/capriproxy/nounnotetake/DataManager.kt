package com.capriproxy.nounnotetake

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        intializeNotes()

    }

    private fun initializeCourses() {
        var course = CourseInfo("GST101", "General Studies")
        courses[course.courseId] = course

        course = CourseInfo(title = "Computer Language Introduction", courseId = "CIT101")
        courses[course.courseId] = course

        course = CourseInfo("MTH101", "Mathematics Introduction")
        courses[course.courseId] = course

        course = CourseInfo("BIO101", "Introduction to Biology")
        courses[course.courseId] = course
    }

    private fun intializeNotes() {
        var course = courses["GST101"]!!
        var note = NoteInfo(course, "General studies",
            "Wow, this is one of gst guide in this")
        notes.add(note)

        note = NoteInfo(course, "Delegating intents",
            "gst elegate much more than just a component invocation")
        notes.add(note)

        course = courses["CIT101"]!!
        note = NoteInfo(course, "Basic of computer",
            "computer is one of the basic thing that make life easier")
        notes.add(note)

        notes.add(NoteInfo(course, "cit Long running operations",
            "Foreground Services can be tied to a notification icon"))

        course = courses["MTH101"]!!
        note = NoteInfo(course, "mth Parameters",
            "mth Leverage variable-length parameter lists")
        notes.add(note)

        course = courses["BIO101"]!!
        note = NoteInfo(course, "bio1 Compiler options",
            "bio1 The -jar option isn't compatible with with the -cp option")
        notes.add(note)
        note = NoteInfo(course, "bio2 Serialization",
            "bio2 Remember to include SerialVersionUID to assure version compatibility")
        notes.add(note)
    }


}


