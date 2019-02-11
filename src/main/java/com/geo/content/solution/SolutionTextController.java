package com.geo.content.solution;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/solution")
public class SolutionTextController {
	
	@GetMapping("/text")
	public String getSolutionText() {
		return "Solution Text";
	}
	
	@GetMapping("/context")
	public String getSolutionContext() {
		return "Solution Context";
	}

}
