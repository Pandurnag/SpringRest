package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	 public CourseServiceImpl() {
		
		list=new ArrayList<>();
		list.add(new Course(145,"Java Core Course","this course contains basic of java"));
		list.add(new Course(4343,"spring boot course","creating rest api using spring boot"));
		
	}

	
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}




	@Override
	public Course getCourse(long courseId) {
		
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		
		// TODO Auto-generated method stub
		return c;
	}

}
