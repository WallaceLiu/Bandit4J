import java.util.*;

/**
  * Basic interface for Bandit Algorithms: Should be able to, given a choice of
  * k arms, select one of them, and then update based on the observed reward.
  */
public interface BanditAlgorithm {
	// Choose an arm, given a choice of k arms.
	public Article chooseArm(User user, List<Article> articles);

	// Observe a reward when a given arm is pulled.
	public void updateReward(User user, Article a, boolean clicked);

	default public void updateReward(User user, Article a, Integer click){
		System.out.println("default");
	}
}
