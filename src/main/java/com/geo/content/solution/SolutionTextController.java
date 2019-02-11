package com.geo.content.solution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/solution")
public class SolutionTextController {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(SolutionTextController.class);
	
	@GetMapping("/text")
	public String getSolutionText() {
		LOG.debug("SolutionTextController - getSolutionText()");
		return new String("Test");
	}

}
