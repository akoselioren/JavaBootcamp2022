package business;

import dataAccess.InstructorDao;
import entities.Instructor;
import logging.Logger;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		System.out.println("Egitmen eklendi");

		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorFirstName());
		}

	}
}
