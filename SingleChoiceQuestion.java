
public class SingleChoiceQuestion implements QuestionInterface
{
	private int numOptions;
	
	public SingleChoiceQuestion(int nOpts)
	{
		numOptions = nOpts;
	}
	
	// generates answer with a single randomly selected option
	public boolean[] generateAnswer()
	{
		boolean[] answer = new boolean[numOptions];
		int r = (int)(Math.random()*answer.length);
		answer[r] = true;
		return answer;
	}
	
	public int getNumOptions()
	{
		return numOptions;
	}
}
