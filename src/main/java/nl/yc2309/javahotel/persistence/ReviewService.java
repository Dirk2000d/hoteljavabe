package nl.yc2309.javahotel.persistence;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2309.javahotel.domein.Review;

@Service
public class ReviewService {
	// Has relatie met Kamer repository
	@Autowired
	ReviewRepository rr;
	
	// methode
	public Iterable<Review> geefAlleReviews() {
		return rr.findAll();
	}

	public Review slaReviewOp(Review review) {
		review.setDatum(LocalDate.now());
		return rr.save(review);
	}
	
	public Review updateReview(Review review) {
		System.out.println("update review");
		return rr.save(review);
	}

	public void verwijderReview(long reviewid) {
		rr.deleteById(reviewid);
		
	}
	
}
