package com.elena.vma.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;

import com.elena.vma.entities.Project;


@SpringBootTest
@RunWith(SpringRunner.class)

public class ProjectRepositoryIntegrationTest {
	
	@Autowired
	ProjectRepository proRepo;
	
	@Test
	public void ifNewProjectSaved_thenSuccess() {
		Project newProject = new Project("New Test Project", "COMPLETE", "Test Description");
		proRepo.save(newProject);
		
		assertEquals(5, proRepo.findAll().size());
				
	}
}