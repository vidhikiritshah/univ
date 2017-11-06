package vihdi.univ;

import junit.framework.TestCase;

public class CourseTest extends TestCase {

	public void testCourseTitle() {
		Course course = new Course(true, 1, 2, true, 26, "Database", 123456);
		assertEquals("Database", course.title());
	}
}
