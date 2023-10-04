package nl.yc2309.javahotel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.yc2309.javahotel.domein.Review;
import nl.yc2309.javahotel.persistence.ReviewService;

@RestController
public class ReviewEndpoint {
	@Autowired
	ReviewService rs;
	
	@GetMapping("dereviews")
	public Iterable<Review> alleReviews(){
		return rs.geefAlleReviews();
	}
	
	@PostMapping("voegreviewtoe")
	public String alleReviews(@RequestBody Review review) {
		rs.slaReviewOp(review);
		return "review toegevoegd";
	}
	
	@PutMapping("updatereview")
	public Review updateReview(@RequestBody Review review) {
		return rs.updateReview(review);
	}
	
	@DeleteMapping("verwijderreview/{reviewid}")
	public void verwijderReview(@PathVariable("reviewid") int reviewid) {
		rs.verwijderReview(reviewid);
	}
}
