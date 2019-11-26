package com.example.movieratingservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieratingservice.model.Rating;
import com.example.movieratingservice.model.UserRating;

@RestController
@RequestMapping("/rating")
public class MovieRatingResource {

	@GetMapping("/{movieId}")
	public Rating getMovieRating(@PathVariable ("movieId") int id){
		
		return new Rating (id, "4");
		
	}
	
	@GetMapping("/user/{userId}")
	public UserRating getUserRatings(@PathVariable ("userId") String userId){
		
		List<Rating> rating = Arrays.asList(new Rating(1,"4"),
				new Rating(2,"3"),
				new Rating (3,"2"));
		
		UserRating userRating = new UserRating();
		userRating.setUserRating(rating);
		return userRating;
	}
	
	
}
